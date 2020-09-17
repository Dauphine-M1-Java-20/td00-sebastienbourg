package fr.dauphine.ja.bourgsebastien.td00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PrimeCollection {
	ArrayList<Integer> numbers;

	public PrimeCollection() {
		numbers = new ArrayList<>();
	}

	public void initRandom(int n, int m) {
		for (int i = 0; i <= n; i++) {
			Random r = new Random();
			numbers.add(r.nextInt(m));
		}
	}

	private boolean isPrime(int p) {
		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void printPrimes() {
		for (int i : numbers) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		PrimeCollection c = new PrimeCollection();
		c.initRandom(100, 1000);
		c.printPrimes();
	}

}
