/**
 * Created by Ashlee on 28/09/2016.
 */
public class DemoHorses
{
    public static void main(String args[])
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setNameHorse("James");
        horse1.setColor("Black & White");
        horse1.setBirthYear(1993);
        horse2.setNameHorse("Missy Horsey");
        horse2.setColor("Brown");
        horse2.setBirthYear(2009);
        horse2.setRaces(3);
        System.out.println(horse1.getNameHorse() + " is " +
                horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getNameHorse() + " is " +
                horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getNameHorse() + " has been in " + horse2.getRaces() + " races.");
    }
}
