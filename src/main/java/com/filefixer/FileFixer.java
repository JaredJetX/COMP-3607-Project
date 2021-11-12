package com.filefixer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileFixer {
    public static void main(String[] args) {
        Directory directoryHandler = new directoryHandler();
        CSV csvHandler = new csvHandler();
        PDF pdfHandler = new pdfHandler();
        List<student> student_info = new ArrayList<student>();
        Collection<File> pdfFiles;

        directoryHandler.newDirectory("filesToRename/renamedFiles");
        pdfFiles = directoryHandler.get_PDFs("filesToRename");
        
        try {
            csvHandler.loadStudentInfo("filesToRename/Sample 5 CSV.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        student_info = csvHandler.getStudentInfo();

        for(File pdf: pdfFiles){
            pdfHandler.PDF_name_parse(pdf, student_info);
        }
    }
}
