import java.io.*;
import java.util.Scanner;
    public  class Main {
        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);
            int fileNumber;
            System.out.println("Введіть кількість папок. якщо не бажаете, то пропишіть будь-яку фразу. \n" +
                    "за стандартом 8 папок з назвою пакету resources");
            if (scanner.hasNextInt()){
                fileNumber=scanner.nextInt();
            }
            else {
                fileNumber=8;
            }
            System.out.println("Кількіть файлів обрана як "+fileNumber);

            DirCreator dirCreator = new DirCreator();
            dirCreator.CreateDir(fileNumber);
            dirCreator.fileCreator(fileNumber);
            System.out.println("Зараз потрібно будет внести запис у кожну другу папку, де створиться новий файл");
            TextWriter textWriter = new TextWriter();
            textWriter.EnterWrite(fileNumber);
            System.out.println("Можна одразу побачити результат :");
            ListOfFile listOfFile = new ListOfFile();
            listOfFile.displayFileContents(fileNumber);
        }
    }

