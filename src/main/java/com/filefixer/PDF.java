package com.filefixer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class PDF implements pdfHandler{

    @Override
    public void parse_PDFs(File pdf, List<student> student_info) {
        for (student o: student_info){
            if(pdf.getName().contains(o.getstudent_ID())){
                move_PDFs(pdf, o); return;
            }else if(pdf.getName().contains(o.getName())){
                move_PDFs(pdf, o); return;
            }
        }  
    }

    @Override
    public void move_PDFs(File pdf, student student) {
        try {
            FileUtils.moveFile(
            FileUtils.getFile(pdf.getPath()), 
            FileUtils.getFile(create_destinationPATH(pdf, student)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String create_destinationPATH(File pdf, student student) {
        String destinationString = "filesToRename/renamedFiles/" + student.getName() + "_" + 
        student.getparticipant_ID().replace("Participant ", "") +
        "_assignsubmission_file_" + pdf.getName();
        return destinationString;
    }
}
