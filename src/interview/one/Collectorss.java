package interview.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectorss {
    public static void main(String[] args) {

        List<String> listName = List.of("Pooja", "Neetu", "jitendra");
        listName.stream().filter(name -> name.startsWith("N")).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("skip duplicate elements");
        listName.stream().filter(name -> name.startsWith("N")).collect(Collectors.toSet()).forEach(System.out::println);

//        map with collector
        Map<String, Integer> collect = listName.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(collect);


    }
}
