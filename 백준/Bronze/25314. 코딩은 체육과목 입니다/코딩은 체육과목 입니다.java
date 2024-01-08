import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = n /4 ;

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < count; i++) {
            sb.append("long ");
            if(i == count - 1) {
                sb.append("int");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

}