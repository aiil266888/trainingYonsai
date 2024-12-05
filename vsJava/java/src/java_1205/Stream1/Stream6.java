package java_1205.Stream1;

import java.util.stream.IntStream;

public class Stream6 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(1,4);
        stream1.forEach(e -> System.out.println(e + " "));
    }
}
