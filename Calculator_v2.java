public class Calculator_v2
{

    public static final double PI=3.1415;
    public double add(double a, double b)
    {
        return a+b;
    }

    public double subtract(double a, double b)
    {
        return a-b;
    }

    public double multiply(double a, double b)
    {
        return a*b;
    }

    public double divide(double numerator, double denominator)
    {
        if (denominator == 0)
        {
            return numerator;
        }
        return numerator / denominator;
    }

    public double power(double base, double exponent)
    {
        return Math.pow(base,exponent);
    }

    public double calculateSurfaceCircle(double radius)
    {
        return radius*radius*PI;
    }

    public boolean logicOr(boolean a , boolean b)
    {
        return a||b;
    }

    public boolean logicAnd(boolean a , boolean b)
    {
        return a&&b;
    }

    public boolean logicNot(boolean a )
    {
        return !a;
    }

    public int addInt(double a, double b)
    {
        return (int)a + (int)b;
    }

    public int subtractInt(double a, double b)
    {
        return (int)a - (int)b;
    }

    public int multiplyInt(double a, double b)
    {
        return (int)a * (int)b;
    }

    public int divideInt(double numerator, double denominator)
    {
        int n = (int) numerator;
        int d = (int) denominator;
        if (d == 0)
        {
            return n;
        }
        return n / d;
    }

    public int powerInt(double base, double exponent)
    {
        return (int)Math.pow((int)base, (int)exponent);
    }

    //Calculator v2

    public boolean isPrime(int number)
    {
        if (number < 2)
        {
            return false;
        }
        for (int i = 2; (long) i * i <= number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public int fibonacciNumber(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;

        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= N; i++)
        {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public boolean armstrongNumbers(int number, int power)
    {
        int temp = number;
        long sum = 0;
        while (temp > 0)
        {
            int digit = temp % 10;
            sum += (long) Math.pow(digit, power);
            temp /= 10;
        }
        return sum == number;
    }

    public int factorial(int number)
    {
        int result = 1;
        for (int i = 2; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }

    public int numberReversal(int number)
    {
        int reversed = 0;
        while (number != 0)
        {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public int[] productMaximiser(int[] a, int[] b)
    {
        int bestI = 0;
        int bestJ = 0;
        long maxProduct = Long.MIN_VALUE;

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                long product = (long) a[i] * b[j];
                if (product > maxProduct)
                {
                    maxProduct = product;
                    bestI = i;
                    bestJ = j;
                }
            }
        }
        return new int[]{bestI, bestJ};
    }

}