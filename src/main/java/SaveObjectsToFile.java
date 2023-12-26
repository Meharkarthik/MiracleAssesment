import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SaveObjectsToFile {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Request user input for creating Person objects
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Enter age for person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            people.add(new Person(name, age));
        }

        // Save the array of objects to a text file using Java Streams
        saveObjectsToFile(people);
    }

    private static void saveObjectsToFile(List<Person> people) {
        // Use Java Streams to convert objects to strings and write to the file
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("people.txt"), StandardOpenOption.CREATE)) {
            people.stream()
                    .map(Person::toString)
                    .forEach(personString -> {
                        try {
                            writer.write(personString);
                            writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

            System.out.println("Objects saved to file: " + "people.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
