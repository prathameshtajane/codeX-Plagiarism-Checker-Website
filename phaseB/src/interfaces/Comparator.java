package interfaces;

import EntityClasses.ASTClass;

/**
 *  This is an interface which has method(s) to provide functionality to
 *  compare two ASTs.
 *  All the classes implementing this interface should provide implementation for
 *  all the methods declared in this interface.
 */
public interface Comparator {

    /**
     * This method compares given to two AST's and generates a string
     * representing the comparision of passed AST's.
     * @param firstAST AST object genearted after parsing code file
     * @param secondAST AST object genearted after parsing code file
     */
    String compare(ASTClass firstAST, ASTClass secondAST);
}
