package pages;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RepositoryNameGenerator {

    public static String generateRandomName() {
        Random random = new Random();
        List<String> names = Arrays.asList("Mario", "Marcelo", "Leonardo", "Dimitri", "Alexander", "Ilya", "Evgeniy", "Sergey", "Vladimir", "Anatoly", "Olga", "Valeria", "Oksana");
        var randomIndex = random.nextInt(names.size());
        var randomName = names.get(randomIndex);
        return randomName + "_" + random.nextInt(1000);
    }
}
