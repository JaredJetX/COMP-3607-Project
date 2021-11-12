package com.filefixer;

import java.io.File;
import java.util.Collection;

public interface Directory{
    public void newDirectory(String path);
    public Collection<File> get_PDFs(String path);
}
