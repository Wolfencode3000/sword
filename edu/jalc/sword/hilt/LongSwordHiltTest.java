package edu.jalc.sword.hilt;

public class LongSwordHiltTest {

	public void testGetHeight(){
		System.out.println("Testing LongSwordHilt::getHeight");
		LongSwordHilt lid = new LongSwordHilt(1.5,2.5);
		assert(1.5 == lid.getHeight());
	}

	public void testGetRadius(){
		System.out.println("Testing LongSwordHilt::getRadius");
		LongSwordHilt lid = new LongSwordHilt(1.4, 2.3);
		assert(2.3 == lid.getRadius());
	}

	public static void main(String... args) throws Exception {
		LongSwordHiltTest test = new LongSwordHiltTest();
		test.testGetHeight();
		test.testGetRadius();

		System.out.println("All LongSwordHilt Tests passed");
	}
}
