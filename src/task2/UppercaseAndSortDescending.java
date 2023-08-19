package task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class UppercaseAndSortDescending {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Olena", "Ihor", "Dmytro", "Anna", "Alex", "Ivanka", "Tetiana");
        names.replaceAll(String::toUpperCase);
        List<String>sortedList=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        names.stream().map(name -> name.toUpperCase());
        sortedList.forEach(name -> {

            System.out.println(name);
        });
    }
}