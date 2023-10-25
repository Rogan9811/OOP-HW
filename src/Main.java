import Service.CalcLogger;
import Service.CalcService;
import controller.Controller;
import data.Calc;
import data.CalcLogic;
import view.View;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Calc calc = new CalcLogic();
        CalcLogic logic = new CalcLogic();
        CalcLogger logger = new CalcLogger();
        CalcService service = new CalcService(logic);

        Controller controller = new Controller(view, service, calc, logger);
        controller.srart();
    }
}