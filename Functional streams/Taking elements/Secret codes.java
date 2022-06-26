/*You've found a sequence of codes on the Internet in the HEX format (hexadecimal numbers). 
You have an assumption that this sequence has a secret subsequence enclosed between "#0000" and "#FFFF". 
Apply your knowledge of Stream API to extract all codes between them (excluding both "#0000" and "#FFFF").
Please, try to use takeWhile and dropWhile methods as well as some predicate to solve this problem.*/

private static List<String> extractCodes(List<String> codes) {
        return codes.stream()
                    .dropWhile(c -> !"#0000".equals(c))
                    .takeWhile(c -> !"#FFFF".equals(c))
                    .filter(c -> !"#0000".equals(c))
                    .collect(Collectors.toList());
    }
