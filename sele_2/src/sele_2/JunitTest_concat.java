package sele_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest_concat {

	@Test
	public void testConcat() {
		Junit j=new Junit();
		String result=j.concat("hello","world");
		assertEquals("helloworld",result);
	}
}
