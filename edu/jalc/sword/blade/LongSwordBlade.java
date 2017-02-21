package edu.jalc.sword.blade;

public class LongSwordBlade {

	private double length;

	public LongSwordBlade(){
		this.setLength(0.0);
	}

	public LongSwordBlade(double length){
		this.setLength(length);
	}

	public double getLength(){ return this.length; }

	public LongSwordBlade setLength(double length){
		this.length = length;
		return this;
	}
}
