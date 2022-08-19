public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        //задача 1
    }

    public static void main(String[] args) {
        int[] rnd = generateRandomArray();
        int firstArr = 0;
        for (int i = 0; i < rnd.length - 1; i++) {
            firstArr += rnd[i];
        }
        System.out.println("Сумма трат за месяц составила " + firstArr + " рублей");

        //задача 2
        int maxSpent = -1;
        int minSpent = Integer.MAX_VALUE;
        int[] secondArr = generateRandomArray();
        for (int i = 0; i <= secondArr.length - 1; i++) {
            if (secondArr[i] > maxSpent) {
                maxSpent = secondArr[i];
            }
            if (secondArr[i] < minSpent) {
                minSpent = secondArr[i];
            }

        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpent + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSpent + " рублей");

        //задача 3
        double averageSpent = 0;
        double spentOverall = 0;
        int[] thirdArr = generateRandomArray();
        for (int j : thirdArr) {
            spentOverall += j;
        }
        averageSpent = spentOverall / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpent + " рублей");
        //задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}