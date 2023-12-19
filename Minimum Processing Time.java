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
     * Complete the 'minTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY processorTime
     *  2. INTEGER_ARRAY taskTime
     */

    public static int minTime(List<Integer> processorTime, List<Integer> taskTime)
    {
    // Write your code here
     int minTime=0;
     minTime=minProcessingTime(processorTime, taskTime);
    return minTime;//Collections.max(list);
    }
    
        public static int minProcessingTime(List<Integer> processorTime, List<Integer> taskTime) {
        processorTime.sort((a, b) -> a - b);
        taskTime.sort((a, b) -> a - b);
        int ans = 0, i = taskTime.size() - 1;
        for (int t : processorTime) {
            ans = Math.max(ans, t + taskTime.get(i));
            i -= 4;
        }
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int processorTimeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> processorTime = IntStream.range(0, processorTimeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int taskTimeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> taskTime = IntStream.range(0, taskTimeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minTime(processorTime, taskTime);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
