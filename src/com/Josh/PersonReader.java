package com.Josh;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
public class PersonReader {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("/Users/joshshell/Desktop/JavaPrograms/PersonReaderIII"));

        File csvFile;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        //get user to choose output file thrugh jFilechooser

        //return - string filepath

        try {

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                csvFile = chooser.getSelectedFile();

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {
                    // use comma as separator
                    String[] readLine = line.split(cvsSplitBy);
                    //System.out.println(readLine);
                    System.out.println(readLine[0] + " " + readLine[1] + " " + readLine[2] + " " + readLine[3] + " ");
                }
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
