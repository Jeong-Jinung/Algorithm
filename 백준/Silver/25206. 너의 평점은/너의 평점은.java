import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 전공평점 -> (학점 * 과목평점) / 학점의 총합
        // P인 과목은 계산에서 제외
        // ObjectOrientedProgramming1  3.0  A+ | 과목  학점  과목평점

        LinkedHashMap<String, Double> scoreMap = new LinkedHashMap<>();
        scoreMap.put("A+", 4.5);
        scoreMap.put("A0", 4.0);
        scoreMap.put("B+", 3.5);
        scoreMap.put("B0", 3.0);
        scoreMap.put("C+", 2.5);
        scoreMap.put("C0", 2.0);
        scoreMap.put("D+", 1.5);
        scoreMap.put("D0", 1.0);
        scoreMap.put("F", 0.0);

        double gradesSum = 0;
        int ratingSum = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double grades = Double.parseDouble(input[1]);
            String rating = input[2];

            if (!rating.equals("P")) {
                gradesSum += grades * scoreMap.get(rating);
                ratingSum += grades;
            }
        }

        double result = gradesSum / ratingSum;

        bw.write(String.format("%.4f", result));

        bw.flush();
        bw.close();
    }
}