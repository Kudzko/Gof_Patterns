package by.kudko.simple;

public class MainTest {
    public static void main(String[] args) {
        A a = new A.Builder()
                .withId(10)
                .withName("Vasya")
                .withSurname("Иванов")
                .build();

        System.out.println(a);
    }

}
