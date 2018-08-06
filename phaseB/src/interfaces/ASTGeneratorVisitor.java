package interfaces;

import EntityClasses.ASTClass;

/**
 *  This is an interface which has method(s) to provide functionality to
 *  to generate AST of language specific tokens.
 *  All the classes implementing this interface should provide implementation for
 *  all the methods declared in this interface.
 */
public interface ASTGeneratorVisitor {

    /**
     * This method accepts language specific tokens and generates AST
     * based on those tokens
     * @param pythonParser An object of type Parser
     * @return ASTClass representing AST of given ParserVisitable object
     */
    ASTClass generateASTVisit(ParserVisitable pythonParser);
}
