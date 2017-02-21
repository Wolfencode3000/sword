package edu.jalc.sword.scabbard;

import edu.jalc.sword.color.RGBColor;
import edu.jalc.sword.coatofarms.CoatOfArms;

public class LongSwordScabbardTest {

	public void testGetHeight(){
		System.out.println("Testing LongSwordScabbard::getHeight");
		LongSwordScabbard LongSwordScabbard = new LongSwordScabbard(1.0, null, null);
		assert(LongSwordScabbard.getHeight() == 1.0);
	}

	public void testGetRGBColor(){
		System.out.println("Testing LongSwordScabbard::getRGBColor");
		RGBColor rgbColor = new RGBColor((byte)1,(byte)1,(byte)1);
		LongSwordScabbard LongSwordScabbard = new LongSwordScabbard(1.0, rgbColor, null);
		assert(LongSwordScabbard.getRgbColor() == rgbColor);
	}

	public void testGetCoatOfArms(){
		System.out.println("Testing LongSwordScabbard::getCoatOfArms");
		CoatOfArms coatOfArms = new CoatOfArms(1.0);
		LongSwordScabbard LongSwordScabbard = new LongSwordScabbard(1.0, null, coatOfArms);
		assert(LongSwordScabbard.getCoatOfArms() == coatOfArms);
	}


	public static void main(String... args){
		LongSwordScabbardTest LongSwordScabbardTest = new LongSwordScabbardTest();
		LongSwordScabbardTest.testGetHeight();
		LongSwordScabbardTest.testGetCoatOfArms();
		LongSwordScabbardTest.testGetRGBColor();
		System.out.println("LongSwordScabbardTest complete");
	}
}
