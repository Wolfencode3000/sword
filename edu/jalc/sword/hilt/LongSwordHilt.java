package edu.jalc.sword.hilt;

public class LongSwordHilt {

	private final double height;
	private final double radius;

	private LongSwordHilt(){
		this.height = this.radius = 0;
	}

	public LongSwordHilt(double height, double radius){
		this.height = height;
		this.radius = radius;
	}

	public double getHeight(){ return this.height; }
	public double getRadius(){ return this.radius; }


}
