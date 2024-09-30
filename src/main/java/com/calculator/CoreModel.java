package com.calculator;

public class CoreModel {

	private String coreModel;
	private double height;
	private double width;
	private double depth;

	public CoreModel() {
		/* to handle empty or null core model input */
	}

	public CoreModel(String coreModel, double height, double width, double depth) {
		this.coreModel = coreModel;
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public String getCoreModel() {
		return coreModel;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getDepth() {
		return depth;
	}

	public double getEffectiveLength() {
		return (height + width) * 2;
	}

	public double getEffectiveArea() {
		return width * width;
	}

	public double getEffectiveVolumn() {
		return getEffectiveLength() * getEffectiveArea();
	}

	public double getMinWindowArea() {
		return height * width;
	}

}
