import java.util.*;
public class Proc_24 {
    /*Описать метод Even(K) логического типа, возвращающую True,
    если целый параметр K является четным, и False в противном случае.
    С ее помощью найти количество четных чисел в наборе из 10 целых чисел.*/
    public static boolean Even(int K) {
        if (K % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int count = 0;
        System.out.print("Введите 10 чисел: ");
        for (int i = 0; i < 10; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (Even(A[i])) {
                count++;
            }
        }
        System.out.println("Количество четных чисел: " + count);
    }
}