import javax.swing.*;
import java.util.Scanner;

public class MainClass {

    static JFrame frame;

    static void message(String company, double min, double text){
        frame = new JFrame();
        JOptionPane.showMessageDialog(frame, company + "'s Minutes Cost: " + min + "\n" + company + "'s text Cost: " + text);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Reading User Input
        System.out.println("Please Enter Number of Minutes: ");
         float minutes = input.nextFloat();


         //Reading User Input
        System.out.println("Please Enter Number of Text: ");
        float texts = input.nextFloat();



        //Calculation for AB&C Company
       double ABC_call_cost = (minutes - 100) * 0.03;
       double ABC_text_cost = texts * 0.05;


        //Calculation for Horizon Company
        double horizon_call_cost = (minutes - 100) * 0.03;
        double horizon_text_cost = texts * 0.05;



        //Calculation for Tint Company
        double tint_call_cost = (minutes - 100) * 0.03;
        double tint_text_cost = texts * 0.05;


        //Printing result to console
        System.out.println("AB&C's minuets cost: " + ABC_call_cost);
        System.out.println("AB&C's Text Cost: " + ABC_text_cost);

        System.out.println("Horizon's minuets cost: " + horizon_call_cost);
        System.out.println("Horizon's Text Cost: " + horizon_text_cost);

        System.out.println("Tint's minuets cost: " + tint_call_cost);
        System.out.println("Tint's Text Cost: " + tint_text_cost);

        //Printing to JOptionPane
        message("AB&C", ABC_call_cost, ABC_text_cost );
        message("Horizon", horizon_call_cost, horizon_text_cost);
        message("Tint", tint_call_cost, horizon_text_cost);

    }
}
