package javaeight.streamapi;

import interview.one.EmployeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        Stream<Object> empty = Stream.empty();
        empty.forEach(value-> {
            System.out.println(value);
        });

//        get the name of String
        String[] name={"poojad","neetu","jittu"};
        Stream<String> streamName = Stream.of(name);
        streamName.forEach(item->{
            System.out.println(item);
        });
//        another methods to get stream
        Stream<Object> buildStream = Stream.builder().build();
        IntStream streamArray = Arrays.stream(new int[]{12, 45, 7, 8});
        streamArray.forEach(item->{
            System.out.println(item);
        });


        List<Integer> intList = new ArrayList<>();
        intList.add(47);
        intList.add(14);
        intList.add(45);
        intList.add(74);
        intList.add(78);

        Stream<Integer> streamIntList = intList.stream();
        streamIntList.forEach(integer -> {
            System.out.println(integer);
        });

//        System.out.println(EmployeService.getEmployeList());

    }
}
