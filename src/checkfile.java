public abstract class checkfile{
    private static String extension = "";
    public static String get_file_ext(String fileName){
        int i = fileName.lastIndexOf('.');
        if (i >= 0){
            extension = fileName.substring(i+1); 
        }
        //System.out.println(extension);
        return extension;
    }
}