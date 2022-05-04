package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input money on balance");
        double balance = Double.parseDouble(READER.readLine());
        System.out.println("Your balance : " + balance + "$");

        try {
            System.out.println("Input cost");
            double cost = Double.parseDouble(READER.readLine());
            if(cost<=balance){
                System.out.println("Successfully bought");
                System.out.println("Balance " + (balance - cost) + "$");
            }

            throw new Exception();
        }catch (Exception e){
            System.out.println("Not enough on balance");
        }



    }



}
