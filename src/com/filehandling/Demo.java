package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
             fileReader = new FileReader(".idea/resources/studentdetails.csv");
             bufferedReader = new BufferedReader(fileReader);

            int numberOfLines;
            for (numberOfLines = 0; bufferedReader.readLine() != null; ++numberOfLines) {
            }

            System.out.println("numberOfLines = " + numberOfLines);
            Student[] studentsList = new Student[numberOfLines - 1];
            int index = 0;
            fileReader = new FileReader(".idea/resources/studentdetails.csv");
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Student student = new Student();
                String[] split = line.split(",");
                student.setName(split[0]);
                student.setAge(Integer.parseInt(split[1]));
                student.setRollNo(split[2]);
                student.setEmail(split[3]);
                student.setGender(split[4]);
                studentsList[index] = student;
                ++index;
            }

            for (Student student:studentsList) {
                System.out.println(student);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
