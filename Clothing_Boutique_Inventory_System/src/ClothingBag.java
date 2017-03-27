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

public final class ClothingBag<T> implements BagInterface<T>
{
    private final T[] myBag;
    private int numberOfProducts;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10000;

    /** Creates an empty bag with the capacity set to the default size */
    public ClothingBag()
    {
        this(DEFAULT_CAPACITY);
    }

    /** Creates an empty bag having a given initial capacity
        @param capacity  The integer capacity desired. */
    public ClothingBag(int capacity)
    {
        if (capacity <= MAX_CAPACITY)
        {
            /** The cast is safe because the new array contains null entries */
            @SuppressWarnings("unchecked")
            T[] tempClothingBag = (T[])new Object[capacity]; // Unchecked cast
            myBag = tempClothingBag;
            numberOfProducts = 0;
            initialized = true;
        }
        else
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum.");
    }

    /** Throws an exception if object is not initialized */
    private void checkInitialization()
    {
        if (!initialized)
            throw new SecurityException("ClothingBag object is not initialized properly.");
    }

    /** Adds a new product to this clothing bag.
        @param newProduct the object to be added as a new clothing product.
        @return True if the addition is successful or false if not successful. */
    public boolean add(T newProduct)
    {
        checkInitialization();
        boolean result = true;
        if (isFull())
        {
            result = false;
        }
        else
        {
            myBag[numberOfProducts] = newProduct;
            numberOfProducts++;
        }

        return result;
    }

    /** Retrieves all entries that are in this clothing bag
        @return  A newly allocated array of all the entries in the clothing bag */
    public T[] toArray()
    {
        checkInitialization();
        /** The cast is safe because the new array contains null entries. */
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfProducts];
        System.out.println("result array allocated");
        for(int index = 0; index < numberOfProducts; index++)
        {
            result[index] = myBag[index];
        }

        return result;
    }

    // Returns true if the clothingBag is full, or false if in is not full
    private boolean isFull()
    {
        return numberOfProducts >= myBag.length;
    }
}


