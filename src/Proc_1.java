import java.util.*;
public class Proc_1 {
    /*Описать процедуру PowerA3(A, B),
    вычисляющую третью степень числа A и возвращающую ее в переменной B
    (A — входной, B — выходной параметр; оба параметра являются вещественными).
    Вычислить сумму кубов целых чисел на промежутке от x до y.
    */
    public static void PowerA3(double A, double[] B) { // Создание процедуры
        B[0] = Math.pow(A, 3); // Вычисление третьей степени числа A
    }

    public static void main(String[] args) { // Запуск программы
        Scanner in = new Scanner(System.in);// Создание объекта Scanner

        System.out.print("Введите число A: "); // Ввод числа A
        double A = in.nextDouble(); // Ввод числа A
        double[] B = new double[1]; // Массив для возврата результата
        PowerA3(A, B); // Вызов процедуры
        System.out.println("Куб числа " + A + " равен " + B[0]); // Вывод результата
    }
}