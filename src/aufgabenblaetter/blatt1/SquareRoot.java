package aufgabenblaetter.blatt1;

import java.lang.String;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        float value = userInput();
        float _result = squareRootCalculation(value);
        Console.log("This is the result as a float " + _result);
        Integer result = Math.round(_result); // parse to nearest integer
        Console.log("Result as an integer: " + result);
    }

    static float userInput() {
        System.out.println("Please provide a positive real number to determine its square root.");
        String input;
        while (true) {
            try {
                Scanner inputStream = new Scanner(System.in);
                input = inputStream.next();
                Console.log("Provided value: " + input);
                if(Float.parseFloat(input)>0){
                    break;
                }
                else {
                    Console.log("Provided value is not greater than zero. Try again.");
                }
            } catch (Exception err) {
                err.printStackTrace();
                Console.log("Provided value is invalid. Please provide a positive real number of type integer.");
            }
        }
        return Float.parseFloat(input);
    }

    private static float squareRootCalculation(float value) {
        float prev = value; // with primitive
        float cur = -1;
        do {
            prev = (cur != -1) ? cur : prev;
            cur = (prev + (value / prev)) / 2;
        } while ((prev - cur) > 0.001);
        return cur;
    }
}
