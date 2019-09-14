package com.kakao.programming;

public class Question1 {
	public int solution(String s) {
		int answer = 0;
		int n = 0;
		StringBuilder sb;

		for (int i = 1; i < s.length(); i++) {
			if (s.length() % i == 0) {
				n = i;
			}
		}

		for (int i = 1; i <= n; i++) {
			sb = new StringBuilder();

			int count = 1;
			for (int j = i; j < s.length(); j += i) {
				if ((j + i) <= s.length()) {
					if (s.substring(j - i, j).equals(s.substring(j, j + i))) {
						count++;
					} else {
						if (count != 1)
							sb.append(count);
						sb.append(s.substring(j - i, j));
						count = 1;
					}

					if ((j + i) == s.length()) {
						if (count != 1)
							sb.append(count);
						sb.append(s.substring(j, j + i));
					}
				} else {
					if (count != 1)
						sb.append(count);
					sb.append(s.substring(j - i, j));
					count = 1;
					sb.append(s.substring(j, s.length()));
					break;
				}
			}

			if (answer == 0 || answer > sb.length()) {
				answer = sb.length();
			}
		}
		return answer;
	}
}
