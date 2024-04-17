/**
 *
 *
 * @author Dawn Whitla
 * @version 17/04/2024
 */


public class Person
{
    private String firstname;
    private String secondname;

    private int age;   //date of birth may be better

//CONSTRUCTOR

/**
 * Constructor to create an object of the person Class
 * @param aFirstName first name of the person
 * @param aSecondName second name of the person
 * @param anAge age of the person
 *
 *
*/

public Person( String aFirstName, String aSecondName, int anAge) {

    this.firstname = aFirstName;
    this.secondname = aSecondName;
    this.age = anAge;

}

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public int getAge() {
        return this.age;
    }

    // SETTER

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }



    // METHOD FOR A BIRTHDAY

    public void Birthday()
    {
        this.age ++;
    }

    /**
     * outputs standard greeting hello
     */
    public void greeting()
{
    System.out.println("Hello");
}

    /**
     * returns a string describing the state of a person object
     * @return a string describitng the state of a person object
     */
//to string method

    @Override

    public String toString()
    {
    return  "An Object of " + this.getClass() + "  " + this.getFirstname() +"  " + this.getSecondname() + "  " + this.getAge();

//return "An Object of" + this.getClass() + "with name" this.getName() + "and age" this.getAge();

    }
}
