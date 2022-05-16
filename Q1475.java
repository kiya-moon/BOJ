package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> arr = new ArrayList<>();
		
		int count = 0;
		String roomNum = br.readLine();
		
		br.close();
		
		// 방 번호 배열에 넣기
		for (int i = 0; i < roomNum.length(); i++) {
			// String 타입 숫자를 int 타입으로 변경할 때, 아스키코드 값에서 48(='0')을 빼줘야 실제 정수를 가리킨다.
			// 예를 들어 문자 '1'을 int로 변환하면 아스키코드에 따라 49가 된다. 그러므로 48을 빼줘야 숫자 1이 되는 것. 
			arr.add(roomNum.charAt(i)-'0');
		}
		
		// 9와 6은 같이 쓸 수 있으므로 6으로 변경해준다.
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == 9) {
				arr.set(i, 6);
			}
		}
		
		// 두 개 마다 하나씩 지워줌
		int temp = 0;
		for (int i = (arr.size()-1); i >= 0; i--) {
			if(arr.get(i) == 6) {
				temp++;
				if(temp%2==0) {
					arr.remove(i);
				}
			}
		}
		
		System.out.println(arr);
		
		// 숫자 하나씩 꺼내서 중복검사(hashmap 이용 -> key - value 한쌍)
		Map<Integer, Integer> map = new HashMap<>();
		// key에 arr을 key값으로 담는만큼 반복
		for(Integer key : arr) {
			// key에 value값 담기
			Integer value = map.get(key);
			// 맨 처음에는 key에 아무런 value값이 지정되어 있지 않다(null).
			// 따라서 if문 안으로 들어가 1이라는 value값을 얻는다.
			if (value == null) {
				map.put(key, 1);
			// 이미 value값이 있으면, 즉 중복이면, else문으로 들어가 1이 더해진다.
			} else {
				map.put(key, value + 1);
			}
		}
		
		// value값을 ArrayList로 저장
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		// map에 설정되어 있는 key 개수만큼 반복한다.
		for (Integer key : map.keySet()) {
			// ArrayList에 value값을 넣어준다.
			arr2.add(map.get(key));
		}
		
		// count 내림차순으로 정렬 
		Collections.sort(arr2, Collections.reverseOrder());
		
		// 필요한 건 count[0]
		count = arr2.get(0);
	
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
	}

}
