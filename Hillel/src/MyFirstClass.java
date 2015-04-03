/**
 * Created by Mfarsikov on 03.04.2015.
 */
public class MyFirstClass {
    public static void main(String[] params) {

        greetings();
        age();

        long i = 1233213213213213L;




        double height = 172;
        double weight = 71;

        double ratio = weight / height;



        System.out.println(ratio);


    }

    public static void age() {
        int age = 30;

        int i = 1;

        System.out.println(" is my age " + (age + i));
    }

    public static void greetings() {
        //commented text

        /*
         some other text
         */

        String a = "Hello World!";

        System.out.println(a);

        String greeting = "My name is ";
        String name = "Max";

        String result = greeting + name;

        System.out.println(result);
    }

}
