package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

import java.util.Arrays;
import java.util.List;

public class MapToDoubleDemo1 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(4, 9, 16, 25);

        number.stream()
                .mapToDouble(n-> Math.sqrt(n))
                .forEach(System.out::println);
    }
}
