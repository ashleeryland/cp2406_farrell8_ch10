/**
 * Created by Ashlee on 28/09/2016.
 */
import java.util.*;
public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();

        item1.setInvoiceNum(1234);
        item1.setDescription("Dog Leash");
        item1.setPrice(19.99);

        item2.setInvoiceNum(4321);
        item2.setDescription("Fish Food");
        item2.setPrice(5.76);

        pet1.setInvoiceNum(1122);
        pet1.setDescription("Staffy");
        pet1.setPrice(199.01);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(false);
        pet1.setIsHousebroken(true);

        pet2.setInvoiceNum(2211);
        pet2.setDescription("Tom cat");
        pet2.setPrice(10.09);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(false);

        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        System.out.println("\nInvoice Number:" + item.getInvoiceNum());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Price is $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("Vaccinated: " + item.getIsVaccinated());
        System.out.println("Neutered: " + item.getIsNeutered());
        System.out.println("Housebroken: " + item.getIsHousebroken());
    }
}