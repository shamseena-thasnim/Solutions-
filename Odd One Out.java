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
     * Complete the 'findOdd' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY series as parameter.
     */

    public static String findOdd(List<String> series) {
      final List<List<Integer>> distances = new ArrayList<>();
        String oddOneOut = "";

        for (String s : series) {
            List<Integer> dist = new ArrayList<>();
            for (int i = 0; i < s.length() - 1; i++) {
                dist.add((int) s.charAt(i + 1) - (int) s.charAt(i));

            }

            distances.add(dist);

        }

        for (int i = 0; i < distances.size(); i++) 
        {
          final Integer i2 = new Integer(i);
            if (distances.stream().filter(dist -> dist.equals(distances.get(i2))).count() == 1) {
                oddOneOut = series.get(i);
                break;

            }
        }
        return oddOneOut;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int seriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> series = IntStream.range(0, seriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        String result = Result.findOdd(series);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
