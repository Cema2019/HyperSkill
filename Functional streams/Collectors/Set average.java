/*Implement the avgOnSet method that accepts a stream of Integer elements, 
accumulates them to a Set, and returns the average value of numbers from the set.

Remember to use the collect operation to solve the problem.*/

public static Double avgOnSet(Stream<Integer> numbers) {
        Set<Integer> nums = numbers.collect(Collectors.toSet());
        return nums.stream()
                    .collect(Collectors.averagingDouble(num -> num));
    }
