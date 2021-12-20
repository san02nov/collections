package tests.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Person Vova = new Person(1001, "Vova", 35);
        personList.add(Vova);

        Person Mash = new Person(55, "Masha", 20);
        personList.add(Mash);

        Person Vadim = new Person(3011, "Vadim", 24);
        personList.add(Vadim);

        Person Lena = new Person(44,"Lena", 21);
        personList.add(Lena);
        System.out.println("After sorting \n" + personList);
        //Collections.sort(personList, new Person.IdComparator());
        Collections.sort(personList, new Person.NameComparator());

        System.out.println("Before sorting \n" + personList);








    }
}
