package data;

public interface Calc {
    ImaginaryCalc AdditionOperation(ImaginaryCalc num1, ImaginaryCalc num2);
    ImaginaryCalc SubtractionOperation(ImaginaryCalc num1, ImaginaryCalc num2);
    ImaginaryCalc MultiplicationOperation(ImaginaryCalc num1, ImaginaryCalc num2);
    ImaginaryCalc DivisionOperation(ImaginaryCalc num1, ImaginaryCalc num2);
}
