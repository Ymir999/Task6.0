package Task60;

public class Factorial {
    static int x = 5;
    static int y = 3;



    public static int FaX()
    {
        int result = 1;
        for(int i = 1; i <= x; i++)
        {
            result  = result * i;
        }
        return result;
    }
    public static int FaY()
    {
        int result = 1;
        for(int i = 1; i <= y; i++)
        {
            result = result * i;
        }
        return result;
    }
    public static int FaXY()
    {
        int result = 1;
        int xy = x - y;
        for(int i = 1; i < xy; i++)
        {
            result = result * i;
        }
        return result;
    }



    public static int formulaFactorial()
    {

        int C = 0;

        if(x >= y)
        {
            C = FaX() / FaY() * FaXY();
        }

        return C;
    }

}
