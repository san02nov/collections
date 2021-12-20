package tests.task1;

import java.util.Comparator;

public class Person  {
    int id;
    String name;
    int h;

    public Person(int id, String name, int h) {
        this.id = id;
        this.name = name;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", h=" + h +
                '}';
    }

   /* @Override
    public int compareTo(Person o) {
     *//*   if (this.id == o.id) {
            return 0;
        }
        else if (this.id < o.id){
            return -1;
                    }
        else {
            return 1;
        }*//*
         //return this.id - o.id;
        return this.name.compareTo(o.name);*/

   public static class IdComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1.id == o2.id) {
                return 0;
            }
            else if (o1.id < o2.id){
                return -1;
            }
            else {
                return 1;
            }
        }
    }

    public static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);




        }
    }

}




