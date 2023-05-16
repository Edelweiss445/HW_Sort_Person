import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<>();// заполнение массива
        peopleList.add(new Person("Вася", "Пучкин Тучкин", 26));
        peopleList.add(new Person("Виталий", "Губкин Боб Спанч", 19));
        peopleList.add(new Person("Крендель", "Джавин Магомед Ильхам", 32));
        peopleList.add(new Person("Христофер", "Букин Кукин", 29));
        peopleList.add(new Person("Леонардо", "ди сер Пье́ро да Ви́нчи", 18));
        System.out.println(peopleList);

        Collections.sort(peopleList, new PersonComparator(4)); // сортировка
        System.out.println(peopleList);


    }
}

