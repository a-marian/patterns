package ar.com.patterns.behavioral.interpreter;

import ar.com.patterns.behavioral.state.Context;

/**
 * Use Interpreter pattern to build an interpreter for a language.
 * TWhen you need to implement a simple language, the interpreter pattern defines a class-based
 * representation for its grammar along with an interpreter to interpreter its sentences.
 * To represent the language, you use a class to represent each rule in the language.
 * Appropriate when you have a simple grammar and simplicity is more important than efficiency.
 * Used for scripting and programming languages.
 * This pattern can become cumbersome when the number of grammar rules is large. In these cases
 *  a parser/compiler generator may be more appropriate.
 * */

public class InterpreterMain {

    class UserClient {
        private Context context;
        public UserClient (Context context){
            this.context = context;
        }
    }

    public static void main(String[] args) {
        Expression expression1 = new ScannerExpression("Trinidad");
        Expression expression2 = new ScannerExpression("Tobago");
        Expression firstExpression = new AndExpression(expression1, expression2);


        Expression expression11 = new ScannerExpression("Argentina");
        Expression expression22 = new ScannerExpression("Bolivia");
        Expression secondExpression = new OrExpression(expression11, expression22);

        System.out.println(firstExpression.interpreter("Trinidad, Tobago"));
        System.out.println(firstExpression.interpreter("Tobago, Cuba"));
        System.out.println(firstExpression.interpreter("Tobago, Trinidad"));

        System.out.println(secondExpression.interpreter("Argentina"));
        System.out.println(secondExpression.interpreter("Bolivia"));
        System.out.println(secondExpression.interpreter("Brazil"));

    }
}
