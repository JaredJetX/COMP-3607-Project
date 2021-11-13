package com.filefixer;

import java.util.List;

public interface CSV{
    public void getCSVfile(String path);
    public void loadStudentInfo(String path);
    public List<student> getStudentInfo();
}
