package edu.jalc.sword.scabbard;


import edu.jalc.sword.color.RGBColor;
import edu.jalc.sword.logo.CoatOfArms;

public class LongSwordScabbard {

	private final double height;
	private final RGBColor rgbColor;
	private final CoatOfArms coatOfArms;

	private LongSwordScabbard(){
		this.height = 0;
		this.rgbColor = null;
		this.cocaColaLogo = null;
	}

	public LongSwordScabbard(double height, RGBColor rgbColor, CoatOfArms coatOfArms){
		this.height = height;
		this.rgbColor = rgbColor;
		this.coatOfArms = coatOfArms;
	}

	public double getHeight() {
		return height;
	}

	public RGBColor getRgbColor() {
		return rgbColor;
	}

	public CocaColaLogo getCocaColaLogo() {
		return cocaColaLogo;
	}
}
