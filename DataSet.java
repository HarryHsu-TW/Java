import java.util.ArrayList;
import java.util.List;

public final class DataSet
{
    private List<Double> values;

    public DataSet()
    {
        this.values = new ArrayList<>();
    }

    public DataSet(double[] input)
    {
        this();
        for (double value : input)
        {
            add(value);
        }
    }



    public void add(double value)
    {
        values.add(value);
    }

    public double getSmallest()
    {
        if (values.isEmpty())
        {
            return 0.0;
        }
        double smallest = values.get(0);
        for (double value:values)
        {
            if (value < smallest)
            {
                smallest = value;
            }
        }
        return smallest;
    }

    public double getLargest()
    {
        if (values.isEmpty())
        {
            return 0.0;
        }
        double largest = values.get(0);
        for (double value:values)
        {
            if (value > largest)
            {
                largest = value;
            }
        }
        return largest;
    }

    public double getAverage()
    {
        if (values.isEmpty())
        {
            return 0.0;
        }
        double sum = 0;
        for (double value : values)
        {
            sum += value;
        }
        return sum / values.size();
    }

    public double getRange()
    {
        return getLargest()-getSmallest();
    }
}