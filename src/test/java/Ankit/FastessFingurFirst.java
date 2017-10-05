package Ankit;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

class FastessFingurFirst {
    int z = 0;

    public void fastess() throws IOException, InterruptedException {
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
        //System.out.println(al1);


        ArrayList randomNumber = new ArrayList();
        System.out.println("WellCome to FastestFingerFirst");
        System.out.println("Rules of The Game : Total 5 Question, You Need 3 right Answer For Hot Seat ");
        System.out.println("You Have Only 60 Second for ech Question");
        Thread.sleep(10000);
        System.out.println(" [ Lets Start ] ");
        Thread.sleep(8000);
        for (int i = 1; i <= 5; i++) {
            if (z == 30) {
                System.out.println("\t" + "\t" + "(..) Congratulations==You are qualified For Hot Seat.");
            }

            System.out.println("=====================================");
            System.out.println("            Question-" + i);
            System.out.println("=====================================");

            Random Dice = new Random();
            int n = Dice.nextInt(al1.size());
            //System.out.println(n);
            randomNumber.add(n);

            int j = 0;
            for (; j < 5; j++) {
                System.out.println(al1.get(n).get(j));
            }

            System.out.println(al1.get(n).get(5));

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();



            if (input.toUpperCase().equals(al1.get(n).get(5))) {
                z = z + 5 * 2;
                System.out.println("Right Answer----------" + "[10 Point ]");
            } else {
                System.out.println("Wrong Answer!==Right Answer is " + al1.get(n).get(5));
            }
            System.out.println("Total Point is :        " + z);
        }

    }
}
