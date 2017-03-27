/**
 Name: Micah Courey
 Project Name: CSC400-CTA2
 Project Purpose: A Clothing Boutique Inventory System to store clothing items.
 Algorithm Used: The Bag ADT is implemented through the use of a fixed-sized array.
 Program Inputs: No user inputs are implemented, instead the BoutiqueBagDemo test class is used to input items and test methods.
 Program Outputs: Contents of clothing bag, result array and helpful error messages.
 Program Limitations: The program currently does not allow user input because it was not required in the assignment specifications.
 Program Errors: The program handles errors for exceeding maximum capacity and improper initialization.
 */

public class BoutiqueBagDemo {

    public static void main(String[] args) {
        /** Adding to an initially empty clothing bag with sufficient capacity */
        System.out.println("Testing an initially empty bag with the capacity to hold a least 6 strings");
        BagInterface<String> aClothingBag = new ClothingBag<> ();
        String[] contentsOfBag1 = {"Red Shirt", "Black Pants", "Blue Dress", "Black Shoes", "Brown Belt", "Purple Jacket"};
        testAdd(aClothingBag, contentsOfBag1);

        /** Filling an initially empty bag to capacity */
        System.out.println("\nFilling an initially empty bag to capacity ensuring it doesn't exceed the defined max capacity which has been set to 7 items");
        aClothingBag = new ClothingBag<>(7);
        String[] contentsOfBag2 = {"Pink Hat", "Black Pants", "Blue Dress", "Black Shoes", "Red Shirt", "Brown Belt", "Purple Jacket", "Yellow Socks"};
        testAdd(aClothingBag, contentsOfBag2);
    }

    /** Tests the method add */
    private static void testAdd(BagInterface<String> aClothingBag, String[] content)
    {
        System.out.print("Adding the following " + content.length + " items to the bag: ");
        for (int index = 0; index < content.length; index++)
        {
            if(aClothingBag.add(content[index]))
                System.out.print(content[index] + ", ");
            else
                System.out.print("\nUnable to add " + content[index] + " to the bag.");
        }
        System.out.println();

        displayBag(aClothingBag);
    }

    /** Tests the method toArray while displaying the bag */
    private static void displayBag(BagInterface<String> aClothingBag)
    {
        System.out.println("The clothing bag contains the following item(s):");
        Object[] clothingBag = aClothingBag.toArray();
        for (int index = 0; index < clothingBag.length; index++)
        {
            System.out.print(clothingBag[index] + ", ");
        }
        System.out.println();
    }
}
