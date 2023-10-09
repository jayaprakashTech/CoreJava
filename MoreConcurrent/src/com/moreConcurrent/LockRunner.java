package com.moreConcurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Locking1 extends Thread {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

	int getI() {
		return i;
	}

	int getJ() {
		return j;
	}

}

class Locking2 extends Thread {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

	int getI() {
		return i;
	}

	int getJ() {
		return j;
	}

}

public class LockRunner {

	public static void main(String[] args) {
		Locking1 l1 = new Locking1();
		l1.start();
		l1.incrementI();
		l1.incrementI();
		l1.incrementJ();
		l1.incrementJ();
		System.out.println(l1.getI());
		System.out.println(l1.getJ());

		Locking2 l2 = new Locking2();
		l2.start();
		l2.incrementI();
		l2.incrementI();
		l2.incrementJ();
		l2.incrementJ();
		System.out.println(l2.getI());
		System.out.println(l2.getJ());

	}

}
