import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Задание 1
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        } */

        /* Задание 2
        int size = 10;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0], max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Мин: " + min);
        System.out.println("Макс: " + max); */

        /* Задание 3
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        int min = 0, max = 0;
        for (int i = 1; i < size; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
            if (a[i] > a[max]) {
                max = i;
            }
        }

        System.out.println("Индекс мин: " + min);
        System.out.println("Индекс макс: " + max); */

        /* Задание 4
        int n = 10;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 5);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) count++;
        }

        if (count == 0) {
            System.out.println("Нулевых элементов нет");
        }
        else {
            System.out.println("Количество нулей: " + count);
        } */

        /* Задание 5
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        } */

        /* Задание 6
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isInc = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                isInc = false;
                break;
            }
        }

        if (isInc) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        } */

        /* Доп задание 1
        Scanner sсanner = new Scanner(System.in);
        int n = sсanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sсanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 9) {
                a[i]++;
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] + " ");
                }
                return;
            }
            a[i] = 0;
        }

        System.out.print("1 ");
        for (int i = 0; i < n; i++) {
            System.out.print("0 ");
        } */
    }
}
