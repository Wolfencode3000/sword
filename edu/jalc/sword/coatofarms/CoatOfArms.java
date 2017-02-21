package edu.jalc.sword.coatofarms;

public class CoatOfArms {
	private final double height;

	private CoatOfArms(){
		this.height = 0;
	}

	public CoatOfArms(double height){
		this.height = height;
	}

	public double getHeight(){
		return this.height;
	}
}