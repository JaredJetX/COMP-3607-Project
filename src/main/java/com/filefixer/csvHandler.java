package com.filefixer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class csvHandler implements CSV{
    private List<student> student_info = new ArrayList<student>();

    fileCollection fileCollectionStrategy;

    public csvHandler(fileCollection fileCollectionStrategy){
        this.fileCollectionStrategy = fileCollectionStrategy;
    }   

    public void getCSVfile(String path){
        Collection<File> csvCollection = fileCollectionStrategy.get_Files(path);
        File chosen_file = csvCollection.iterator().next();

        if(csvCollection.size() > 1){
            for(File file: csvCollection){
                if(chosen_file.lastModified() < file.lastModified()){
                    chosen_file = file;
                }
            }
        }else if(csvCollection.size() < 1){
            //need to implement error message.
        }
        loadStudentInfo(chosen_file.getPath());
    }

    public void loadStudentInfo(String path){
        try {
            Scanner data = new Scanner(new File(path));  
            String all_info = data.nextLine();

            while (data.hasNext()){
                all_info = data.nextLine();
                String[] studentData = all_info.split("\\,");
                student_info.add(new student_info(studentData[0], studentData[1], studentData[2]));
            }  

            data.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public List<student> getStudentInfo(){
        /*for (student o: student_info){
            System.out.println("name: " + o.getName() + "| student_ID: " + o.getID() + "\n");
        }*/
        return student_info;
    }
}