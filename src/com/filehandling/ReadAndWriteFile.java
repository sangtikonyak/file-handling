package com.filehandling;

// Reading and Writing File through character Stream reader and writer class

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try{
             fileReader=new FileReader(".idea/resources/studentdetails.csv");
             bufferedReader=new BufferedReader(fileReader);
             int numberOfLines=0;
             String line;
             while((line=bufferedReader.readLine())!=null)
            {
                numberOfLines++;
            }
            System.out.println(numberOfLines);

             // reading the file

             // creating an array of StudentDetails class

             Student[] studentList=new Student[numberOfLines-1];
             int index=0;

            // once you have read the file you have to reinitialize the FileReader and BufferedReader class
            // the while loop has read the file so the buffer has reached the null.
            //Reset the classes to start reading again

            fileReader=new FileReader(".idea/resources/studentdetails.csv");
            bufferedReader=new BufferedReader(fileReader);
            bufferedReader.readLine();//Skipping the first line of the file

             while ((line = bufferedReader.readLine()) != null) {
                 Student student = new Student();

                 // Reading line that contains comma separated value for studentDetails
                 // split method split the line accordingly to the Argument passed
                 // i stored the separated line in string array split

                 String[] split = line.split(",");
                 student.setName(split[0]);
                 System.out.println("split = " + split[0]);
                 student.setRollNo(split[1]);
                 student.setAge(Integer.parseInt(split[2]));
                 student.setEmail(split[3]);
                 student.setGender(split[4]);
                 studentList[index] = student;
                 index++;
             }
            System.out.println("index = " + index);
            for (Student student:studentList) {
                System.out.println(student);
            }
            bufferedReader.close();
            fileReader.close();

            // Write into a file

            FileWriter fileWriter=new FileWriter(".idea/resources/studentdetails.csv",true);
           // Student student=new Student("sangti","1234",23,"ssasngtikonyak@gmail.com","malw");
           // String str="\nsangti,1234,23,sangtikonyak@gamil.com,male";
            String str=sc.next();
            fileWriter.write(str);
            fileWriter.flush();

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
