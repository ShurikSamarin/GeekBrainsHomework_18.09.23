//package Task_1;

/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.add("", "23443643", "Sidorov");
        phones.add("421275", "234435", "Ivanov");
        phones.add("214627", "", "Petrov");
        System.out.println(phones.findByName("Sidorov"));
        System.out.println(phones.getList());
    }
}