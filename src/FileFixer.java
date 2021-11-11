public class FileFixer {
    public static void main(String[] args) {
        directoryHandler directory = new Directory();

        directory.newDirectory("filesToRename/renamedFiles");
        directory.getDirectoryFiles("filesToRename");
    }
}
