package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

//Fetching first character using flatMap

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo3 {
    public static void main(String[] args) {
        List<String> listOfName = Arrays.asList("Rima", "Uday", "Birla", "Yash");
        listOfName.stream()
                .flatMap(str-> Stream.of(str.charAt(0)))
                .toList()
                .forEach(System.out::print);

    }
}
