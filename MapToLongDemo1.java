package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class MapToLongDemo1 {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("Java", "James", "Gosling");

        LongStream length = word.stream()
                .mapToLong(str-> str.length());
        length.forEach(System.out::println);
    }
}