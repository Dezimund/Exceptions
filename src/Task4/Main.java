package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException,ColdEx,HotEx {

        System.out.println("Input temperature");
        double temp = Double.parseDouble(READER.readLine());

        if(temp<-10){
            throw new ColdEx();
        }else if (temp>35){
            throw new HotEx();
        }else{
            System.out.println("Working");
        }



    }


}
