/*You need to return a LongStream consisting of all numbers from -n to n inclusively, but skipping the 0 value.

Sample Input 1:
3

Sample Output 1:
-3 -2 -1 1 2 3*/

public static LongStream getLongStream(int n) {
        return LongStream.rangeClosed(-n, n).filter(x -> x != 0);
    }
