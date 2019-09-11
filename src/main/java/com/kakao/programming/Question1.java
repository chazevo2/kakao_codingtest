package com.kakao.programming;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public int solution(String s) {
		int answer = 0;
		List<Integer> nList = new ArrayList<Integer>();
		StringBuilder sb;

		for (int i = 1; i < s.length(); i++) {
			if (s.length() % i == 0) {
				nList.add(i);
			}
		}
		System.out.println(nList);

		for (Integer i : nList) {
			sb = new StringBuilder();
			System.out.println("i : " + i);
			System.out.println();

			int count = 1;
			for (int j = i; j < s.length(); j += i) {
				System.out.println("비교 1");
				System.out.println(s.substring(j - i, j));
				System.out.println(s.substring(j, j + i));
				if (s.substring(j - i, j).equals(s.substring(j, j + i))) {
					count++;
					System.out.println("같다");
				} else {
					if (count != 1)
						sb.append(count);
					sb.append(s.substring(j - i, j));
					count = 1;
					System.out.println("다르다");
				}

				if ((j + i) == s.length()) {
					if (count != 1)
						sb.append(count);
					sb.append(s.substring(j, j + i));
				}
			}
			System.out.println();

			if (answer == 0 || answer > sb.length()) {
				answer = sb.length();
			}
			System.out.println(sb);
			System.out.println(answer);
		}
		System.out.println(answer);
		return answer;
	}
	/*
	 * 약수를 구해서 약수로 묶어볼 예정
	 */

	public int solution2(String s) {
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

			if (i == c.length - 1) {
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
