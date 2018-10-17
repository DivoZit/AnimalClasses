package lt.kaunascoding.Kingdom;

import java.util.Scanner;

public class AnimalFactory {
    public AnimalFactory(Scanner sc) {
        String gyvunas = null;
        while (sc.hasNext()) {
            Animal obj = getAnimal(sc.next(), sc);
            gyvunas += obj.mammal();
        }
    }

    public Animal getAnimal(String next, Scanner sc) {
        Animal result = null;
        switch (next.toLowerCase()) {
            do {
                result = new Dog(sc.nextLine());
                break;
            } while (sc.hasNext());
            return result;
        }
    }
}