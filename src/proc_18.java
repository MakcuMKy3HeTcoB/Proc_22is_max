import java.util.*;
public class proc_18 {
    /*Описать функцию CircleS(R) вещественного типа,
    находящую площадь круга радиуса R (R — вещественное).
    С помощью этой функции найти площади трех кругов с данными радиусами.
    Площадь круга радиуса R вычисляется по формуле S = π·R2.
    В качестве значения π использовать 3.14.*/
    public static void CircleS(double R) {
        System.out.println("Площадь круга с радиусом " + R + " = " + 3.14 * Math.pow(R, 2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] R = new double[3];
        System.out.print("Введите радиус первого круга: ");
        R[0] = scan.nextDouble();
        System.out.print("Введите радиус второго круга: ");
        R[1] = scan.nextDouble();
        System.out.print("Введите радиус третьего круга: ");
        R[2] = scan.nextDouble();
        CircleS(R[0]);
        CircleS(R[1]);
        CircleS(R[2]);
    }
}
