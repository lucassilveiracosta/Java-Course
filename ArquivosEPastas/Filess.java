package ArquivosEPastas;

import java.io.File;
import java.util.Scanner;

public class Filess {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); //caminho pode ser pasta ou arquivo

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("******Folders******");
        for (File folder: folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("******Files******");
        for (File file: files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\CrieiParaTeste").mkdir();
        System.out.println("Sucesso? " + success);
        sc.close();
    }
}
