package sele_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest_multiply {

	@Test
	public void testmulti() {
		Junit j=new Junit();
		int result=j.multi(7, 4);
		assertEquals(78,result);
	}

}
