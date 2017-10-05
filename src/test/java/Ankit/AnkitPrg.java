package Ankit;

import java.util.Scanner;

/**
 * Created by JSBot on 23-Sep-17.
 */
public class AnkitPrg {

   static int z ;

    public void game() {
           z=0;

        System.out.println("Q1-who is the president of india 2017.");
        String[] array = {"Narendra Modi", "Ram Nath Kovind", "Amit Shah", "Shalman Khan"};
        String A = array[0];
        String B = array[1];
        String C = array[2];
        String D = array[3];
        System.out.println("A-" + A + "   " + "B-" + B);
        System.out.println("C-" + C + "   " + "D-" + D);
        System.out.println("Select Your Answer Like A-B-C-D");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        if (ans.equals("B") || ans.equals("b")) {
            z = z+ 10;
            System.out.println("#Right Answer#"+ z +" Point");

        } else {
            System.out.println("Wrong Answer!==Right Answer is " + B);
        }
        AnkitPrg ap = new AnkitPrg();
        ap.game1();
    }
    public void game1() {

        System.out.println("z = " + z);

        System.out.println("Q2-DSL is an example of a(n) ____________ connection.");
        String[] array = {"network", "wireless", "slow", "broadband"};
        String A = array[0];
        String B = array[1];
        String C = array[2];
        String D = array[3];
        System.out.println("A-" + A + "   " + "B-" + B);
        System.out.println("C-" + C + "   " + "D-" + D);
        System.out.println("Select Your Answer Like A-B-C-D");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        if (ans.equals("D") || ans.equals("d")) {


            z = z+ 10;
            System.out.println("#Right Answer#"+ z +" Point");

        } else {
            System.out.println("Wrong Answer!==Right Answer is " + D);
        }
        AnkitPrg ap = new AnkitPrg();
        ap.game2();
    }
    public void game2() {

        System.out.println("Q3-The CPU and memory are located on the:");
        String[] array = {"motherboard.", "expansion board.", "storage device.", "output device."};
        String A = array[0];
        String B = array[1];
        String C = array[2];
        String D = array[3];
        System.out.println("A-" + A + "   " + "B-" + B);
        System.out.println("C-" + C + "   " + "D-" + D);
        System.out.println("Select Your Answer Like A-B-C-D");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        if (ans.equals("A") || ans.equals("a")) {
            z = z+ 10;
            System.out.println("#Right Answer#"+ z +" Point");

        } else {
            System.out.println("Wrong Answer!==Right Answer is " + A);
        }
        AnkitPrg ap = new AnkitPrg();
        ap.game3();
    }
    public void game3() {

        System.out.println("Q4-The name for the way that computers manipulate data into information is called:");
        String[] array = {" programming", "processing", "storing", "organizing"};
        String A = array[0];
        String B = array[1];
        String C = array[2];
        String D = array[3];
        System.out.println("A-" + A + "   " + "B-" + B);
        System.out.println("C-" + C + "   " + "D-" + D);
        System.out.println("Select Your Answer Like A-B-C-D");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        if (ans.equals("B") || ans.equals("b")){
            z = z+ 10;
            System.out.println("#Right Answer#"+ z +" Point");

        } else {
            System.out.println("Wrong Answer!==Right Answer is " + B);
        }
        AnkitPrg ap = new AnkitPrg();
        ap.game4();
    }
    public void game4() {

        System.out.println("Q5-Wich one is first Web Browser invented in 1990.");
        String[] array = {"Internet Exploder", "Mosaic", "Mozilla", "Nexus"};
        String A = array[0];
        String B = array[1];
        String C = array[2];
        String D = array[3];
        System.out.println("A-" + A + "   " + "B-" + B);
        System.out.println("C-" + C + "   " + "D-" + D);
        System.out.println("Select Your Answer Like A-B-C-D");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        if (ans.equals("D") || ans.equals("d")){
            z = z+ 10;
            System.out.println("#Right Answer#"+ z +" Point");

        } else {
            System.out.println("Wrong Answer!==Right Answer is " + D);
        }
        System.out.println("Your Score is : "+ z);
        if (z == 30){
        System.out.println("Your are Winner");}
            else if (z == 40){
                System.out.println("Your are Extraordinary Player");}
                else if(z == 50){
                    System.out.println("you are intelligent ");
                }
                else {
                System.out.println("Improve Your GK ");

        }

    }




}
