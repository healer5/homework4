package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexedNames  {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Olena", "Ihor", "Dmytro", "Anna", "Alex", "Ivanka", "Tetiana");
        String result = formatNames(names);
        System.out.println(result);

    }
    public static String formatNames(List<String> names){
        return IntStream
                .range(0, names.size())
                .filter(i -> i%2 != 0)
                .mapToObj(i ->(i) + ". " +names.get(i))
                .collect(Collectors.joining(", "));
    }
}

