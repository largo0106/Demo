package test;

public class testJav {

	public static void main(String[] args) {
		/*
		 * String[] bikeMake = new String[5]; bikeMake[0] = "Honda"; bikeMake[1]
		 * = "Yamaha"; bikeMake[2] = "Suzuki"; bikeMake[3] = "Kawasaki";
		 * bikeMake[4] = "Piaggio"; int iLength = bikeMake.length;
		 * System.out.println("The length of string is " + iLength); String
		 * bmHonda = bikeMake[0]; System.out.println("Brand is " + bmHonda);
		 * String bmSuzuki = bikeMake[iLength - 2];
		 * System.out.println("Current brand is \n" + bmSuzuki + "\n"); // int
		 * i; for (int i = 0; i < iLength; i++) {
		 * System.out.println("Brand is at " + i + " position and its name is "
		 * + bikeMake[i] + "\n"); } Print_Array(bikeMake);
		 */
		String[] numPosition = Return_Array();
		for (int i = 0; i < numPosition.length; i++) {
			System.out.println("" + numPosition[i]);
		}
	}

	public static String[] Return_Array() {
		String[] nArray = { "1", "2", "3", "4", "5" };
		return nArray;
	}
	
	/*
	 * public static void Print_Array(String[] array) { int aLength =
	 * array.length; for (int i = 0; i < aLength; i++) { System.out.println("" +
	 * array[i]); } }
	 */

	/*
	 * public static void main(String[] args) { // Declaring an Array String[]
	 * aMake = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" }; // Calling Print
	 * Array method and passing an Array as a parameter Print_Array(aMake);
	 * 
	 * }
	 * 
	 * // This accept Array as an argument of type String public static void
	 * Print_Array(String[] array) {
	 * 
	 * for (int i = 0; i < array.length; i++) {
	 * System.out.println("Printing all the values of an Array ==> " +
	 * array[i]); } } }
	 */

	/*
	 * public static void main(String[] args) { int iDay = 1; String sDay =
	 * "Monday";
	 * 
	 * switch (iDay) { case 2: System.out.println("Today is Monday"); break;
	 * case 3: System.out.println("Today is Tuesday"); break; case 4:
	 * System.out.println("Today is Wednesday"); break; case 5:
	 * System.out.println("Today is Thursday"); break; case 6:
	 * System.out.println("Today is Friday"); break; case 7:
	 * System.out.println("Today is Saturday"); break; default:
	 * System.out.println("Today is Sunday"); break; }
	 * 
	 * switch (sDay) { case "Monday": System.out.println("Today is Monday");
	 * break; case "Tuesday": System.out.println("Today is Tuesday"); break;
	 * case "Wednesday": System.out.println("Today is Wednesday"); break; case
	 * "Thursday": System.out.println("Today is Thursday"); break; case
	 * "Friday": System.out.println("Today is Friday"); break; case "Saturday":
	 * System.out.println("Today is Saturday"); break; default:
	 * System.out.println("Today is Sunday"); break; } }
	 */
}