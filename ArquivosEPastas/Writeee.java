package ArquivosEPastas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writeee {
    static void main(String[] args) {

        String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night"};
        String path = "C:\\Users\\lscos\\OneDrive\\Documentos\\Projetos Internos\\Hands-on-Java\\ArquivosEPastas\\out.txt";

        try (BufferedWriter bw = new BufferedWriter( new FileWriter(path, true))){
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
