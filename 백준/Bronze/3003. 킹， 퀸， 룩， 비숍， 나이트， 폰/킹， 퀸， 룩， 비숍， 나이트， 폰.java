import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> chess = List.of(1, 1, 2, 2, 2, 8);
        List<Integer> find = new ArrayList<>();
        while (st.hasMoreTokens()) {
            find.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < chess.size(); i++) {
            bw.write(chess.get(i) - find.get(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}