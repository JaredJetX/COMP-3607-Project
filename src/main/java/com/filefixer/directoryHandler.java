package com.filefixer;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class directoryHandler implements Directory{

    public void newDirectory(String path){
        try{
            Files.createDirectories(Paths.get(path));
        }catch(Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public Collection<File> get_PDFs(String path) {
        File dir = new File(path);
		String[] extension = new String[] { "pdf" };
	    Collection<File> pdfFiles = FileUtils.listFiles(dir, extension, false);
        for (File file : pdfFiles) {
			System.out.println("file: " + file.getPath());
		}
        return pdfFiles;
    }

    //needs to hold fileName data
}
