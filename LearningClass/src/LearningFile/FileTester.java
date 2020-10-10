package LearningFile;

import java.io.*;
import java.util.Scanner;

public class FileTester {
    public static void main(String[] args) {
        File inputFile = new File("C:\\Users\\NAHID HASAN\\Desktop\\test.inp");
        File outputFile = new File("C:\\Users\\NAHID HASAN\\Desktop\\test.out");
        //File outputFile = new File("F:\\Java_Code\\LearningClass\\src\\LearningFile\\testClass.out");

        try {
            //-------Read and write the file------------
            FileReader fileReader = new FileReader(inputFile);
            try {
                FileWriter fileWriter = new FileWriter(outputFile);
                Scanner scanner = new Scanner(System.in);
                while (scanner.hasNext()) {
                    String tempString = scanner.nextLine();
                   // System.out.println(tempString);
                    fileWriter.write(tempString + "\n");
                }
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        }

    }
}
