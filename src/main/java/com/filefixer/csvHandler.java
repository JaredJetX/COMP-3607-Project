package com.filefixer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class csvHandler implements CSV{
    private List<student> student_info = new ArrayList<student>();

    public void loadStudentInfo(String path) throws FileNotFoundException{
        Scanner data = new Scanner(new File(path));  
        String all_info = data.nextLine();
        while (data.hasNext()){
            all_info = data.nextLine();
            String[] studentData = all_info.split("\\,");
            student_info.add(new student_info(studentData[0], studentData[1], studentData[2]));
        }
        data.close();
    }

    public List<student> getStudentInfo(){
        /*for (student o: student_info){
            System.out.println("name: " + o.getName() + "| student_ID: " + o.getID() + "\n");
        }*/
        return student_info;
    }
}