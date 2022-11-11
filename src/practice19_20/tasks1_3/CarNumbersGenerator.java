package practice19_20.tasks1_3;

import java.util.Random;

public class CarNumbersGenerator {
    private static final char[] LETTERS = {
            'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'
    };
    public String generateCarNumber() {
        StringBuilder carNumber = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            carNumber.append(randomDigit());
        }
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(LETTERS.length);
            char letter = LETTERS[index];
            if (i == 0) {
                carNumber.insert(0, letter);
            }
            else {
                carNumber.append(letter);
            }
        }

        int region = randomRegion();
        if (region < 10) {
            carNumber.append(0);
        }
        carNumber.append(region);
        return carNumber.toString();
    }

    public static int randomDigit() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static int randomRegion() {
        Random random = new Random();
        return random.nextInt(200);
    }
}
