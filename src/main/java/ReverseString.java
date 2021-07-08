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
			while (i < str.length() / 2) {
				charArr[i] = str.charAt(j);
				charArr[j] = str.charAt(i);

				j--;
				i++;
			}
			String answer = String.valueOf(charArr);
			System.out.println(answer);
			return answer;
		} else {
			while (i <= str.length() / 2) {
				charArr[i] = str.charAt(j);
				charArr[j] = str.charAt(i);
				j--;
				i++;

			}
			String answer = String.valueOf(charArr);
			System.out.println(answer);
			return answer;
		}

	}

	public static void main(String[] args) {
		String str = "123456";
		ReverseString r = new ReverseString();
		r.reverse(str);

		String str2 = "12345";
		ReverseString r2 = new ReverseString();
		r2.reverse(str2);
	}

}
