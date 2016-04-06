
public class Easter {

	public static String calculateEaster(int iYear) {

		int a = iYear % 19;
		int b = iYear % 4;
		int c = iYear % 7;
		//Extra point +2
		int k = Math.floorDiv(iYear, 100);
		int p = Math.floorDiv(13 + 8 * k, 25);
		int q = Math.floorDiv(k, 4);
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		int date = d + e - 9;
		String Month = "April";

		if (d == 29 && e == 6) {
			date = 19;
			Month = "April";
		} else {
			if ((d == 28 && e == 6) && ((11 * M + 11) % 30 < 19)) {
				date = 18;
				Month = "April";
			}
		}
		
		//3月的呢? -5
		return "In" + iYear + ", Easter Sunday is: month是" + Month + " " + "and day是" + date;

	}

}
