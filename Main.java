package paraBozma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ExcangeRate.setDollarToGrivnaRate(28.0);
		ExcangeRate.setGrivnaToDollarRate(1.0 / 28);
		ExcangeRate.setEuroToGrivnaRate(32.0);
		ExcangeRate.setGrivnaToEuroRate(1 / 32.0);

		System.out.print("Добро Пожаловать! Вы наш клиент?\nЕсли вы наш клиент нажмите Е, Если нет нажмите N  : ");
		String musteriMi = input.nextLine();
		Human human;
		if (musteriMi.equals("e")) {
			System.out.print("Напишите пожалуйста свой ID номер ? : ");
			int musteriNumarasi = input.nextInt();

			human = CustomerDataBase.findCustomer(musteriNumarasi);

			// human null sa tekrar musteri nmarasi iste (dongude)
		} else {
			System.out.print("Напишите пожалуйста свое имя и фамилию ? :");
			String adi = input.next();
			String soyAdi = input.next();

			human = new Human(adi, soyAdi);
		}

		while (true) {
			System.out.println("Для продажи валюта нажмите  \" 0 \", Для покупки валюта нажмите \" 1 \", Для выхода нажмите \" 2 \" : ");
			int yapilmakIstenenIslem = input.nextInt();

			switch (yapilmakIstenenIslem) {
			case 0:
				satisIslemi(input, human);
				break;
			case 1:
				alisIslemi(input, human);
				break;
			case 2:
				System.out.println("Пока Пока!");
				return;

			default:
				System.out.println("Вы нажали неправильно!");
				break;
			}
		}
	}

	private static void satisIslemi(Scanner input, Human human) {
		System.out.print("доллар на гривня --> 0 : \nЭвро на гривня -->1 :");
		int secim = input.nextInt();
		System.out.print("Напишите сумму валюта : ");
		double miktar = input.nextDouble();
		switch (secim) {
		case 0:
			Dollar d = new Dollar(miktar);
			System.out.println("Уважаемый(-ая) " + human.getFullName() + " курс данный момент " + ExcangeRate.getDollarToGrivnaRate()
					+ "\nвы написали сумму " + miktar + "$\nВы покупали " + d.toGrivna() + " Гривня");
			break;
		case 1:
			Euro e = new Euro(miktar);
			System.out.println("Уважаемый(-ая) " + human.getFullName() + " курс данный момент " + ExcangeRate.getEuroToGrivnaRate()
					+ "\nвы написали сумму " + miktar + "€\nВы покупали " + e.toGrivna() + " Гривня");
			break;
		default:
			System.out.println("");
			break;
		}
	}

	private static void alisIslemi(Scanner input, Human human) {
		System.out.print("гривня на доллар --> 0\nгривня на эвро -->1");
		int secim = input.nextInt();
		System.out.print("Напишите сумму Гривня : ");
		double miktar = input.nextDouble();
		Grivna g = new Grivna(miktar);
		switch (secim) {
		case 0:
			System.out.println("Уважаемый(-ая) " + human.getFullName() + " курс данный момент " + ExcangeRate.getDollarToGrivnaRate()
					+ "\nвы написали сумму " + miktar + " Гривня\nВы покупали " + g.toDolar() + "$");
			break;
		case 1:
			System.out.println("Уважаемый(-ая) " + human.getFullName() + " курс данный момент " + ExcangeRate.getEuroToGrivnaRate()
					+ "\nвы написали сумму " + miktar + " Гривня\nВы покупали " + g.toEuro() + "€");
			break;
		default:
			System.out.println("");
			break;
		}
	}

}
