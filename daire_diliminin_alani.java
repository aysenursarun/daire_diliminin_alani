package daire_diliminin_alani;

import java.util.Scanner;

public class daire_diliminin_alani {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double r, a, pi = 3.14;

		System.out.print("Yarıçapı girin: ");
		r = scan.nextDouble();

		System.out.print("Daire diliminin açısını girin: ");
		a = scan.nextDouble();

		double alan = (pi * r * r * a) / 360;

		System.out.print("Daire diliminin alanı: " + alan);

	}

}
