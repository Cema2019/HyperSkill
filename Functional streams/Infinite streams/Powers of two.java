/*Implement a method that returns a prepared stream of the first n powers of two starting from the 0 power, that is, your output should start with 1.*/

public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
        return Stream.iterate(1, x -> x * 2)
                .limit(n);
    }
