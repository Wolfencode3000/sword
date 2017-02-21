package edu.jalc.inclass.sword;

import edu.jalc.sword.scabbard.LongSwordScabbard;
import edu.jalc.sword.hilt.LongSwordHilt;
import edu.jalc.sword.blade.LongSwordBlade;

public class LongSwordTest {

	}

	public void testSetLongSwordHilt() throws Exception {
		System.out.println("Testing LongSword::setLongSwordHilt");
		LongSword longSword = new LongSword(20.0, new LongSwordHilt(2,3), null, null);
		LongSwordHilt longSwordHilt = new LongSwordHilt(1,1);
		LongSword.setLongSwordHilt(longSwordHilt);
		assert(longSwordHilt == LongSword.getLongSwordHilt());
	}

	public void testSetLongSwordHiltWithException() throws Exception {
		System.out.println("Testing LongSword::setLongSwordHilt for exception");
		boolean exceptionThrown = false;
		try {
			new LongSword(20.0, null, null, null);
		} catch (Exception e){
			exceptionThrown = true;
		}

		assert(exceptionThrown);
	}

	public void testGetLongSwordBlade() throws Exception {
		System.out.println("Testing LongSword.getLongSwordBlade");
		LongSwordBlade longSwordBlade = new LongSwordBlade(1.0);
		LongSword LongSword = new LongSword(1.0, new LongSwordHilt(1,1), longSwordBlade, null);
		assert(longSwordBlade == LongSword.getLongSwordBlade());
	}

	public void testGetLongSwordScabbard() throws Exception {
		System.out.println("Testing LongSword::getLongSwordScabbard");
		LongSwordScabbard longSwordScabbard = new LongSwordScabbard(1.0, null, null);
		LongSword LongSword = new LongSword(1.0, new LongSwordHilt(1,1), null, longSwordScabbard);
		assert(longSwordScabbard == LongSword.getLongSwordScabbard());
	}

	public static void main(String... args) throws Exception {
		LongSwordTest LongSwordTest = new LongSwordTest();
		LongSwordTest.testSetLongSwordHilt();
		LongSwordTest.testSetLongSwordHiltWithException();
		LongSwordTest.testGetLongSwordBlade();
		LongSwordTest.testGetLongSwordScabbard();

		System.out.println("All LongSword Tests passed");
	}
}
