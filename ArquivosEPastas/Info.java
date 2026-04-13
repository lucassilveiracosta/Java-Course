package ArquivosEPastas;

import java.io.File;
import java.util.Scanner;

public class Info {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a path file: ");
        String strPath = sc.next();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println("Can execute: " + path.canExecute());
        sc.close();
    }
}
