public class is_PDF{
    static String extension = "";
    public static boolean check_pdf_ext(String fileName){
        extension = checkfile.get_file_ext(fileName);
        //System.out.println(extension);
        if(extension.equals("pdf")){
            return true;
        }
        return false;
    }
}
