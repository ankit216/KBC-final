package Ankit;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.*;

class GameXls {
    int z = 0;
    String name;
    String conform;
    String answer;
    StepCode sc = new StepCode();
    ArrayList<String> arr = sc.priceList();
    BufferedReader in = null;


    public void read() throws IOException, InterruptedException {
        String excelFilePath = "/home/ankit/Downloads/KbcData.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
        ArrayList<ArrayList<String>> al1 = new ArrayList<ArrayList<String>>();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            ArrayList<String> al = new ArrayList<String>();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getColumnIndex() >= 1) {
                    if (cell.getColumnIndex() != 7) {
                        DataFormatter formatter = new DataFormatter();
                        String returnData = formatter.formatCellValue(cell);
                        al.add(returnData);
                        if (cell.getColumnIndex() == 1) {
                            //System.out.println(nextRow.getRowNum()+" : "+returnData);
                        } else {
                            // System.out.println(returnData);
                        }

                    }

                }

            }
            //System.out.println(al);
            al1.add(al);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "देवियों और सज्जनों...'कौन बनेगा करोड़पति' में आपका स्वागत" + "\n");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Your Full Name If You Have");
        String name = scr.nextLine();
        System.out.println("Time limit 45 second till 3.20 Lacs");
        ArrayList rendomNumber = new ArrayList();


        for (int i = 1; i <= 16; i++) {
            String str = "";
            System.out.println("=====================================");
            System.out.println("            Question-" + i);
            System.out.println("=====================================");
            Random Dice = new Random();
            int n = Dice.nextInt(al1.size());
            System.out.println("This question for " + arr.get(i - 1) + " Rupee ");
            //System.out.println(n);
            rendomNumber.add(n);
            int j = 0;
            for (; j < 5; j++) {
                System.out.println(al1.get(n).get(j));
            }
            System.out.println(al1.get(n).get(5));
if(i<=10){
    int x=45;
    System.out.println( " Enter your answer within 45 seconds: " );
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long startTime = System.currentTimeMillis();
    while ((System.currentTimeMillis() - startTime) < x * 1000
            && !in.ready()) {
    }
    if (in.ready()) {
    } else {
        System.out.println("Opsss...Time Out");
        System.exit(1);
    }
}
else {
    System.out.println("No Time Limit");
}


                String answer = scanner.nextLine();
                System.out.println("Lock किया-जाए ? " + "\n" + "[ Y / N ]");
                String yesNo = scanner.nextLine();

                if (yesNo.toLowerCase().equals("n")) {
                    System.out.println("Please Enter a Final Answer ");
                    conform = scanner.nextLine();

                    if (yesNo.toUpperCase().equals(al1.get(n).get(5))
                            || conform.toUpperCase().equals(al1.get(n).get(5))) {
                        System.out.println(" [         Right Answer     ]" + "\n" + "\n" +
                                "Total Win Price is :        " + arr.get(i - 1) + "\n");
                    } else {
                        System.out.println("[  Wrong Answer  ]!==Right Answer is " + al1.get(n).get(5) + "\n" + "Try Next Yeay");
                        if (i == 6 || i == 7 || i == 8 || i == 9) {
                            System.out.println("You final wining amount is : 10,000-Rupee ");
                        } else if (i == 10 || i == 11 || i == 12 || i == 13 || i == 14) {
                            System.out.println("Congratulation" + "\n" + "You final wining amount is : 3.20Lacs-Rupee ");
                        }

                        System.exit(1);

                    }
                    //System.out.println("n : "+n);
                    al1.remove(n);
                    //System.out.println("Size : "+al1.size());
                    System.out.println();
                    if (arr.get(i - 1) == "10,000") {
                        System.out.println("You win guaranteed amount-10,000-Rupee ");
                    }

                    if (arr.get(i - 1) == "3.20Lacs") {
                        System.out.println("You win guaranteed amount-3.20Lacs-Rupee");
                    }
                    if (arr.get(i - 1) == "1Cr") {
                        System.out.println("You win guaranteed amount-1Cr-Rupee");
                    }

                } else if (yesNo.toLowerCase().equals("y")) {

                    if (answer.toUpperCase().equals(al1.get(n).get(5)) || yesNo.toUpperCase().equals(al1.get(n).get(5))
                            || conform.toUpperCase().equals(al1.get(n).get(5))) {

                        System.out.println(" [         Right Answer     ]" + "\n" + "\n" +
                                "Total Win Price is :        " + arr.get(i - 1) + "\n");


                    } else {
                        System.out.println("[  Wrong Answer  ]!==Right Answer is " + al1.get(n).get(5) + "\n" + "Try Next Yeay");
                        if (i == 6 || i == 7 || i == 8 || i == 9) {
                            System.out.println("You final wining amount is : 10,000-Rupee ");
                        } else if (i == 10 || i == 11 || i == 12 || i == 13 || i == 14) {
                            System.out.println("Congratulation" + "\n" + "You final wining amount is : 3.20Lacs-Rupee ");
                        }

                        System.exit(1);

                    }
                    //System.out.println("n : "+n);
                    al1.remove(n);
                    //System.out.println("Size : "+al1.size());
                    System.out.println();
                    if (arr.get(i - 1) == "10,000") {
                        System.out.println("You win guaranteed amount-10,000-Rupee ");
                    }

                    if (arr.get(i - 1) == "3.20Lacs") {
                        System.out.println("You win guaranteed amount-3.20Lacs-Rupee");
                    }
                    if (arr.get(i - 1) == "1Cr") {
                        System.out.println("You win guaranteed amount-1Cr-Rupee");
                    }

                }
            }

    /*workbook.close();
    inputStream.close();*/


        }


    }
