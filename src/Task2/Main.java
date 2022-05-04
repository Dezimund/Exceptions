package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        double[] a = new double[5];

        System.out.println("Input cost for 5 days");
        for (int i = 0; i < 5; i++) {
            a[i] = Double.parseDouble(READER.readLine());
        }

        System.out.println("Input index");
        try{
            for (int i = 0; i < 5; i++) {
                i = Integer.parseInt(READER.readLine());
                System.out.println(a[i-1] + "$");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }





    }
    }
