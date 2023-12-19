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
     * Complete the 'winner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING erica
     *  2. STRING bob
     */

    public static String winner(String erica, String bob) {
        //my soln , stored in my sharepoint
         int n=erica.length();
        String won_by = ""; 
        int erica_Score = 0; 
        int bob_Score = 0; 
 
        for(int i=0;i<n;i++) 
        { 
            erica_Score = erica_Score + getScore(erica.charAt(i)); 
            bob_Score = bob_Score + getScore(bob.charAt(i)); 
        } 
 
        if(erica_Score > bob_Score) 
            won_by="Erica"; 
        else if(bob_Score > erica_Score) 
            won_by="Bob"; 
        else 
        won_by="Tie"; 
 
 
        return won_by; 
    } 
 
 
    static int getScore(char level) 
    { 
 
        int score=0; 
 
        if(level=='E') 
            score=1; 
        else if(level=='M') 
            score=3; 
        else 
            score=5; 
 
        //System.out.println("score = "+score); 
 
        return score; 
    }
    

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String erica = bufferedReader.readLine();

        String bob = bufferedReader.readLine();

        String result = Result.winner(erica, bob);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
