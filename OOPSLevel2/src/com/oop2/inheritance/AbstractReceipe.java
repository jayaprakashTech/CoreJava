package com.oop2.inheritance;

public abstract class AbstractReceipe {
	void execute() {
		prepare();
		doReceipe();
		cleanUp();
	}

	abstract void prepare();

	abstract void doReceipe();

	abstract void cleanUp();
}
