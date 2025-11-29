package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 {
    public static void main(String[] args ) {

        //Write a Java program to flatten a nested collection (List of Lists) into a single List using the flatMap() method of Java Streams.

        List<String> indianPlayer = Arrays.asList("Rohit", "Mahi", "Gill", "Hardik");
        List<String> engPlayer = Arrays.asList("Stoke", "Root", "Brook", "Butler");

        List<List<String>> nestedColl = List.of(indianPlayer, engPlayer);

        System.out.println("Nested Collection");
        System.out.println(nestedColl);

        System.out.println("Flattening using flatMap");

        List<String> flatMap = nestedColl.stream()
                .flatMap(list-> list.stream())
                .toList();

        System.out.println(flatMap);


    }
}
