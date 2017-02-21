package edu.jalc.sword.coatofarms;

public class CoatOfArmsTest {

	public void testGetHeight(){
		System.out.println("Testing CocaColaLogo::getHeight");
		CoatOfArms coatOfArms = new CoatOfArms(2.0);
		assert(coatOfArms.getHeight() == 2.0);

	}

	public static void main(String... args){
		CoatOfArmsTest coatOfArmsTest = new CoatOfArmsTest();
		coatOfArmsTest.testGetHeight();
		System.out.println("CoatOfArmsTest completed");
	}
}