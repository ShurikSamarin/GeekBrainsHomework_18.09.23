import java.util.*;

public class FindDuplicateEmployees {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
            "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет количества повторений имен
        for (String employee : employees) {
            String[] parts = employee.split(" ");
            String firstName = parts[0];

            nameCountMap.put(firstName, nameCountMap.getOrDefault(firstName, 0) + 1);
        }

        // Создание списка сотрудников с повторяющимися именами
        List<String> duplicateEmployees = new ArrayList<>();

        for (String employee : employees) {
            String[] parts = employee.split(" ");
            String firstName = parts[0];

            if (nameCountMap.get(firstName) > 1 && !duplicateEmployees.contains(employee)) {
                duplicateEmployees.add(employee);
            }
        }

        // Сортировка списка по популярности (количеству повторений)
        duplicateEmployees.sort(Comparator.comparingInt(employee -> nameCountMap.get(employee.split(" ")[0])).reversed());

        // Вывод сотрудников с повторяющимися именами и количеством повторений
        System.out.println("Сотрудники с повторяющимися именами (отсортированные по популярности):");
        for (String employee : duplicateEmployees) {
            int count = nameCountMap.get(employee.split(" ")[0]);
            System.out.println(employee + ": " + count);
        }
    }
}
