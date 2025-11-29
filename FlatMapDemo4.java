package Day_03_FlatMap_and_IntStream_LongStream_DoubleStream;

import java.util.Arrays;
import java.util.List;

record Product(Integer id, List<String> listOfProduct){}

public class FlatMapDemo4 {
    public static void main(String[] args) {
        List<Product>  listOfProduct = Arrays.asList(
                new Product(1, Arrays.asList("Camera", "Mobile", "Laptop")),
                new Product(2, Arrays.asList("Bat", "Ball", "Wicket")),
                new Product(3, Arrays.asList("Chair", "Table", "Lamp")),
                new Product(4, Arrays.asList("Cycle", "Bike", "Car"))
                );

        System.out.println("List of Product");
        System.out.println("-----------------------------");

        List<String> flatMap = listOfProduct.stream()
                .flatMap(product -> product.listOfProduct().stream())
                .toList();
        System.out.println(flatMap);

    }
}
