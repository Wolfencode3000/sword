package edu.jalc.sword.blade;

public class LongSwordBladeTest {

	public void testSetLength(){
		System.out.println("Testing LongSwordBlade::setLength");
		LongSwordBlade longSwordBlade = new LongSwordBlade();
		LongSwordBlade.setLength(4.0);
		assert(longSwordBlade.getLength() == 4.0);
	}

	public static void main(String... args){

		LongSwordBladeTest longSwordBladeTest = new LongSwordBladeTest();
		longSwordBladeTest.testSetLength();
		System.out.println("LongSwordBlade Tests Complete");
	}
}
