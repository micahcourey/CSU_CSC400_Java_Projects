import java.util.*;
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
public class PeopleQueue {

    public static void main(String[] args) {
        PriorityQueue<Person> peopleQueue = new PriorityQueue<>();
        Scanner s = new Scanner(System.in);
        String firstNameIn;
        String lastNameIn;
        int ageIn = 0;
        int count = 1;
        boolean done = false;

        System.out.println("Enter the first name, last name and age of 5 people.");
        while(peopleQueue.size() < 5) {
            System.out.println("Enter a person");
            System.out.print("First Name: ");
            firstNameIn = s.nextLine();
            System.out.print("Last Name: ");
            lastNameIn = s.nextLine();
            System.out.print("Age: ");
            while(!done) {
                try {
                    ageIn = Integer.parseInt(s.nextLine());
                    done = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a number for age");
                    System.out.print("Age: ");
                }
            }
            Person person = new Person(firstNameIn, lastNameIn, ageIn);
            peopleQueue.add(person);
            System.out.println("Added to queue: " + firstNameIn + " " + lastNameIn + ", Age: " + ageIn + "\n");
            done = false;
        }

        NameCompare nameCompare = new NameCompare();
        List<Person> people = new ArrayList(peopleQueue);
        Collections.sort(people, nameCompare);

        System.out.println("Sorted by Last Name\n");
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Name: " + people.get(i).getFirstName() + " "
                                        + people.get(i).getLastName() + ", Age: "
                                        + people.get(i).getAge());
        }


        System.out.println("\nSorted by Age and removed from queue\n");
        while (!peopleQueue.isEmpty()) {
            System.out.println("Removed Person " + count + " -" + peopleQueue.remove());
            count++;
        }
    }
}
