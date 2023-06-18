import java.io.*;

public class DirCreator {
    public void CreateDir(int a) {

        for (int j = 1; j <= a; j++) {
            File dir = new File("src/resources/" + "folder" + j);
            dir.mkdirs();
        }
    }

    public void fileCreator(int b)  {
        for (int j = 2; j <= b; j = j + 2) {
            File file = new File("src/resources/" + "folder" + j + "/" + "file" + j);
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


