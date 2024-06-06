package Commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class Statistics {
    private static int countAllTask = 0;

    public static void statistics() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Task.txt"));
        HashMap<String, Integer> dict = new HashMap<>();
        boolean flag = false;
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            countAllTask++;
            String[] array = str.split(" ");
            dict.merge(array[0], 1, Integer::sum);
            flag = true;
        }
        if (!flag) {
            System.out.println("Статистика пуста");
            return;
        }
        System.out.println("Кол-во задач всего: " + countAllTask);
        String mostPopularDay = Collections.max(dict.entrySet(), HashMap.Entry.comparingByValue()).getKey();
        System.out.println("Самый активный день по записям: " + mostPopularDay + " (" + dict.get(mostPopularDay) + " записей)");
        System.out.println();
        bufferedReader.close();
    }
}
