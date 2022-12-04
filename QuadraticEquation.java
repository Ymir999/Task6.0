package Task60;

public class QuadraticEquation {
    static double A = 1;
    static double B = 10;
    static double C = -39;



    public static double discriminant()
    {
        double Dis = 0;
        if(A != 0)
        {
            Dis = Math.sqrt((B * B) - (4 * A * C));
        }
        return Dis;
    }

    public static void findingX()
    {
        double x1 = 0;
        double x2 = 0;
        x1 = (-B - discriminant()) / (2 * A);
        x2 = (-B + discriminant()) / (2 * A);
        if(discriminant() > 0)
        {
            System.out.println("Ответ: " + "x1 = " + x1 + " и " + "x2 = " + x2);
        }
        else if(discriminant() == 0)
        {
            System.out.println("Ответ: " + "x1,2 = " + x1);
        }

    }

}
