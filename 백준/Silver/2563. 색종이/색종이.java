import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 색종이는 10x10 크기의 정사각형
        // 첫번쨰 자연수 : 왼쪽 벽면과 떨어진 거리
        // 두번쨰 자연수 : 아래쪽 벽면과 떨어진 거리

        int n = Integer.parseInt(br.readLine()); // 색종이 갯수

        int[][] paper = new int[100][100]; // 도화지 크기

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]); // 왼쪽 벽면과 떨어진 거리
            int y = Integer.parseInt(input[1]); // 아래쪽 벽면과 떨어진 거리

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    result++;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}