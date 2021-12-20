package ex4;

//Пример №4. Применение класса HashSet. ВОПРОС: ПОЧЕМУ ПОРЯДОК ВЫВОДА
//СОДЕРЖИМОГО ОБЪЕКТА HASHSET НЕ СООТВЕТСТВУЕТ ПОРЯДКУ ДОБАВЛЕНИЯ
 //       ЭЛЕМЕНТОВ В МНОЖЕСТВО?
import java.util.HashSet;
 import static org.junit.Assert.*;
public class HashSetDemoTest {
    HashSet<String> hashSet;
    HashSet<String> clonedHashSet;

    @org.junit.jupiter.api.Test
    public void test() {
// создать хеш-множество
        hashSet = new HashSet<String>();
// добавить элементы в хеш-множество
        hashSet.add("Славянская Елена");
        hashSet.add("Левандовская Анна");
        hashSet.add("Владова Алина");
        hashSet.add("Поплавская Эльвира");
        hashSet.add("Воронцова Наталья");
        hashSet.add("Южная Елизавета");
        for (String s : hashSet) {
            System.out.println(s);
        }
        clonedHashSet = (HashSet<String>) hashSet.clone();
        System.out.println("--------------------------------------");
                System.out.println("Дубликат хеш-множества:");
        for (String s : clonedHashSet) {
            System.out.println(s);
        }
        assertEquals(hashSet, clonedHashSet);
        // метод assertEquals() проверяет совпадают ли существующий объект и полученный
    }
}