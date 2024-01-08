import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer countOfNumbers = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        AtomicInteger count = new AtomicInteger(0);
        
        while (countOfNumbers.hasMoreTokens()) {
            if (v == Integer.parseInt(countOfNumbers.nextToken())) {
                count.getAndIncrement();
            }
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

}