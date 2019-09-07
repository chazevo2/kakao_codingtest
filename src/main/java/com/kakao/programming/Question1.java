package com.kakao.programming;

public class Question1 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		
		char[] c = s.toCharArray();
		int n = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i] == c[i+1]) {
				n++;
			} else {
				sb.append(n);
				sb.append(c[i]);
				n = 0;
			}
		}
		
		return answer;
	}
}
