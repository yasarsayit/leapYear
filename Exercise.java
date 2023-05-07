package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner inp = new Scanner(System.in);
		System.out.print("Yıl Giriniz: ");
		year = inp.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.print(year + " bir artık yıldır !");
		} else {
			System.out.println(year + " bir artık yıl değildir !");
		}
	}

}
