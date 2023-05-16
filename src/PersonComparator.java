import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxLastNameWords;

    public PersonComparator(int maxLastNameWords) {
        this.maxLastNameWords = maxLastNameWords;
    }

    @Override
    public int compare(Person p1, Person p2) {
        String[] p1LastName = p1.getSurname().split(" ");
        String[] p2LastName = p2.getSurname().split(" ");

        int p1LastNameWords = p1LastName.length;
        int p2LastNameWords = p2LastName.length;
        boolean p1IsNoble = p1LastNameWords >= maxLastNameWords;
        boolean p2IsNoble = p2LastNameWords >= maxLastNameWords;

        if (p1IsNoble && !p2IsNoble) {
            return -1;
        } else if (!p1IsNoble && p2IsNoble) {
            return 1;
        } else {
            if (p1LastNameWords > p2LastNameWords) {
                return -1;
            } else if (p1LastNameWords < p2LastNameWords) {
                return 1;
            } else {
                if (p1.getAge() > p2.getAge()) {
                    return -1;
                } else if (p1.getAge() < p2.getAge()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}