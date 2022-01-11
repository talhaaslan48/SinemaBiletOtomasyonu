package Sinemaaaa;

import java.util.Scanner;

public class Sinema extends AnaSýnýf {

	Scanner scanner = new Scanner(System.in);
	public String filmAdi;
	public int yas;

	public boolean yasControl(int yas) {
		this.yas = yas;

		if (yas < 18) {
			System.out.println("Yaþýnýz yetersiz.");
			return false;
		}
		return true;
	}

}
