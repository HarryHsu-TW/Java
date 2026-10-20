public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int totalSeconds)
    {
        this.hours = totalSeconds/3600;
        this.minutes = (totalSeconds%3600)/60;
        this.seconds = totalSeconds%60;
    }

    public void tick()
    {
        seconds++;
        if (seconds==60)
        {
            seconds=0;
            minutes++;
        }
        if (minutes==60)
        {
            minutes=0;
            hours++;
        }
        if (hours==24)
        {
            hours = 0;
        }
    }

    public int timeInSeconds()
    {
        return hours*3600+minutes*60+seconds;
    }

    public void displayTime()
    {
        System.out.println("The time is:");
        System.out.printf("%02d:%02d:%02d%n", hours,minutes,seconds);
    }
}