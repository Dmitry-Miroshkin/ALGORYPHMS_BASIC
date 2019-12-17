import java.io.*;

public class ones {
    public static void main(String[] args) {

        try {
            File input = new File("C:\\Users\\user\\IdeaProjects\\Алгоритмы и структуры данных на Java. Базовый курс\\src\\INPUT.TXT");
            File output = new File("C:\\Users\\user\\IdeaProjects\\Алгоритмы и структуры данных на Java. Базовый курс\\src\\OUTPUT.TXT");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(input);
            FileWriter fileWriter = new FileWriter(output);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            // считаем сначала первую строку
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            String out = String.format("%8s", Integer.toBinaryString((x) & 0xFF)).replace(' ', '0');
            System.out.print(out);
            for (int i = 0; i <out.length() ; i++) {
                if (out.charAt(1, i)){}
            }
            writer.write(out);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

