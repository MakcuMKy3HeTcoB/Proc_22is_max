import java.util.Scanner;

public class Proc_14 {
    /*Описать процедуру ShiftRight3(A, B, C), выполняющую правый циклический сдвиг:
    значение A переходит в B, значение B — в C,
    значение C — в A (A, B, C — вещественные параметры,
    являющиеся одновременно входными и выходными).
    С помощью этой процедуры выполнить правый циклический сдвиг
    для двух данных наборов из трех чисел: (A1, B1, C1) и (A2, B2, C2).*/
    static void ShiftRight3(double[] A, double[] B, double[] C) {
        double temp = A[0];
        A[0] = B[0];
        B[0] = C[0];
        C[0] = temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] A1 = new double[1];
        double[] B1 = new double[1];
        double[] C1 = new double[1];
        double[] A2 = new double[1];
        double[] B2 = new double[1];
        double[] C2 = new double[1];
        System.out.print("Введите число A1: ");
        A1[0] = in.nextDouble();
        System.out.print("Введите число B1: ");
        B1[0] = in.nextDouble();
        System.out.print("Введите число C1: ");
        C1[0] = in.nextDouble();
        System.out.print("Введите число A2: ");
        A2[0] = in.nextDouble();
        System.out.print("Введите число B2: ");
        B2[0] = in.nextDouble();
        System.out.print("Введите число C2: ");
        C2[0] = in.nextDouble();
        ShiftRight3(A1, B1, C1);
        ShiftRight3(A2, B2, C2);
        System.out.println("A1 = " + A1[0] + " B1 = " + B1[0] + " C1 = " + C1[0]);
        System.out.println("A2 = " + A2[0] + " B2 = " + B2[0] + " C2 = " + C2[0]);
    }
}
