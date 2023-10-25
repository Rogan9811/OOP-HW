package data;

public class ImaginaryCalc {
    private double imagineNum;
    private double validNum;

    public ImaginaryCalc(double imagineNum, double validNum) {
        this.imagineNum = imagineNum;
        this.validNum = validNum;
    }

    public double getImagineNum() {
        return imagineNum;
    }

    public double getValidNum() {
        return validNum;
    }

    @Override
    public String toString() {
        return imagineNum + "+" + validNum + "i";
    }
}
