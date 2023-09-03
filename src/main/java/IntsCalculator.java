public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    // Общая логика вызова подходящих методов из класса Calculator
    private int doOperation(int a, int b, Calculator.Operation operation) {
        Calculator.Formula formula = new Calculator.Formula();

        formula.addOperand(a);
        formula.addOperand(b);
        formula.calculate(operation);

        return formula.result.intValue();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return doOperation(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return doOperation(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int a, int b) {
        return doOperation(a, b, Calculator.Operation.POW);
    }

    public int div(int a, int b) {
        return doOperation(a, b, Calculator.Operation.DIV);
    }

    public int sub(int a, int b) {
        return doOperation(a, b, Calculator.Operation.SUB);
    }
}