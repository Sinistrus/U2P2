import java.util.*;
public class U2P2 {
	
	Scanner keyboard = new Scanner(System.in);
	
	public int[][]yearArray = new int[12][2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String monthStringConverter (int monthNumber) {
		String monthAsString = "";
		
		switch (monthNumber) {
		
		case 1: monthAsString ="January";
		break;
		case 2: monthAsString ="February";
		break;
		case 3: monthAsString ="March";
		break;
		case 4: monthAsString ="April";
		break;
		case 5: monthAsString ="May";
		break;
		case 6: monthAsString ="June";
		break;
		case 7: monthAsString ="July";
		break;
		case 8: monthAsString ="August";
		break;
		case 9: monthAsString ="September";
		break;
		case 10: monthAsString ="October";
		break;
		case 11: monthAsString ="November";
		break;
		case 12: monthAsString ="December";
		break;
		
		}
		
		return monthAsString;
	}
	
	public int monthNumeralConverter (String monthString) {
		int monthAsNumeral = 0;
		
		monthString = monthString.toUpperCase();
		
		if (monthString.equals("JANUARY")) {
			monthAsNumeral = 1;
		}
		else if (monthString.equals("FEBRUARY")) {
			monthAsNumeral = 2;
		}
		else if (monthString.equals("MARCH")) {
			monthAsNumeral = 3;
		}
		else if (monthString.equals("APRIL")) {
			monthAsNumeral = 4;
		}
		else if (monthString.equals("MAY")) {
			monthAsNumeral = 5;
		}
		else if (monthString.equals("JUNE")) {
			monthAsNumeral = 6;
		}
		else if (monthString.equals("JULY")) {
			monthAsNumeral = 7;
		}
		else if (monthString.equals("AUGUST")) {
			monthAsNumeral = 8;
		}
		else if (monthString.equals("SEPTEMBER")) {
			monthAsNumeral = 9;
		}
		else if (monthString.equals("OCTOBER")) {
			monthAsNumeral = 10;
		}
		else if (monthString.equals("NOVEMBER")) {
			monthAsNumeral = 11;
		}
		else if (monthString.equals("DECEMBER")) {
			monthAsNumeral = 12;
		}
		
		return monthAsNumeral;
	}
	
	public void inputTempForMonth(String monthString, int[] monthArray  ) {
		
		int monthNumeral = this.monthNumeralConverter(monthString);
		monthNumeral = monthNumeral - 1;
		
		yearArray[monthNumeral]= monthArray ;		
		
		
		
	}
	
	public int[][] yearArrayCreator () {
		
		int [][] yearArrayCreated = {
				
				{0, 0},//January
				{0, 0},//February
				{0, 0},//March
				{0, 0},//April
				{0, 0},//May
				{0, 0},//June
				{0, 0},//July
				{0, 0},//August
				{0, 0},//September
				{0, 0},//October
				{0, 0},//November
				{0, 0},//December
				
				
				
		};
		
		
		for (int monthNumber = 0; monthNumber <12; monthNumber = monthNumber +1) {
			
			System.out.println("Please enter the highest temperature for " + monthStringConverter(monthNumber+1));
			
			yearArray[monthNumber][0] = keyboard.nextInt();
			
			System.out.println("Please enter the lowest temperature for " + monthStringConverter(monthNumber+1));
			
			yearArray[monthNumber][1] = keyboard.nextInt();
			
		}
		
/*		for (int monthNumber = 0; monthNumber <12; monthNumber = monthNumber +1) {
			
			System.out.println("high :"+ this.yearArray[monthNumber][0]);
			System.out.println("low :"+ this.yearArray[monthNumber][1]);
			
		}*/

		
		return yearArrayCreated;
	}
	
	public double calculateAverageHigh(int[][] yearArrayHolder) {
		double calculatedHighAverage = 0;
		double sum = 0;
		
		for (int monthNumber = 0; monthNumber < yearArrayHolder.length; monthNumber = monthNumber + 1) {
			
			sum = yearArrayHolder[monthNumber][0] + sum;
			
		}
		
		calculatedHighAverage = sum / yearArrayHolder.length;
		
		return calculatedHighAverage;
	}
	
	public double calculateAverageLow(int[][] yearArrayHolder) {
		double calculatedHighAverage = 0;
		double sum = 0;
		
		for (int monthNumber = 0; monthNumber < yearArrayHolder.length; monthNumber = monthNumber + 1) {
			
			sum = yearArrayHolder[monthNumber][1] + sum;
			
		}
		
		calculatedHighAverage = sum / yearArrayHolder.length;
		
		return calculatedHighAverage;
	}
	
	public int findHighestTemp(int[][] yearArrayHolder) {
		int highestTempIndex = 0;
		
		int [] highestTempsHolder = new int[12];
		
		for (int monthNumber = 0; monthNumber < yearArrayHolder.length; monthNumber = monthNumber + 1) {
			
			highestTempsHolder[monthNumber]= yearArrayHolder[monthNumber][0];
			
		}
		
		
		for (int i = 0; i < highestTempsHolder.length - 1; i = i + 1) {

			for (int j = 0; j < (highestTempsHolder.length - 1) - i; j = j + 1) {

				if (highestTempsHolder[j + 1] < highestTempsHolder[j]) {

					int holder = highestTempsHolder[j];
					highestTempsHolder[j] = highestTempsHolder[j + 1];
					highestTempsHolder[j + 1] = holder;

				}

			}

		}
		
		for (int monthNumber = 0; monthNumber < yearArrayHolder.length; monthNumber = monthNumber + 1) {
			
			if (yearArrayHolder[monthNumber][0] == highestTempsHolder[highestTempsHolder.length-1]) {
				
				highestTempIndex = monthNumber;
				monthNumber = 12;
			}
			
		}
		
		
				
		//System.out.println("index of highest temp is: " +highestTempIndex);
		return highestTempIndex;
	}
	
	public int findLowestTemp(int[][] yearArrayHolder) {
		int lowestTempIndex = 0;
		
		int [] lowestTempsHolder = new int[12];
		
		for (int monthNumber = 0; monthNumber < yearArrayHolder.length; monthNumber = monthNumber + 1) {
			
			lowestTempsHolder[monthNumber]= yearArrayHolder[monthNumber][1];
			
		}
		
		
		for (int i = 0; i < lowestTempsHolder.length - 1; i = i + 1) {

			for (int j = 0; j < (lowestTempsHolder.length - 1) - i; j = j + 1) {

				if (lowestTempsHolder[j + 1] < lowestTempsHolder[j]) {

					int holder = lowestTempsHolder[j];
					lowestTempsHolder[j] = lowestTempsHolder[j + 1];
					lowestTempsHolder[j + 1] = holder;

				}

			}

		}
		
		for (int monthNumber = 0; monthNumber < yearArrayHolder.length; monthNumber = monthNumber + 1) {
			
			if (yearArrayHolder[monthNumber][1] == lowestTempsHolder[0]) {
				
				lowestTempIndex = monthNumber;
				monthNumber = 12;
			}
			
		}
		
		
				
		//System.out.println("index of lowest temp is: " +lowestTempIndex);
		return lowestTempIndex;
	}
	

}
