import java.io.File;

public class FileHandler{
    private static File[] listOfFiles = new File("filesToRename").listFiles();

    public static void getFiles(){
        for(File file: listOfFiles){
            if(file.isFile() && is_PDF.check_pdf_ext(file.getName())){
                System.out.println("File: " + file.getName());
            }else if(file.isDirectory()){
                System.out.println("Directory: " + file.getName());
            }
        }
    }

    //needs to hold fileName data
    //needs to use CSV data to parse fileName list, preferrably ID
    //needs to then use CSV data rename file and store file in renamedFiles
}   
