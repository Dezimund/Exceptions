package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        try {
            System.out.println("Input number x.x");
            double a = Double.parseDouble(READER.readLine());
        }catch (NumberFormatException e){
            System.out.println("Warning :" + e);
        }

    }
}
