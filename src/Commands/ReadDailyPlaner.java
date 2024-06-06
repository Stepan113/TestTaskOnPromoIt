package Commands;

import java.io.*;
import java.util.Scanner;

public class ReadDailyPlaner {
    public static void readAllDailyPlaner() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Task.txt"));
        String str;
        boolean flag = false;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
            flag = true;
        }
        if (!flag) {
            System.out.println("Задач нет");
        }
        System.out.println();
        bufferedReader.close();
    }

    public static void readTask() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате yyyy-mm-dd для поиска по дате без ведущих нулей(Например: 05=5,09=9))");
        String data = scanner.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Task.txt"));
        String str;
        boolean flagEmpty = false;
        while ((str = bufferedReader.readLine()) != null) {
            String[] array = str.split(" ");
            if (array[0].equals(data)) {
                System.out.println(str);
                flagEmpty = true;
            }
        }
        if (!flagEmpty) {
            System.out.println("Задач нет или неправильно введены данные. Проверьте корректность Ваших данных и попробуйте снова)");
        }
        System.out.println();
        bufferedReader.close();
    }
}
