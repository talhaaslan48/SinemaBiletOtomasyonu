package Sinemaaaa;

import java.util.Scanner;

public class Odeme {
	Scanner scanner = new Scanner(System.in);
	AnaS�n�f anaS�n�f = new AnaS�n�f();

	public int biletSayisi;

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getHesKodu() {
		return hesKodu;
	}

	public void setHesKodu(String hesKodu) {
		this.hesKodu = hesKodu;
	}

	private String hesKodu;
	private String tcKimlikNo;

	public void tutar(int biletSayisi) {
		this.biletSayisi = biletSayisi;
		System.out.println("Bilet sayisi:" + biletSayisi);
	}

	public void totalHesap() {
		String krediKartNO;
		int hesap = biletSayisi * 20;
		int � = 1;
		System.out.println("�deme �eklinin se�iniz.");
		System.out.println("1-Nakit");
		System.out.println("2-Kredi Kart�");

		int odemeSekliSecim = scanner.nextInt();
		for (� = 1; � > 0; �++) {
			switch (odemeSekliSecim) {
			case 1:

				System.out.println("�demenin gereken tutar " + hesap + " Tl dir.");
				System.out.println("L�tfen ka� para yat�rd���n�z� sisteme girin:");
				int yatirilanNakit = scanner.nextInt();
				if (yatirilanNakit >= hesap) {
					System.out.println("Para �st�n�z:" + (yatirilanNakit - hesap));
					System.out.println("�deme i�leminiz ger�ekle�mi�tir.�yi seyirler.");
					� = -1;

				} else {
					System.out.println("Yat�rd���n�z para yetersizdir.");
				}
				break;

			case 2:
				System.out.println("Hesab�n�z " + hesap + " Tl dir");

				System.out.println("L�tfen 16 haneli kredi kart� numaran�z� girini:");
				krediKartNO = scanner.next();
				boolean gecerli = false;
				char[] rakamlar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

				while (true) { // krediKartNO nun gecerli olup olmadigini kontrol eden while dongusu
					for (int i = 0; i < krediKartNO.length(); i++) {
						gecerli = false;
						for (int j = 0; j < 10; j++) {
							if (krediKartNO.charAt(i) == rakamlar[j]) {
								gecerli = true;
							}
						}
						if (gecerli == false) {
							break;
						}
					}
					if (gecerli == true && krediKartNO.length() == 16) {
						break; // tc kimlik gecerliyse break atip while dan cik
					}
					System.out.println("Gecerli Kredi Kart� numaran�z� giriniz.");
					krediKartNO = scanner.next();
				}

				System.out.println("�deme i�leminiz ger�ekle�mi�tir.�yi seyirler.");
				� = -1;

				break;

			default:
				System.out.println("L�tfen ge�erli bir i�lem numaras� giriniz.");
				break;
			}
		}
	}
}
