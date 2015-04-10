/**
 * Created by Mfarsikov on 10.04.2015.
 */
public class OOP {

    public static void main(String[] args) {
        // oopIntro();

        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = new Cat("Tom", 2);

        System.out.println("they are equal using ==: " + (cat1 == cat2));

        System.out.println("they are equal using equals(): " + cat1.equals(cat2));

    }

    public static void oopIntro() {
        Cat.pawCount();

        System.out.println(Cat.pawCount());

        Cat cat1 = new Cat("Tom", 2);


        System.out.println("default toString: " + cat1);

        Cat cat2 = new Cat("Murzik", 1);

        Vet vet = new Vet();

        vet.registerCat(cat1);
        vet.registerCat(cat2);
        vet.print();

        vet.makeVaccine();

        vet.print();

        System.out.println();
    }

}
