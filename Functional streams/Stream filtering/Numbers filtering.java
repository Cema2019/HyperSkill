/*You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers. 
Implement a method that returns the third stream that contains sorted numbers from both streams which are 
divisible by 3 and 5 without the first two numbers.

You need to return a prepared IntStream from a template method, not a list of integers. 
Pay attention to the method template. Do not change the signature of this method.

Sample Input 1:

1 2 3 4 
Sample Output 1:

[]
Sample Input 2:

30 75 60 90
Sample Output 2:

[75, 90]*/

public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream)
                                .sorted()
                                .filter(x -> x % 3 == 0 && x % 5 == 0)
                                .skip(2);
    }
