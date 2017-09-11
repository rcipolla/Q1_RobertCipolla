package PkgMain;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QBrating {
	public void QB_rating() {
		
		Scanner qbinfo = new Scanner(System.in);
		
		System.out.println("Enter number of passing attempts: ");
		double ATT = qbinfo.nextInt();

		System.out.println("Enter number of completions: " );
		double COMP = qbinfo.nextInt();
		
		System.out.println("Enter number of passing yards: " );
		double YDS = qbinfo.nextInt();
		
		System.out.println("Enter number of touchdown passes: " );
		double TD = qbinfo.nextInt();

		System.out.println("Enter number of interceptions: " );
		double INT = qbinfo.nextInt();
		
		double a = ((COMP/ATT) - .3) * 5;
		double b = ((YDS/ATT) - 3) * .25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - ((INT/ATT) * 25);
		
		double rating = ((a+b+c+d) / 6) * 100;
		
		if ((COMP/ATT)>=.775 && (YDS/ATT)>=12.5 && (TD/ATT)>=.11875 && INT == 0) {
			rating = 158.3;
		}
		
		System.out.printf("The QB rating is %.1f", rating);
	}
}
