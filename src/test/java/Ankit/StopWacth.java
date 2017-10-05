package Ankit;

import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
public class StopWacth
{
    public static void main( String[] args ) throws IOException {
        int x = 10; // wait 2 seconds at most

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < x * 1000
                && !in.ready()) {
        }

        if (in.ready()) {
            System.out.println("You entered: " + in.readLine());
        } else {
            System.out.println("You did not enter data");
        }

    }


}