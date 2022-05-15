package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		br.close();
		
		int day = 0;
//		int sum = 0;
//		
//		while(true) {
//			// 낮
//			sum += A;
//			
//			if(sum < V) { day++; } 
//			else { break; }
//			
//			// 밤
//			sum -= B;
//		}
		
		// 마지막 날은 미끄러지지 않으므로 높이에서 A미터를 빼주고(V-A) 나머지 길이는 (A-B)만큼씩 올라간다.
		// 마지막 날을 더해준다(+1).
		day = ((V-A)/(A-B))+1;
		
		// 나머지가 남는다면 올라갈 높이가 남은 것이므로 하루를 더해준다(day++).
		if(((V-A)%(A-B)) != 0) {
			day++;
		}
		
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
	}
}
