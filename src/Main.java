import Commands.ReadDailyPlaner;
import Commands.WriteDailyPlaner;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        mainCycle();
    }

    private static void mainCycle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!\n" +
                "Это Ваш личный ежедневник для задач!");
        while (true) {
            System.out.println("Управление:\n" +
                    "#write - записать задачу\n" +
                    "#readAll - считать все задачи\n" +
                    "#exit - выйти\n");
            System.out.print("Введите команду: ");
            String requestUser = scanner.nextLine();
            if (requestUser.startsWith("#")) {
                if (!(requestUser.equals("#exit"))) {
                    switch (requestUser) {
                        case "#write": {
                            WriteDailyPlaner.writeDailyPlaner();
                            break;
                        }
                        case "#readAll": {
                            ReadDailyPlaner.readAllDailyPlaner();
                            break;
                        }
                        default:
                            System.out.println("Такой команды не существует! Для добавления новой команды напишите разработчику!\n" +
                                    "Ник в тг: @shaman_stepan_ded");
                    }
                } else {
                    System.out.println("До свидания!");
                    break;
                }
            } else {
                System.out.println("Неверный формат ввода! Используйте '#' в начала запроса, для корректной работы программы");
            }
        }
    }
}