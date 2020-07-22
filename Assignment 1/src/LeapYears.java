
public class LeapYears {

public static void printLeapYears(int startYear, int endYear) {
	
	if (startYear == endYear) {
		System.out.println(startYear); //if startYear is equal to endYear, return startYear value
	}
	
	if (startYear > endYear || startYear<0 || endYear<0) {
		System.err.println("ERROR: startYear is greater than endYear or startYear/endYear is negative "); //che cks for proper input
	}

	while (startYear < endYear && startYear % 4 == 0 && startYear>0 && endYear > 0) {//while endYear is greater than startYear, and startYear
		System.out.println(startYear);					//is divisible by 4 equally, print startYear value
		startYear = startYear +4;						//add 4 to startYear
	}	
	}
	


public static void main(String[] args) {
	printLeapYears(2012, 2012);
	printLeapYears(2012, 2048);
	printLeapYears(2017, 2077);
	printLeapYears(1998, 1999);
	
	
	
}



}