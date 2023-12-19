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
     * Complete the 'groupDivision' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY levels
     *  2. INTEGER maxSpread
     */


    public static int groupDivision(List<Integer> levels, int maxSpread)
    {
    // Write your code here
        Collections.sort(levels); 
        int start = 0;
        int n=levels.size();
        if(n == 0)
            return 0;
        // If arr has some value then at least can form 1 group
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(levels.get(i) - levels.get(start) > maxSpread) {
            count++;
            start = i;
            }
        }

 System.out.println("count="+count); 
         
return count;
    }
    
        static long arraySum(List<Integer> levels, int n) 
    { 
        long sum = 0; 
        for (int i = 0; i < n; i++) 
            sum = sum + levels.get(i); 
              
        return sum; 
    } 
    
    
}  

   

  

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int levelsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> levels = IntStream.range(0, levelsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int maxSpread = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.groupDivision(levels, maxSpread);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
