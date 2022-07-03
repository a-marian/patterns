package ar.com.patterns.behavioral.interpreter;

public class ScannerExpression implements Expression {

    String data;

    public ScannerExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String text) {
        return text.contains(data);
    }
}
