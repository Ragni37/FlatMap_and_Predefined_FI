package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToIntDemo1 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Smith", "Amit", "Neha", "Scott");

         IntStream mapToInt = name.stream()
                 .mapToInt(str-> str.length());
         mapToInt.forEach(System.out::println);
    }
}
