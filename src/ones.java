import java.io.*;

public class ones {
    public static void main(String[] args) {

        try {
            File directory = new File("./src");
            File input = new File(directory.getCanonicalPath()+"\\"+"input.txt");
            File output = new File(directory.getCanonicalPath()+"\\"+"output.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(input);
            FileWriter fileWriter = new FileWriter(output);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            // считаем сначала первую строку
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            String outStr = String.format("%8s", Integer.toBinaryString((x) & 0xFF)).replace(' ', '0');
            int summ = (int) outStr.codePoints().filter(ch -> ch == '1').count();
            System.out.println(summ);
            String str = String.valueOf(summ);
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

