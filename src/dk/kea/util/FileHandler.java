package dk.kea.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://www.tutorialspoint.com/How-to-read-a-2d-array-from-a-file-in-java

public class FileHandler {
    private int rows;
    private int columns;
    private int [][] myArray;
    private Scanner reader;

    public FileHandler(){
        rows = 0;
        columns = 0;
        myArray = new int[rows][columns];
    }

    public void readFile(File file) {
        try {
            reader = new Scanner(file);
            while (reader.hasNext()){
                String i = reader.nextLine();
                System.out.println(i);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    }
