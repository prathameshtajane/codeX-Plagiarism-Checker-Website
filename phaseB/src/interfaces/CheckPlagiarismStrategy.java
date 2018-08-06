package interfaces;

/**
 *  This is an interface which has method(s) to provide functionality to
 *  execute specific strategy to implement plagiarism detection
 *  All the classes implementing this interface should provide implementation for
 *  all the methods declared in this interface.
 */
public interface CheckPlagiarismStrategy {

    /**
     * This method executes specific plagiarism strategies
     */
    void executeStrategy();
}
