package vorlesung.basics;

public class Switch {

	public static void main(String[] args) {
		int month = 11;
		int year = 2017;
		
		int numDays = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if ( ((year%4 == 0) && !(year%100 == 0)) || (year%400 == 0) ) {
				numDays = 29;
			} else {
				numDays = 28;
			}
			break;
		default:
			System.out.println(month + " ist kein gültiger Monat.");
		}
		
		System.out.println("Monat " + month + " im Jahr " + year + " hat " + numDays + " Tage.");
	}

}
