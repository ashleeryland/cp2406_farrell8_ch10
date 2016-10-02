/**
 * Created by Ashlee on 28/09/2016.
 */

public class DemoPoems
{
    public static void main(String[] args)
    {
        Poem poem1 = new Poem("Poem One", 45);
        Couplet poem2 = new Couplet("My Poem");
        Limerick poem3 = new Limerick("Another Poem");
        Haiku poem4 = new Haiku("And Another");
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);
    }

    public static void display(Poem p)
    {
        System.out.println("Poem: " + p.getTitle() +
                "   Lines: " + p.getLines());
    }
}
