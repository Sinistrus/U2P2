
public class execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//author:Sahel Khan
		//contact: sahel.khan@gmail.com
		
		U2P2 finalTestObject = new U2P2();
		
/*		int [][] finalTestArray = {
		
				{40, -10},//January
				{55, 25},//February
				{60, 40},//March
				{88, 20},//April
				{72, 55},//May
				{95, 80},//June
				{97, 87},//July
				{110, 98},//August
				{79, 68},//September
				{31, 30},//October
				{58, -25},//November
				{32, -20},//December
				
		};*/
		
/*		for (int row = 0; row < finalTestArray.length; row = row + 1 ) {
			
			System.out.println("Month is " + finalTestObject.monthStringConverter(row+1));
			
			for (int column = 0; column < finalTestArray[row].length; column = column + 1) {
				
				if (column == 0){
					System.out.println("Highest temperature is " + (finalTestArray[row][column]));
				}
				if (column ==1 ) {
					
					System.out.println("Lowest temperature is " + (finalTestArray[row][column]));
				}
			}
		}
		
		int showString = finalTestObject.monthNumeralConverter("deCember");
		
		System.out.println(showString);
		
		int[] testMonthArray = new int[] {40, -10};
		finalTestObject.inputTempForMonth("January", testMonthArray);
		
		System.out.println("high :"+ finalTestObject.yearArray[0][0]);
		System.out.println("low :"+ finalTestObject.yearArray[0][1]);*/
		
		System.out.println("Welcome to the Temperatures application");
		
		
		finalTestObject.yearArrayCreator();
		
		System.out.println("The average of High Temperatures for this year was: " + finalTestObject.calculateAverageHigh(finalTestObject.yearArray) + " degrees");
		
		System.out.println("The average of Low Temperatures for this year was: " + finalTestObject.calculateAverageLow(finalTestObject.yearArray) + " degrees");
		
		
		System.out.println("The highest temperature this year was in : " + finalTestObject.monthStringConverter(finalTestObject.findHighestTemp(finalTestObject.yearArray)+1));
		
		System.out.println("The lowest temperature this year was in : " + finalTestObject.monthStringConverter(finalTestObject.findLowestTemp(finalTestObject.yearArray)+1));
		
		
		
		
		

	}

}
