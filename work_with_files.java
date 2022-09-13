package java_lec1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class work_with_files {
    public static void main(String[] args) throws Exception {
        // Работа с файлами
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.append("line 3");
            fw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.println(ch);
            }
        }

    }
}
