import java.util.*;
public class Proc_3 {
    /*Описать процедуру Mean(X, Y, AMean, GMean),
    вычисляющую среднее арифметическое AMean = (X+Y)/2
    и среднее геометрическое GMean = (X·Y)1/2
    двух положительных чисел X и Y (X и Y — входные,
    AMean и GMean — выходные параметры вещественного типа).
    С помощью этой процедуры найти среднее арифметическое
    и среднее геометрическое для пар (A, B), (A, C), (A, D),
    если даны A, B, C, D.
    */
    public static void Mean(double x, double y, double[] AMean, double[] GMean) {
        AMean[0] = (x + y) / 2;
        GMean[0] = Math.pow(x * y, 0.5);
    }

    // Ввод параметров A, B, C, D.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] XY = new double[4];
        System.out.print("Введите числа A, B, C, D: ");
        for (int i = 0; i < 4; i++) {
            XY[i] = in.nextDouble();
        }
        /* Альтернативный вариант(Китайский?)
        System.out.print("Введите число A: ");
        double A = in.nextDouble();
        System.out.print("Введите число B: ");
        double B = in.nextDouble();
        System.out.print("Введите число C: ");
        double C = in.nextDouble();
        System.out.print("Введите число D: ");
        double D = in.nextDouble();
         */
        double[] AMean = new double[1];
        double[] GMean = new double[1];
        // Вызов процедуры и вывод результата
        Mean(XY[0], XY[1], AMean, GMean);
        System.out.println("Среднее арифметическое (A, B) = " + AMean[0] + "\nСреднее геометрическое (A, B) = " + GMean[0]);

        Mean(XY[0], XY[2], AMean, GMean);
        System.out.println("Среднее арифметическое (A, C) = " + AMean[0] + "\nСреднее геометрическое (A, C) = " + GMean[0]);

        Mean(XY[0], XY[3], AMean, GMean);
        System.out.println("Среднее арифметическое (A, D) = " + AMean[0] + "\nСреднее геометрическое (A, D) = " + GMean[0]);
    }
}