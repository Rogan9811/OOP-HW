package Service;

import data.CalcLogic;
import data.ImaginaryCalc;

import java.util.Scanner;

public class CalcService {
    private CalcLogic calcLogic;
    private Scanner scanner;

    public CalcService(CalcLogic calcLogic) {
        this.calcLogic = calcLogic;
        scanner = new Scanner(System.in);
    }
    public boolean isValide(String num){
        String numPattern = "-?\\d+(\\.\\d+)?\\s*[+-]\\s*\\d+(\\.\\d+)?[iI]";
        if (num.matches(numPattern)) return true;
        else{
            System.out.println("Error. Incorrect format complex num.");
            return false;
        }
    }

    public ImaginaryCalc enterComplexNum(){
        System.out.print("Enter num(format a + bi): ");
        String num = scanner.nextLine().trim();
        while (!isValide(num)){
            System.out.print("Incorrect number. Please, try again: ");
            num = scanner.nextLine().trim();
        }

        double validNum = calcLogic.parseRealPart(num);
        double imagineNum = calcLogic.parseImaginaryPart(num);
        return new ImaginaryCalc(validNum, imagineNum);
    }


}
