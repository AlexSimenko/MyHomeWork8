
import java.io.*;
import java.util.Scanner;


public class TextWriter {
    public void EnterWrite(int a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <= a; i=i+2) {
            System.out.println("Введіть вашу фразу до txt.file"+i);
            String nextLine = scanner.nextLine();
            FileWriter writer;
            try {
                writer = new FileWriter("src/resources/folder"+i+"/file"+i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.write(nextLine);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }



}
