import java.io.*;

public class ones {
    public static void main(String[] args) {
        int summ = 0;
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
            String outStr = String.format("%8s", Integer.toBinaryString((x) & 0xFF)).replace(' ', '0');
            System.out.print(outStr);
            for (int i = 0; i < outStr.length(); i++) {
//                if (outStr.charAt(i) == 1) summ++;
            }
            System.out.println(summ);
            String str = String.valueOf(summ);
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

