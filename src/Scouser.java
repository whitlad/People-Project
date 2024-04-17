public class Scouser extends Person
{
    public Scouser(String aFirstName, String aSecondName, int anAge)
    {
        //the first line needs to be the call to superclass

        super(aFirstName, aSecondName, anAge); //this has to be the 1st line



    }
    @Override
    public void greeting()
    {
        int i = 0;

        super.greeting(); //call the one in the super method as well as the one specific one

        System.out.println("Arite, cocker!");
    }

}