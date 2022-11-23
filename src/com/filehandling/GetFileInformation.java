package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetFileInformation {
    public static void main(String[] args) {

            File file = new File("E:/Java/file-handling/.idea/resources/poem.txt");
           if (file.exists())
            {
                // Getting the file
                System.out.println(file.getName());
                //Getting the Path of the file
                System.out.println(file.getAbsolutePath());
                //checking whether the file is writable or not
                System.out.println(file.canWrite());
                //check whether the file can read or not
                System.out.println(file.canRead());
                //getting the length of the file in bytes
                System.out.println(file.length());
            }
           else {
               System.out.println("file does not exist");
           }

        }

}
