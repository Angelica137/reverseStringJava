public class ReverseString {

	public String reverse(String str) {
		char[] charArr = new char[str.length()];
		int i = 0;
		int j = str.length() - 1;
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

}
