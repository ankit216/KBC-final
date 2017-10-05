package Ankit;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.*;

class StepCode {


    public ArrayList<String> priceList() {
        ArrayList<String> price = new ArrayList<String>();
        price.add("1000");
        price.add("2000");
        price.add("3000");
        price.add("5000");
        price.add("10,000");
        price.add("20,000");
        price.add("40,000");
        price.add("80,000");
        price.add("1.60Lacs");
        price.add("3.20Lacs");
        price.add("6.40Lacs");
        price.add("12.50Lacs");
        price.add("25Lacs");
        price.add("50Lacs");
        price.add("1Cr");
        price.add("7Cr");
        return price;
    }

    public void excelReade() throws IOException, InterruptedException{


    }
}