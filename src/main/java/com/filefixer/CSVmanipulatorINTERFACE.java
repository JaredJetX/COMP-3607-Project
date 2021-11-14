package com.filefixer;

import java.util.List;

public interface CSVmanipulatorINTERFACE{
    public void get_CSV_file(String path);
    public void loadStudentInfo(String path);
    public List<student> getStudentInfo();
}
