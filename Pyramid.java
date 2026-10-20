public class Pyramid
{
    private double lengthOfTheBase;
    private double height;
    private int numberOfSides;

    public Pyramid(double lengthOfTheBase,double height, int numberOfSides)
    {
        this.lengthOfTheBase=lengthOfTheBase;
        this.height=height;
        this.numberOfSides=numberOfSides;
    }

    public double getVolume()
    {
        double area;
        if (numberOfSides==3)
        {
            area=(Math.sqrt(3)/4)*lengthOfTheBase*lengthOfTheBase;
        }
        else
        {
            if (numberOfSides!=4)
            {
                numberOfSides=4;
                System.out.println("Number of side changed to 4");
            }
            area=lengthOfTheBase*lengthOfTheBase;
        }
        double volume=(1.0/3.0)*area*height;
        return Math.abs(volume);

    }
}

