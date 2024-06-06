package Commands;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class WriteDailyPlaner {
    public static void writeDailyPlaner() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите задачу: ");
        String textTask = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("Task.txt", true);
        StringBuilder task = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        task.append(calendar.getTime());
        task.append(" Задача: ");
        task.append(textTask);
        task.append("\n");
        System.out.println(task);
        fileWriter.write(String.valueOf(task));
        fileWriter.flush();
        fileWriter.close();
    }
}
