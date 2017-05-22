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
public class Person implements Comparable<Person> {

    private int age;
    private String firstName;
    private String lastName;

    public Person(String first, String last, int theirAge) {
        this.firstName = first;
        this.lastName = last;
        this.age = theirAge;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Person person) {
        if(this.equals(person))
            return 0;
        else if(getAge() < person.getAge())
            return 1;
        else
            return -1;
    }

    public String toString() {
        return " Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge();
    }


}
