package Zoo;
import java.util.ArrayList;
import java.util.List;
public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Лев");
        animals.add("Тигр");
        animals.add("Зебра");
        animals.add("Слон");
        animals.add("Жираф");
        animals.add("Вовк");
        animals.add("Лисиця");
        animals.add("Мавпа");

        // Видалити 3, 5 та 7 тварини
        animals.remove(6); // Видалити тварину з індексом 6 (7-1)
        animals.remove(4); // Видалити тварину з індексом 4 (5-1)
        animals.remove(2); // Видалити тварину з індексом 2 (3-1)

        // Вивести розмір списку у консоль
        System.out.println("Розмір списку: " + animals.size());

        // Вивести список у консоль
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}