package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import java.net.URISyntaxException;

/**
 * @version 1.0
 * @description directs to appropriate selected comparison strategy
 */
public class Context {
    private CompareStrategy strategy;

    /**
     * @param strategy : CompareStrategy reference
     */
    public Context(CompareStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * @param file1 : byte array
     * @param file2 : byte array
     * @return percent similarity
     * @throws URISyntaxException
     */
    public double executeStrategy (byte[] file1, byte[] file2) throws URISyntaxException {
        return strategy.compareFiles(file1, file2);
    }
}
