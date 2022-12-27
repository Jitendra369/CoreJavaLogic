package interview.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {
    public static void main(String[] args) {

        List<String> names = List.of("Abhinav","Swapnil","Sumedh","Ankush","Pratik");
        List<String> trueFriend = names.stream().filter(item -> item.startsWith("A")).collect(Collectors.toList());
        List<String> evailFriend = names.stream().filter(item -> item.length()>5).collect(Collectors.toList());
        System.out.println(trueFriend);
        System.out.println(evailFriend);
//        trueFriend.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        Map
        List<Integer> integers = List.of(12, 45, 14, 12, 15);
        List<Integer> collectInteger = integers.stream().map(item -> item * item).collect(Collectors.toList());
//        System.out.println(collectInteger);
        collectInteger.stream().forEach(item->
                System.out.println(item)
        );

//        method reference
        collectInteger.stream().forEach(System.out::println);

//      Sorted list
        System.out.println("Sorted List");
        collectInteger.stream().sorted().forEach(System.out::println);
//       Distinct Items
        collectInteger.stream().distinct().forEach(System.out::println);

//        min
        System.out.println("min number in the list");
        Integer integer = collectInteger.stream().min((number1, number2) -> number1.compareTo(number2)).get();
        System.out.println(integer);
    }
}
