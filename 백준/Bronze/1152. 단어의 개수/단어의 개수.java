import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence = br.readLine();

        if (sentence.isBlank()) {
            bw.write("0");
        } else {
            int length = sentence.strip().split(" ").length;
            bw.write(String.valueOf(length));
        }

        bw.flush();
        bw.close();
    }
}