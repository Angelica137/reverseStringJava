public class ReverseString {

	public String reverse(String str) {
		// create an array of length str.length()
		char[] charArr = new char[str.length()];
		// create an index var i
		int i = 0;
		// have an index variable j == length of string - 1,
		// so I can use it as an index
		int j = str.length() - 1;
		// check if str.length() is odd
		if (str.length() % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}

		/*
		 * create a counter variable == 0 and bounded to length of string divided by 2
		 * if string is even or length of string - 1 divided by 2 if odd.
		 * 
		 * once the counter reaches its upper bound, if the string was odd, add the
		 * remaining character to its same position, else, leave be.
		 */

	}

	public static void main(String[] args) {
		String str = "12345";
		ReverseString r = new ReverseString();
		r.reverse(str);
	}

}
