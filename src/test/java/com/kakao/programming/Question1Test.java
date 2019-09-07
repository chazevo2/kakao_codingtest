package com.kakao.programming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Question1Test {
	Question1 q1 = new Question1();

	@Test
	public void test1() {
		int result = q1.solution("aabbaccc");
		
		assertEquals(7, result);
	}
	
	@Test
	public void test2() {
		int result = q1.solution("ababcdcdababcdcd");
		
		assertEquals(9, result);
	}
	
	@Test
	public void test3() {
		int result = q1.solution("abcabcdede");
		
		assertEquals(8, result);
	}
	
	@Test
	public void test4() {
		int result = q1.solution("abcabcabcabcdededededede");
		
		assertEquals(14, result);
	}
	
	@Test
	public void test5() {
		int result = q1.solution("xababcdcdababcdcd");
		
		assertEquals(17, result);
	}
}
