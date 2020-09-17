package fr.dauphine.ja.bourgsebastien.td00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PrimeCollection {
	ArrayList<Integer> numbers;

	public PrimeCollection() {
		numbers = new ArrayList<>();
	}

	/**
	 * Methode adding random number (n) beetween 0 and m
	 * @param n : number of random numbers to generate 
	 * @param m : borne maximal du nb a generer
	 */
	public void initRandom(int n, int m) {
		for (int i = 0; i <= n; i++) {
			Random r = new Random();
			numbers.add(r.nextInt(m));
		}
	}

	/**
	 * Method testing if an int is prime or not
	 * @param p
	 * @return true if the number is prime, false if it's not or if the number is negative
	 */
	public boolean isPrime(int p) {
		if(p <= 0) return false;
		
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
		c.initRandom(100, 2000);
		c.printPrimes();
	}

}
