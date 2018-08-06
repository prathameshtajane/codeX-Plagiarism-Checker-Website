package interfaces;

import EntityClasses.ASTClass;

/**
 *  This is an interface which has method(s) to provide functionality to
 *  generate language specific tokens and AST.
 *  All the classes implementing this interface should provide implementation for
 *  all the methods declared in this interface.
 */
public interface ParserVisitable {
    /**
     * This method returns an AST representation of given language specific parser
     * file
     * @return AST representation of passed language parser object
     */
    ASTClass accept(ASTGeneratorVisitor languageParser);
}
