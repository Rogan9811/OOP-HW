package controller;

import Service.CalcLogger;
import Service.CalcService;
import data.Calc;
import data.ImaginaryCalc;
import view.View;

public class Controller {
        private View view;
        private CalcService calcService;
        private Calc calc;
        private CalcLogger logger;

    public Controller(View view, CalcService calcService, Calc calc, CalcLogger logger) {
        this.view = view;
        this.calcService = calcService;
        this.calc = calc;
    }

    public void srart(){
        boolean run = true;
        while (run){
            view.consoleMenu();
            String chose = view.input();
            switch (chose){

                case "1": additionOperation();
                break;

                case "2": substractionOperation();
                break;

                case "3": multiplicationOperation();
                break;

                case "4": divisionOperation();
                break;

                case "5": read();
                break;

                case "6": run = false;
                break;

                default:
                    System.out.println("Chose operation: ");
            }
        }
    }

    private void read() {
        CalcLogger logger = new CalcLogger();
        String log = logger.read();
        System.out.println(log);
    }

    public void additionOperation(){
        System.out.println("First num");
        ImaginaryCalc num1 = calcService.enterComplexNum();
        System.out.println(num1);
        System.out.println("Second num");
        ImaginaryCalc num2 = calcService.enterComplexNum();
        System.out.println(num2);
        ImaginaryCalc sum = calc.AdditionOperation(num1, num2);
    }

    public void substractionOperation(){
        System.out.println("First num");
        ImaginaryCalc num1 = calcService.enterComplexNum();
        System.out.println(num1);
        System.out.println("Second num");
        ImaginaryCalc num2 = calcService.enterComplexNum();
        System.out.println(num2);
        ImaginaryCalc sum = calc.SubtractionOperation(num1, num2);
    }

    public void multiplicationOperation(){
        System.out.println("First num");
        ImaginaryCalc num1 = calcService.enterComplexNum();
        System.out.println(num1);
        System.out.println("Second num");
        ImaginaryCalc num2 = calcService.enterComplexNum();
        System.out.println(num2);
        ImaginaryCalc sum = calc.MultiplicationOperation(num1, num2);
    }

    public void divisionOperation(){
        System.out.println("First num");
        ImaginaryCalc num1 = calcService.enterComplexNum();
        System.out.println(num1);
        System.out.println("Second num");
        ImaginaryCalc num2 = calcService.enterComplexNum();
        System.out.println(num2);
        ImaginaryCalc sum = calc.DivisionOperation(num1, num2);
    }
}
