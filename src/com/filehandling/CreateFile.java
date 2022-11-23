package com.filehandling;

// Creating a File

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            // create an object of a file
            File file=new File("E:/Java/file-handling/.idea/resources/poem.txt");
            if(file.createNewFile())
            {
                System.out.println("File "+file.getName() +" has been created");
            }
            else {
                System.out.println("file is already exist in the directory");
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
