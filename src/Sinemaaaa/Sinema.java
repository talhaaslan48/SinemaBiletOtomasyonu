package Sinemaaaa;

import java.util.Scanner;

public class Sinema extends AnaS�n�f {

	Scanner scanner = new Scanner(System.in);
	public String filmAdi;
	public int yas;

	public boolean yasControl(int yas) {
		this.yas = yas;

		if (yas < 18) {
			System.out.println("Ya��n�z yetersiz.");
			return false;
		}
		return true;
	}

}
