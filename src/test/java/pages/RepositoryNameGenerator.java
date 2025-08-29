package pages;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RepositoryNameGenerator{

    public static String generateRandomName(String namePart) {
        return namePart + "_" + RandomStringUtils.randomAlphanumeric(4);
    }
}
