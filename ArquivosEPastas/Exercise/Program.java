package ArquivosEPastas.Exercise;

import java.io.*;

public class Program {
    static void main(String[] args) {
        File file = new File("C:\\Users\\lscos\\OneDrive\\Documentos\\Projetos-Internos\\Hands-on-Java\\ArquivosEPastas\\Exercise\\in.csv");
        File newFile = new File("C:\\Users\\lscos\\OneDrive\\Documentos\\Projetos-Internos\\Hands-on-Java\\ArquivosEPastas\\Exercise\\out\\summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(file)); BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true))){
            String line = br.readLine();
            while (line != null) {
                String product = line.substring(0, line.indexOf(","));
                String priceString = line.substring(line.indexOf(",") + 1, line.lastIndexOf(","));
                String quantityString = line.substring(line.lastIndexOf(",") + 1, line.length());

                double price = Double.parseDouble(priceString);
                int quantity = Integer.parseInt(quantityString);

                double totalPrice = price * quantity;

                String newLine = "Produto: " + product + " | " + "Total Price: " + totalPrice;
                bw.write(newLine);
                bw.newLine();

                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
