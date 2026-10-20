public class FizzBuzz
{
    private int startNumber;
    private int endNumber;

    public FizzBuzz(int startNumber, int endNumber)
    {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public void fizzBuzz()
    {
        generateBuzzString(startNumber, endNumber);
    }

    public void fizzBuzzOne()
    {
        generateBuzzString(startNumber, startNumber);
    }

    private void generateBuzzString(int start, int end)
    {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                result.append("fizzbuzz ");
            }
            else if (i % 3 == 0)
            {
                result.append("fizz ");
            }
            else if (i % 5 == 0)
            {
                result.append("buzz ");
            }
            else
            {
                result.append(i).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}