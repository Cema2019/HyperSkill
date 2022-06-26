/*In this exercise, you need to implement the processNumbers method that takes a collection of 
numbers and should sort it and skip all numbers that are less than 10. 
The method must return a sorted list as the result.*/

public static List<Integer> processNumbers(Collection<Integer> numbers) {
        return numbers.stream()
                      .sorted()
                      .filter(n -> n > 9)
                      .collect(Collectors.toList());
    }
