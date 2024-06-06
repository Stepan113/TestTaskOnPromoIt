package Commands;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class WriteDailyPlaner {
    private static String separatorDate = "-";
    private static String separatorTime = ":";

    public static void writeDailyPlaner() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите задачу: ");
        String textTask = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("Task.txt", true);
        StringBuilder task = new StringBuilder();
        StringBuilder dateAndTime = stringBuilder();
        task.append(dateAndTime);
        task.append(" Задача: ");
        task.append(textTask);
        task.append("\n");
        fileWriter.write(String.valueOf(task));
        System.out.println("Задача " + textTask + " успешно добавлена!");
        System.out.println();
        fileWriter.flush();
        fileWriter.close();
    }

    private static StringBuilder stringBuilder() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        StringBuilder dateAndTime = new StringBuilder(year + separatorDate
                + month + separatorDate
                + day + " "
                + hour + separatorTime
                + minute);
        return dateAndTime;
    }
}
