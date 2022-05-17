package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> arr = new ArrayList<>();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		br.close();
		
		for (int i = 1; i <= B; i++) {
			for (int j = 1; j <= i; j++) {
				if(arr.size()==B) {
					break;
				}
				arr.add(i);
			}
		}
		
		for (int i = (A-1); i <= (B-1); i++) {
			sum += arr.get(i);
		}
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
