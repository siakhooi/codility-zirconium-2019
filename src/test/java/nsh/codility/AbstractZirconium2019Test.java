package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractZirconium2019Test {
	abstract Zirconium2019Interface getTestObject();

	@Test
	void test01() {
		int[] A = new int[] { 4, 2, 1 };
		int[] B = new int[] { 2, 5, 3 };
		int F = 2;
		int E = 10;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	void test02() {
		int[] A = new int[] { 7, 1, 4, 4 };
		int[] B = new int[] { 5, 3, 4, 3 };
		int F = 2;
		int E = 18;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	void test03() {
		int[] A = new int[] { 5, 5, 5 };
		int[] B = new int[] { 5, 5, 5 };
		int F = 1;
		int E = 15;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	void test04a() {
		int[] A = new int[] { 3, 2, 1 };
		int[] B = new int[] { 7, 6, 6 };
		int F = 2;
		int E = 11;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	void test04b() {
		int[] A = new int[] { 3, 2, 1 };
		int[] B = new int[] { 9, 6, 6 };
		int F = 2;
		int E = 12;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	@DisplayName("No Team A")
	void test05a() {
		int[] A = new int[] { 5, 5, 5 };
		int[] B = new int[] { 2, 3, 4 };
		int F = 0;
		int E = 9;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	@DisplayName("No Team B")
	void test05b() {
		int[] A = new int[] { 5, 5, 5 };
		int[] B = new int[] { 2, 3, 4 };
		int F = 3;
		int E = 15;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	void test06() {
		int[] A = new int[] { 2, 2, 3, 3 };
		int[] B = new int[] { 1, 1, 2, 2 };
		int F = 2;
		int E = 8;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

	@Test
	void test07() {
		int[] A = new int[] { 2, 2, 2, 2 };
		int[] B = new int[] { 2, 2, 2, 2 };
		int F = 2;
		int E = 8;

		assertEquals(E, getTestObject().solution(A, B, F));
	}

}
