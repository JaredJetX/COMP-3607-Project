package com.filefixer;


import java.nio.file.Files;
import java.nio.file.Paths;

public class directoryHandler implements Directory{

    fileCollection fileCollectionStrategy;

    public void newDirectory(String path){
        try{
            Files.createDirectories(Paths.get(path));
        }catch(Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
