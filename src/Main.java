// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person p = new Person("Dawn", "Whitla", 21);



        System.out.println(p.toString());
        p.greeting();

        Scouser s = new Scouser("Sinbad", "Sweeney", 21);
        System.out.println(s.toString());
        s.greeting();

        Irish i = new Irish ("Tom", "Ohara", 55);
        System.out.println(i.toString());
        i.greeting();
        }



    }
