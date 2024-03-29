import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] reaminArr = new int[10];
        for (int i = 0; i < 10; i++) {
            reaminArr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Set<Integer> remainSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            remainSet.add(reaminArr[i]);
        }

        bw.write(String.valueOf(remainSet.size()));

        bw.flush();
        bw.close();
    }

}