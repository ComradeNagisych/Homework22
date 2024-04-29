package tv.ksstream.calculator.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import tv.ksstream.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping ("/plus")
    public String sumNumbers(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(calculatorService.plus(num1, num2));
    }
    @GetMapping ("/minus")
    public String differenceNumbers(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(calculatorService.minus(num1, num2));
    }
    @GetMapping ("/multiply")
    public String resultNumbers(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(calculatorService.multiply(num1, num2));
    }
    @GetMapping ("/divide")
    public String divisionNumbers(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "No division by zero";
        }
        return String.valueOf(calculatorService.divide(num1, num2));
    }
}
