package pack1;

import java.io.*;

class MEResult {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) 
    {
    // Write your code here
        int c=s.length()/3;
        String sent="";
        int count=0;
        for(int i=1;i<=c;i++)
        {
            sent+="SOS";
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=sent.charAt(i)) count++;
        }
        return count;
    }

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = MEResult.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}