package com.filefixer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileFixer {
    public static void main(String[] args) {
        directoryHandler directory = new Directory();
        csvHandler csv = new CSV();
        pdfHandler pdfHandler = new PDF();
        List<student> student_info = new ArrayList<student>();
        Collection<File> pdfFiles;

        directory.newDirectory("filesToRename/renamedFiles");
        pdfFiles = directory.get_PDFs("filesToRename");
        
        try {
            csv.loadStudentInfo("filesToRename/Sample 5 CSV.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        student_info = csv.getStudentInfo();

        for(File pdf: pdfFiles){
            pdfHandler.parse_PDFs(pdf, student_info);
        }
    }
}
