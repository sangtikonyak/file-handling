package com.filehandling;

// Reading and Writing file with java InputStream and OutputStream classes

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {
    public static void main(String[] args) {

     try{
         FileInputStream file=new FileInputStream( "E:/Java/file-handling/.idea/resources/poem.txt");
         int readData=0;
         char data='\u0000';
         String str="";
         while ((readData=file.read())!=-1)
         {
             data=(char)readData;
             str+=data;
             System.out.print(data);
         }
         FileOutputStream fileOutputStream=new FileOutputStream("E:/Java/file-handling/.idea/resources/write.txt");
         byte[] bytes=str.getBytes();
         fileOutputStream.write(bytes);

     }catch(FileNotFoundException e)
     {
         e.printStackTrace();
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
    }
}
