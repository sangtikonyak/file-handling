package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try{
            File file =new File("E:/Java/file-handling/.idea/resources/write-a-file.txt");
            if(file.createNewFile())
            {
                System.out.println("file has created");
            }
            else {
                System.out.println("File already exist");
            }
            FileWriter fileWriter=new FileWriter("E:/Java/file-handling/.idea/resources/write-a-file.txt");

            //writing the content into the write-a-file

            fileWriter.write("I have created a file and wrote this sentence in it");

            // close the stream
            fileWriter.close();

            System.out.println("content is successfully wrote to a file");

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
