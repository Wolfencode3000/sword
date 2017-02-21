package edu.jalc.sword;

import edu.jalc.sword.hilt.LongSwordHilt;

public class LongSwordApp {

	public static void main(String... args) throws Exception {
		LongSword LongSword = new LongSword(20, new LongSwordHilt(1, 2));
		System.out.println();
	}
}
