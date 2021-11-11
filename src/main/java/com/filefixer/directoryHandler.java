package com.filefixer;

import java.io.File;
import java.util.Collection;

public interface directoryHandler {
    public void newDirectory(String path);
    public Collection<File> get_PDFs(String path);
}
