import java.io.*;

public class Flowers {
    public static void main(String[] args) {
        String[] flowers = new String[]{"GCV", "VGC", "CVG"};
        String line;
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
            line = reader.readLine();
            int day = Integer.parseInt(line);
            int ind = (day % 3);
            writer.write(flowers[ind]);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
