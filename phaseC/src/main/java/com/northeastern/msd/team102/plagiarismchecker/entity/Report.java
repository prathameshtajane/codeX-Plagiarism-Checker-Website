package com.northeastern.msd.team102.plagiarismchecker.entity;
import javax.persistence.*;

/**
 * Report entity.
 */
@Entity
public class Report {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "report1_file1_association"))
    private File file1;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "report1_file2_association"))
    private File file2;

    @Column(name = "percentageCompareHashMap")
    private double percentageCompareHashMap;

    @Column(name = "percentageCompareTrees")
    private double percentageCompareTrees;

    @Column(name = "percentageCompareLevenshteinDistance")
    private double percentageCompareLevenshteinDistance;

    @Column(name = "percentageCompareAll")
    private double percentageCompareAll;

    /**
     * Constructor for Report class
     * @param file1 file for User1
     * @param file2 file for User1
     * @param percentageCompareHashMap percentage plagiarism for the two files using HashMap.
     * @param percentageCompareTrees percentage plagiarism for the two files using Trees.
     * @param percentageCompareLevenshteinDistance percentage plagiarism for the two files using LevenshteinDistance.
     * @param percentageCompareAll percentage plagiarism for the two files using weighted Comparison.
     */
    public Report(File file1, File file2,
                  double percentageCompareHashMap, double percentageCompareTrees,
                  double percentageCompareLevenshteinDistance, double percentageCompareAll) {
        this.file1 = file1;
        this.file2 = file2;
        this.percentageCompareHashMap = percentageCompareHashMap;
        this.percentageCompareTrees = percentageCompareTrees;
        this.percentageCompareLevenshteinDistance = percentageCompareLevenshteinDistance;
        this.percentageCompareAll = percentageCompareAll;
    }

    /**
     * Default constructor
     */
    public Report() {

    }

    /**
     * Getter for reportId.
     * @return returns the Id of the generated report.
     */
    public long getId() {
        return id;
    }

    /**
     * Setter for reportId.
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for plagiarism percentage for the two files.
     * @return double percentage.
     */
    public double getPercentageCompareHashMap() {
        return percentageCompareHashMap;
    }

    /**
     * Setter for plagiarism percentage for the two files.
     * @param percentageCompareHashMap
     */
    public void setPercentageCompareHashMap(double percentageCompareHashMap) {
        this.percentageCompareHashMap = percentageCompareHashMap;
    }

    /**
     * Getter for plagiarism percentage for the two files.
     * @return double percentage.
     */
    public double getpercentageCompareTrees() {
        return percentageCompareTrees;
    }

    /**
     * Setter for plagiarism percentage for the two files.
     * @param percentageCompareTrees
     */
    public void setpercentageCompareTrees (double percentageCompareTrees) {
        this.percentageCompareTrees = percentageCompareTrees;
    }

    /**
     * Getter for plagiarism percentage for the two files.
     * @return double percentage.
     */
    public double getpercentageCompareLevenshteinDistance() {
        return percentageCompareLevenshteinDistance;
    }

    /**
     * Setter for plagiarism percentage for the two files.
     * @param percentageCompareLevenshteinDistance
     */
    public void setpercentageCompareLevenshteinDistancep (double percentageCompareLevenshteinDistance) {
        this.percentageCompareLevenshteinDistance = percentageCompareLevenshteinDistance;
    }

    /**
     * Getter for plagiarism percentage for the two files.
     * @return double percentage.
     */
    public double getPercentageCompareAll() {
        return percentageCompareAll;
    }

    /**
     * Setter for plagiarism percentage for the two files.
     * @param percentageCompareAll
     */
    public void setPercentageCompareAll(double percentageCompareAll) {
        this.percentageCompareAll = percentageCompareAll;
    }

    /**
     * Getter for file for User1.
     * @return file for user1.
     */
    public File getFile1() {
        return file1;
    }

    /**
     * Setter for file for User1.
     * @param file1
     */
    public void setFile1(File file1) {
        this.file1 = file1;
    }

    /**
     * Getter for file for User2.
     * @return file for user2.
     */
    public File getFile2() {
        return file2;
    }

    /**
     * Setter for file for User2.
     * @param file2
     */
    public void setFile2(File file2) {
        this.file2 = file2;
    }

}
