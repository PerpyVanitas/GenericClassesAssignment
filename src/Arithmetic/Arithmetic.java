package Arithmetic;

public class Arithmetic<T extends Number, U extends Number> {
    private final T num1;
    private final U num2;

    public Arithmetic(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
