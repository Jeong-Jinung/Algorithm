import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 주어진 점수중에서 최대 값을 뽑는다.
        // 모든 점수를 점수/M*100으로 바꾼다.
        // 바꾼 점수의 평균을 구한다.

        // 1. 시험본 과목의 갯수
        int N = Integer.parseInt(br.readLine());

        // 2. 시험 점수 배열
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        //3. 새로운 평균 구하기
        int  maxScore = Arrays.stream(scores).max().getAsInt();
        double newAvg = Arrays.stream(scores)
            .mapToDouble(score -> ((double)score / maxScore) * 100)
            .average().getAsDouble();

        bw.write(String.valueOf(newAvg));
        bw.flush();
        bw.close();
    }

}