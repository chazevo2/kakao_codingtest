package com.kakao.programming;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class Question2Test {
	Question2 q2 = new Question2();

	@Test
	public void test1() {
		String result = q2.solution("(()())()");
		
		assertSame("(()())()", result);
	}
	
	@Test
	public void test2() {
		String result = q2.solution(")(");
		
		assertSame("()", result);
	}

	@Test
	public void test3() {
		String result = q2.solution("()))((()");
		
		assertSame("()(())()", result);
	}
}
