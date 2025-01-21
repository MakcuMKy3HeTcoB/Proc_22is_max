import java.util.*;
public class Proc_6 {
    /*Описать процедуру DigitCountSum(K, C, S),
    находящую количество C цифр целого положительного числа K,
    а также их сумму S (K — входной, C и S — выходные параметры целого типа).
    С помощью этой процедуры найти количество и сумму цифр для каждого из пяти данных целых чисел.*/
    public static void DigitCountSum(int K, int[] C, int[] S) {
        int count = 0;
        int sum = 0;
        while (K > 0) {
            int digit = K % 10;
            count++;
            sum += digit;
            K /= 10;
        }
        C[0] = count;
        S[0] = sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Numbers = new int[5];
        System.out.print("Введите 5 положительных целых числа: ");
        for (int j = 0; j < 5; j++) {
            Numbers[j] = in.nextInt();
            if (Numbers[j] < 1) {
                System.out.println("Ошибка! Введено отрицательное число! Повторите, что такое положительные целые числа, а затем повторите ввод!");
                j--;
            }
        }
        int[] C = new int[1];
        int[] S = new int[1];
        DigitCountSum(Numbers[0], C, S);
        System.out.println("Количество цифр числа " + Numbers[0] + " = " + C[0] + "\nСумма цифр числа" + Numbers[0] + " = " + S[0]);

        DigitCountSum(Numbers[1], C, S);
        System.out.println("Количество цифр числа " + Numbers[1] + " = " + C[0] + "\nСумма цифр числа" + Numbers[1] + " = " + S[0]);

        DigitCountSum(Numbers[2], C, S);
        System.out.println("Количество цифр числа " + Numbers[2] + " = " + C[0] + "\nСумма цифр числа" + Numbers[2] + " = " + S[0]);

        DigitCountSum(Numbers[3], C, S);
        System.out.println("Количество цифр числа " + Numbers[3] + " = " + C[0] + "\nСумма цифр числа" + Numbers[3] + " = " + S[0]);

        DigitCountSum(Numbers[4], C, S);
        System.out.println("Количество цифр числа " + Numbers[4] + " = " + C[0] + "\nСумма цифр числа" + Numbers[4] + " = " + S[0]);
    }
}
