package ar.com.patterns.behavioral.interpreter;

public class OrExpression implements Expression {

    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String text) {
        System.out.print(text + " ");
        return expr1.interpreter(text) || expr2.interpreter(text);
    }
}
