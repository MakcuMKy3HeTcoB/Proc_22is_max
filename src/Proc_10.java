import java.util.Scanner;

public class Proc_10 {
    /*Описать процедуру Swap(X, Y), меняющую содержимое переменных X и Y
    (X и Y — вещественные параметры, являющиеся одновременно входными и выходными).
    С ее помощью для данных переменных A, B, C, D
    последовательно поменять содержимое следующих пар:
    A и B, C и D, B и C и вывести новые значения A, B, C, D.*/
    public static void Swap(double[] X, double[] Y) {
        double temp = X[0];
        X[0] = Y[0];
        Y[0] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] A = new double[1];

        double[] B = new double[1];

        double[] C = new double[1];

        double[] D = new double[1];
        System.out.print("Введите число A: ");
        A[0] = in.nextDouble();
        System.out.print("Введите число B: ");
        B[0] = in.nextDouble();
        System.out.print("Введите число C: ");
        C[0] = in.nextDouble();
        System.out.print("Введите число D: ");
        D[0] = in.nextDouble();
        Swap(A, B);
        Swap(C, D);
        Swap(B, C);
        System.out.println("A = " + A[0] + " B = " + B[0] + " C = " + C[0] + " D = " + D[0]);
    }
}

