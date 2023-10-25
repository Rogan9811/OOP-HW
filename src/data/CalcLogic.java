package data;

public class CalcLogic implements Calc {
    @Override
    public ImaginaryCalc AdditionOperation(ImaginaryCalc num1, ImaginaryCalc num2) {
        double validSum = num1.getValidNum() + num2.getValidNum();
        double imaginarySum = num1.getImagineNum() + num2.getImagineNum();
        return new ImaginaryCalc(validSum, imaginarySum);
    }

    @Override
    public ImaginaryCalc SubtractionOperation(ImaginaryCalc num1, ImaginaryCalc num2) {
        double validSub = num1.getValidNum() - num2.getValidNum();
        double imagneSub = num1.getImagineNum() - num2.getImagineNum();
        return new ImaginaryCalc(validSub, imagneSub);
    }

    @Override
    public ImaginaryCalc MultiplicationOperation(ImaginaryCalc num1, ImaginaryCalc num2) {
        double validMul = num1.getValidNum() * num2.getValidNum() - num1.getImagineNum() * num2.getImagineNum();
        double imagineMul = num1.getValidNum() * num2.getImagineNum() + num1.getImagineNum() * num2.getValidNum();
        return new ImaginaryCalc(validMul, imagineMul);
    }

    @Override
    public ImaginaryCalc DivisionOperation(ImaginaryCalc num1, ImaginaryCalc num2) {
        double doubl = num2.getValidNum() * num2.getValidNum() + num2.getImagineNum() * num2.getImagineNum();
        if (doubl == 0) throw new ArithmeticException("Division by zero! Enter new second num: ");
        double validDiv = (num1.getValidNum() * num2.getValidNum() + num1.getImagineNum() * num2.getImagineNum()) / doubl;
        double imagineDiv = (num1.getImagineNum() * num2.getValidNum() - num1.getValidNum() * num2.getImagineNum()) / doubl;
        return new ImaginaryCalc(validDiv, imagineDiv);
    }

    public double parseImaginaryPart (String input)
    {
        int index = input.startsWith("-") || input.startsWith("+") ? 2 : 1;
        String res = input.split("[+-]")[index].replaceAll("i", "").trim();
        return input.matches("(.)-[0-9.]+i") ? Double.parseDouble(res) * (-1) : Double.parseDouble(res);

    }

    public double parseRealPart(String num){
        if(num.startsWith("-") || num.startsWith("+")) return Double.parseDouble(num.split("[+-]")[1].trim()) * (-1);
        else return Double.parseDouble(num.split("[+-]")[0].trim());
    }
}
