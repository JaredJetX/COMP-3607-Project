import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class createDirectory {
    public static void newDirectory(){
        try{
            Files.createDirectories(Paths.get("filesToRename/renamedFiles"));
        }catch(Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
