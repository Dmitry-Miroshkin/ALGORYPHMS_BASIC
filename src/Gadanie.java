import java.io.*;

public class Gadanie {
    public static void main(String[] args) {
        int s = 0;
        try {
            File directory = new File("./src");
            File input = new File(directory.getCanonicalPath()+"\\"+"INPUT.TXT");
            File output = new File(directory.getCanonicalPath()+"\\"+"OUTPUT.TXT");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(input);
            FileWriter fileWriter = new FileWriter(output);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            // считаем сначала первую строку
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            for (int i = 1; i < n + 1; i++) {
                if (n % i == 0) s += i;
            }
            System.out.println(s);
            String str = String.valueOf(s);
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

