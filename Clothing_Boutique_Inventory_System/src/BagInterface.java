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

public interface BagInterface<T> {

	/** Add a new entry to the bag
	    input to this method is newEntry; this is the object to be added
	    this method will return true if the addition was successful; false if not */
    public boolean add(T newEntry);

	/** Return all the entries in the bag and store them in an array */
    public T[] toArray();

}