package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");
        List<String> list3 = List.of("G", "H", "I");

        List<List<String>> nestedColl = Arrays.asList(list1, list2, list3);
        System.out.println("nested Collection");
        System.out.println(nestedColl);

        System.out.println("Flattening by using flatMap()");

        nestedColl.stream()
                .flatMap(List-> List.stream())
                .forEach(System.out::print);
    }
}
