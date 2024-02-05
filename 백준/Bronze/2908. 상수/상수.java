import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();
        String b = st.nextToken();

        String[] aSplit = a.split("");
        String[] bSplit = b.split("");


        int number1 = Integer.parseInt(aSplit[2] + aSplit[1] + aSplit[0]);
        int number2 = Integer.parseInt(bSplit[2] + bSplit[1] + bSplit[0]);

        if (number1 > number2) {
            bw.write(String.valueOf(number1));
        } else {
            bw.write(String.valueOf(number2));
        }

        bw.flush();
        bw.close();
    }
}