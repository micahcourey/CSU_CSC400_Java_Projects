import java.util.Comparator;
/**
 Name: Micah Courey
 Project Name: CSC400 - Portfolio Project Option #1
 Project Purpose: The program prompts a user to enter 5 people's first name, last name and age and the program
 adds these 5 people to a queue then sorts them by last name and age in descending order.
 Algorithm Used: Priority queue
 Program Inputs: The program prompts the user to enter the first name, last name and age of 5 people.
 Program Outputs: The program outputs the 5 people the user adds to the queue in descending or by age and last name.
 Program Limitations: Only 5 users can be entered into the queue due to program specifications.
 Program Errors: Error handling is implemented for the age input with a try/catch block to handle users inputting a
 wrong data type.
 */
public class NameCompare implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        int i = p1.getLastName().compareTo(p2.getLastName());
        if(i != 0) return -i;
        return i;
    }
}
