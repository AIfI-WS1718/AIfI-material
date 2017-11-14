package aufgabenblaetter.blatt1;

import java.lang.String;
import java.util.Scanner;

/* 
 * Feedback, tt, 14.11.: 
 * Sehr schön! Sauberer Stil und funktionaler Code. Hier und da kleine Anmerkungen, wie es noch besser wird. :)
 */
public class SquareRoot {

    public static void main(String[] args) {
        float value = userInput();
        /* tt, 14.11.: Variablen mit '_' anfangen zu lassen ist unüblich. 
         * Unterstriche verwendet man eigentlich nur bei Konstanten, um Wörter zu trennen (z.B. DIES_IST_EINE_KONSTANTE)
         */
        float _result = squareRootCalculation(value);
        Console.log("This is the result as a float " + _result);
        Integer result = Math.round(_result); // parse to nearest integer
        Console.log("Result as an integer: " + result);
    }

    /* tt, 14.11.: schön, dass du das aus der Übung aufgegriffen hast! 
     * Hast du mal probiert was du ändern musst, damit man es nicht immer neu starten muss, sondern gleich die nächste Abfrage kommt?
     */
    static float userInput() {
        System.out.println("Please provide a positive real number to determine its square root.");
        String input;
        while (true) {
            try {
                Scanner inputStream = new Scanner(System.in);
                input = inputStream.next();
                /* tt, 14.11.: du hast vergessen, die Eingabe zu beenden. Eclipse sollte dazu normaler Weise auch ein Warning anzeigen:
                 * inputStream.close();
                 */
                Console.log("Provided value: " + input);
                if(Float.parseFloat(input)>0){
                    break;
                }
                else {
                    Console.log("Provided value is not greater than zero. Try again.");
                }
            } catch (Exception err) {
                err.printStackTrace();
                // tt, 14.11.: du erlaubst doch float, nicht nur integer ;)
                Console.log("Provided value is invalid. Please provide a positive real number of type integer.");
            }
        }
        return Float.parseFloat(input);
    }

    private static float squareRootCalculation(float value) {
    		// tt, 14.11.: funktioniert, aber dauert länger. eigentlich solltet ihr mit a/2, also hier value/2 starten.
        float prev = value; // with primitive
        float cur = -1;
        do {
        		/* tt, 14.11.: schön, du hast den Fragezeichenoperator verstanden! :) 
        		 * wenn du cur oben auch mit dem Anfangswert initialisierst, kannst du dir die Abfrage hier aber ganz sparen und stattdessen: prev=cur setzen.
        		 * Probier es mal.
        		 */
            prev = (cur != -1) ? cur : prev;
            cur = (prev + (value / prev)) / 2;
        } while ((prev - cur) > 0.001); // tt, 14.11.: eine Null vergessen... 0.0001
        return cur;
    }
}
