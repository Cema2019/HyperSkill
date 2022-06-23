/*Maximum of the absolute values -> 
      https://hyperskill.org/learn/step/3828

Find the maximum absolute value in the array of numbers.

Try not to use the for loop, but use Stream API.*/

public static int maxAbsValue(String[] numbers) {
        return Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)
                        .map(Math::abs)
                        .max().orElse(0);
        
    }
