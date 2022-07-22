package java_first_program;

public class Java_First_Program {
	public static void main(String[] args) {
		int i = 10;

		if (i < 5) {
			System.out.println("chhay");
		} else if (i == 5) {
			System.out.println("sokoeurn");
		} else {
			System.out.println("sokoeurn chhay");
		}

		int day = 2;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesay");
		} else if (day == 3) {
			System.out.println("Wedneday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Sunday");
		}

		int month = 1;
			switch (month) {
			case 1: System.out.println("January");break;
			case 2: System.out.println("Feburary");break;
			case 3: System.out.println("March");break;
			case 4: System.out.println("April");break;
			case 5: System.out.println("May");break;
			case 6: System.out.println("June");break;
			case 7: System.out.println("July");break;
			case 8: System.out.println("August");break;
			case 9: System.out.println("September");break;
			case 10: System.out.println("October");break;
			case 11: System.out.println("November");break;
			case 12: System.out.println("December");break;
			default: System.out.println("Holiday");

		}

	}
}
