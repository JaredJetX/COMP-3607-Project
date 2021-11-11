package com.filefixer;

import java.io.File;
import java.util.Collection;

public class FileFixer {
    public static void main(String[] args) {
        Collection<File> pdfFiles;
        directoryHandler directory = new Directory();

        directory.newDirectory("filesToRename/renamedFiles");
        pdfFiles = directory.get_PDFs("filesToRename");
    }
}
