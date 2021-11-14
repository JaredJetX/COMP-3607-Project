package com.filefixer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileFixer {
    public static void main(String[] args) {
        directoryHandlerINTERFACE directoryHandler = new directoryHandler();

        CSVmanipulatorINTERFACE csvHandler = new CSVmanipulator(new csvCollection());
        batchPDFmanipulatorINTERFACE pdfHandler = new batchPDFmanipulator(new pdfCollection());
        
        List<student> student_info = new ArrayList<student>();
        Collection<File> pdfFiles;

        directoryHandler.newDirectory("filesToRename/renamedFiles");

        pdfFiles = pdfHandler.get_PDFs("filesToRename");
        csvHandler.get_CSV_file("filesToRename");

        student_info = csvHandler.getStudentInfo();

        for(File pdf: pdfFiles){
            pdfHandler.PDF_name_parse(pdf, student_info);
        }
    }
}
