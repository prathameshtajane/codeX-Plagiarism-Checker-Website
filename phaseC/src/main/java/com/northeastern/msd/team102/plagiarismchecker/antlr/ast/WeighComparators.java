package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Jama.Matrix;

/**
 * @version 1.0
 * @description linear regression using normal equations to assign learned weights to each algorithm
 */
public class WeighComparators {
	
	/**
	 * logger - to log data to file
	 */
	private Logger logger;
	
	/**
	 * dataX - to store input feature data from TrainingData.csv file (refer columns index: 2,3,4)
	 */
	private List<ArrayList<Double>> dataX;
	
	/**
	 * dataY - to store output class data from TrainingData.csv file (refer columns index: 5)
	 */
	private List<Double> dataY;
	
	/**
	 * weightsAll - to store weights to be assigned to each algorithm
	 * index 0 : Hashmap, index 1: Levenshtein, index 2: Tree
	 */
	private double[] weightsAll;
	
	/**
	 * noOfComparators - to store count of total number of comparators in the system
	 */
	private int noOfComparators;
	
	WeighComparators() throws URISyntaxException {
		logger = Logger.getLogger(WeighComparators.class.getName());
		this.dataX = new ArrayList<>();
		this.dataY = new ArrayList<>();
		this.noOfComparators = 0;
		readCSV();
		this.weightsAll = computeMatrixAll(dataX);
	}
	
	/**
	 * @description reads training data from csv file
	 */
	private void readCSV() throws URISyntaxException {
		logger.log(Level.INFO, "Reading training data");
        String line = "";
        String cvsSplitBy = ",";
        URL resource = WeighComparators.class.getClassLoader().getResource("TrainingData.csv");
		String filepath = Paths.get(resource.toURI()).toFile().getAbsolutePath();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((line = br.readLine()) != null) {
                String[] trainRow = line.split(cvsSplitBy);
                this.noOfComparators = trainRow.length-3;
                List<Double> row = new ArrayList<>();
                for (int i = 2; i<trainRow.length-1; i++) {
                	row.add(Double.parseDouble(trainRow[i]));
                }
                this.dataX.add((ArrayList<Double>) row);
                this.dataY.add(Double.parseDouble(trainRow[trainRow.length-1]));
            }
        } catch (Exception e) {
        	logger.log(Level.SEVERE, "Exception : {0}",e);
        } 
        this.weightsAll = new double[noOfComparators];
	}
	
	/**
	 * @param data : List - input training feature data
	 * @return weights for each algorithm
	 */
	private double[] computeMatrixAll(List<ArrayList<Double>> data) {
		double[][] dataXArr = new double[data.size()][data.get(0).size()];
		int i = 0;
		for (ArrayList<Double> d : data) {
			for (int j = 0; j < data.get(0).size(); j++) {
				dataXArr[i][j] = d.get(j);
			}
			i++;
		}		
		double[][] dataYArr = new double[dataY.size()][1];
		i = 0;
		for (Double d : dataY) {
			dataYArr[i][0] = d;
			i++;
		}
		Matrix x = new Matrix(dataXArr); 
		Matrix y = new Matrix(dataYArr);
		Matrix xMul2 = x.transpose().times(x).inverse().times(x.transpose());
		Matrix wTrain = xMul2.times(y);		
		double[][] w = wTrain.getArray();
		double[] weights = new double[this.noOfComparators];
		for (int p = 0; p< w.length; p++) {
			weights[p] = w[p][0];
		}
		return weights;
	}
	
	/**
	 * @param total : double array
	 * @return final adjusted output after applying weights learnt by training data
	 */
	public double getFinalPredictedOutputAll(double[] total) {
		double output = 0;
		for (int i = 0; i < total.length; i++) {
			output += total[i]*this.weightsAll[i];
		}
		return (output > 100) ? 100.00 : output;
	}
	
}
