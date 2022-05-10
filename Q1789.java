package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1789 {
	public static void main(String[] args) throws IOException {
		// 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
		// N의 최댓값 -> 합 S를 만들 때 가장 많은 자연수를 이용하는 방법을 찾는다.
		// 즉, 가장 낮은 자연수부터 더해가며 S가 되는 갯수를 찾으면 된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		long S = Long.parseLong(br.readLine());
		br.close();
//		Scanner sc = new Scanner(System.in);
//		
//		long S = sc.nextLong();
		long sum = 0, N = 0;
		
		// 1부터 차례대로 더해주며 sum이 S보다 커지면 반복문을 탈출하도록 한다.
		while(true) {
			sum += N;
			if(sum>S) {break;}
			N++;
		}
		
//		System.out.println(String.valueOf(N-1));
		
		// S가 200일 때, 1~19까지 더하면 190, 20을 더하면 210이 된다.
		// 즉, N은 20일 때 while문을 빠져나오게 되는데, 우리는 200을 만드는 자연수의 갯수를 찾는 중.
		// 1~18까지 더한 후 여기에 29를 더하면 200이 되므로 N은 19개이다.
		// 따라서 N-1을 출력한다.
		bw.write(String.valueOf(N-1));
		bw.flush();
		bw.close();
		
	}
}
