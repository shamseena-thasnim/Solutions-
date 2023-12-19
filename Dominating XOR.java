import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'dominatingXorPairs' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long dominatingXorPairs(List<Integer> arr) {        
    // Write your code here
    
    

         
    
    //asha chechi 
long n = arr.size();
        long count = 0;
 
        long ans = 0;
 
        // For storing count of numbers
        int bits[] = new int[32];
 
        // Iterate from 0 to N - 1
        for (int i = 0; i < n; i++) {
            int num = arr.get(i);
            // Find the most significant bit without using logarithmic operations
            int val = 0;
            while (num > 0) {
                num >>= 1;
                val++;
            }
            ans += bits[val - 1];
            bits[val - 1]++;
        }
        System.out.println("Ans : " + ans + " >>> n: " + n + " >>> count :" + count);
        return n * (n - 1) / 2 - ans; 
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.dominatingXorPairs(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
