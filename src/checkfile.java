public class CheckFile implements extensionHandler{
    private String extension = "";
    public String get_file_ext(String fileName){
        int i = fileName.lastIndexOf('.');
        if (i >= 0){
            extension = fileName.substring(i+1); 
        }
        //System.out.println(extension);
        return extension;
    }

    @Override
    public boolean check_pdf_ext(String fileName) {
        if(get_file_ext(fileName).equals("pdf")){
            return true;
        }
        return false;
    }

    @Override
    public boolean check_zip_ext(String fileName) {
        if(get_file_ext(fileName).equals("zip")){
            return true;
        }
        return false;
    }
}