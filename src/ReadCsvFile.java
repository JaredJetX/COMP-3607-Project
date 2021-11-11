import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadCSVFile{
    private LinkedList<student_info> studentInfo;

    public ReadCSVFile(){
        studentInfo = new LinkedList<student_info>();
    }

    public void loadStudentInfo() throws FileNotFoundException{
        Scanner data = new Scanner(new File("Data.csv"));  
        String allInfo = data.nextLine();
        while (data.hasNext()){
            allInfo = data.nextLine();
            String[] studentData = allInfo.split("\\,");
            studentInfo.add(new student_info(studentData[1], studentData[2], studentData[3]));
        }
        data.close();
    }

    public LinkedList<student_info> getStudentInfo(){
        return studentInfo;
    }
}