package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedNumbersFromArray {
    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};

        String sortedNumbers = Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream((s.split(",\\s*"))))
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);
    }
}