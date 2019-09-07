package com.kakao.programming;

public class Question1 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();

		char[] c = s.toCharArray();
		int count = 1;
		for (int i = 1; i < c.length; i++) {
			if (c[i - 1] == c[i]) {
				count++;
			} else {
				if (count != 1)
					sb.append(count);
				sb.append(c[i - 1]);
				count = 1;
			}
			
			if(i == c.length - 1) {
				if (count != 1)
					sb.append(count);
				sb.append(c[i]);
			}	
		}

		System.out.println(sb);
		answer = sb.length();
		return answer;
	}
}
