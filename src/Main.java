import java.util.Arrays;
import java.util.Random;
public class Main {
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        System.out.println("задание 1");
        int sumSpend = 0;
        for (int i = 0; i < array.length; i++) {
            sumSpend = sumSpend += array[i];
        }
        System.out.println("Сумма трат за месяц составила" + sumSpend + "рублей");
        System.out.println("Задание 2");
        int maxSpendInDay = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxSpendInDay) {
                final int current = array[i];
                if (current > maxSpendInDay) {
                    maxSpendInDay = current;
                }
            }
            System.out.println("Максимальная сумма трат за день" + maxSpendInDay + "рублей");
            int minSpendInDay = 200_000;
            for (int j = 0; i < array.length; i++)
                if (array[i] < minSpendInDay) {
                    final int current = array[i];
                    if (current < minSpendInDay) {
                        minSpendInDay = current;
                    }
                }
            System.out.println("Минимальная сумма трат за день составила " + maxSpendInDay + "рублей");
            System.out.println("Задание 3");
            int averageSpendInMonth = sumSpend;
            for (int j = 0; i <=array.length; i++) {
                averageSpendInMonth = sumSpend / array.length;
            }
            System.out.println("Средная сумма трат за месяц" + averageSpendInMonth + "рубля");
        }
        System.out.println("Задание 4");
        char[] reverseName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= reverseName.length; i>=0; i--) {
            System.out.print(reverseName[i]);
        }
    }
}






