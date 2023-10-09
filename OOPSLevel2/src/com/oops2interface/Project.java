package com.oops2interface;

public class Project {

	public static void main(String[] args) {
		// ComplexAgorithm algorithm = new DummyAlgorithm();
		// System.out.println(algorithm.complex(10, 20));

		ComplexAgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complex(10, 20));
	}

}
