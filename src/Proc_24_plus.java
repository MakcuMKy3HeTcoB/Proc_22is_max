import java.util.Scanner;

public class Proc_24_plus {
    /*Метод GenIntNumber - метод генерации целого числа в диапазоне (A,B), где A, B  - входные параметры.*/
    public static int GenIntNumber(int A, int B) {
        return (int) (Math.random() * (B - A) + A);
    }

    /*Метод FillArrayIntNumber - метод заполнения входящего массива (передается по ссылке внутрь метода).
    в методе MAIN запросить размер целочисленного массива. массив передать в метод заполнения,
    в методе использовать метод генерации чисел.*/
    public static void FillArrayIntNumber(int[] Arr) {
        System.out.print("Введите диапазон массива: ");
        Scanner in = new Scanner(System.in);
        System.out.print("от: ");
        int A = in.nextInt();
        System.out.print("до: ");
        int B = in.nextInt();
        System.out.print("Массив: ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = GenIntNumber(A, B);
            System.out.print(Arr[i] + " ");
        }
    }

    /*метод GetSumEvenNumberInArray - метод расчета суммы четных чисел во входном массиве.*/
    public static int GetSumEvenNumberInArray(int[] Arr) {
        int sum = 0;
        for (int j : Arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }
    // метод main для запуска программы
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] Arr = new int[in.nextInt()];
        FillArrayIntNumber(Arr);
        System.out.println("Сумма четных чисел в массиве: " + GetSumEvenNumberInArray(Arr));
    }
}
