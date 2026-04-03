package org.aditya;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        var uniqueStrings = List.of("Aditya", "Aditi", "Anu", "Anita", "Bhumika", "UPSC");
        var symbols = List.of("!", "@", "#", "$", "%");
        var numbers = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        String fourDigitNumber = random.ints(4, 0, numbers.size())
                .mapToObj(numbers::get)
                .map(String::valueOf)
                .collect(Collectors.joining());
        var password = uniqueStrings.get(random.nextInt(uniqueStrings.size())) + symbols.get(random.nextInt(symbols.size())) + fourDigitNumber;
        System.out.println(password);
    }
}