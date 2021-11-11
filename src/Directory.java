import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Directory implements directoryHandler{
    private File[] listOfFiles;
    private extensionHandler checkfile = new CheckFile();

    public void newDirectory(String path){
        try{
            Files.createDirectories(Paths.get(path));
        }catch(Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void getDirectoryFiles(String path) {
        listOfFiles = new File(path).listFiles();

        for(File file: listOfFiles){
            if(checkfile.check_pdf_ext(file.getName())){
                System.out.println("File: " + file.getName());
            }else if(file.isDirectory()){
                System.out.println("Directory: " + file.getName());
            }
        }  
    }

    //needs to hold fileName data
}
