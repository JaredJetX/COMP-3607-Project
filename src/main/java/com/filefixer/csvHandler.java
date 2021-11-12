package com.filefixer;

import java.io.FileNotFoundException;
import java.util.List;

public interface csvHandler {
    public void loadStudentInfo(String path) throws FileNotFoundException;
    public List<student> getStudentInfo();
}
