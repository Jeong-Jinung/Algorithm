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

        // 바구니 갯수 : N / 몇 번 뒤집을지 : M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 바구니 배열
        int basket[] = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        // M번 만큼 순서를 받음
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            // start ~ end 까지의 순서를 뒤집음
            while (start < end) {
                int temp = basket[start];
                basket[start++] = basket[end];
                basket[end--] = temp;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i] + " ");
        }

        bw.write(sb.toString().stripTrailing());
        bw.flush();
        bw.close();
    }

}