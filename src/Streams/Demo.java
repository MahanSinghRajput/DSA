package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        Stream<Integer> data = list.stream().map(n -> n*n);
        data.forEach(n -> System.out.println(n));
    }
}
