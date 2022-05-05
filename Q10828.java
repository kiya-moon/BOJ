package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
//		List<Integer> arr = new ArrayList<>();
		List<String> arr = new ArrayList<>();
		int idx = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push":
				String x = st.nextToken();
				arr.add(x);
				idx++;
				break;
			case "pop":
				if(arr.isEmpty()) {
					bw.write("-1" + "\n");
//					System.out.println(-1);
				} else {
					bw.write(arr.get(idx-1) + "\n");
//					System.out.println(arr.get(idx-1));
					arr.remove(idx-1);
					idx--;
				}
				break;
			case "size":
				bw.write(String.valueOf(arr.size()) + "\n");
//				System.out.println(arr.size());
				break;
			case "empty":
				if(arr.isEmpty()) {
					bw.write("1" + "\n");
//					System.out.println(1);
				} else {
					bw.write("0" + "\n");
//					System.out.println(0);
				}
				break;
			case "top":
				if(arr.isEmpty()) {
					bw.write("-1" + "\n");
//					System.out.println(-1);
				} else {
					bw.write(arr.get(idx-1) + "\n");
//					System.out.println(arr.get(idx-1));
				}
				break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
