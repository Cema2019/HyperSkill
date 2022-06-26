/*Implement the asciiArt method that takes the list of strings, joins them into a single string, and adds the ( symbol at the beginning of the resulting string and ) symbol at the end of the resulting string.

Remember to use the collect operation to solve the problem.

You may find the Collectors.joining method particularly useful.*/

public static String asciiArt(List<String> symbols) {
        return symbols.stream().collect(Collectors.joining("", "(", ")"));
    }
