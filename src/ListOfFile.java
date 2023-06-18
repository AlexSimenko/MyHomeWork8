import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ListOfFile {

    public void displayFileContents(int a) {
        for (int i = 1; i <= a; i++) {
            String basePath = "src/resources";
            String folderPath = basePath + "/folder" + i;
            File folder = new File(folderPath);
            File[] files = folder.listFiles();
            System.out.println("Список файлів у папці " + folder.getName() + ":");
            if (files != null) {
                for (File file : files) {
                    System.out.println("Назва файлу: " + file.getName());
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println("Що записано: " + line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
