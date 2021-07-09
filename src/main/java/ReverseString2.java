class ReverseString2 {
	public static void main(String[] args) {
		String input = "Super long string";

		// convert string into bytes
		byte[] strAsByteArr = input.getBytes();

		// create a byte array to store result
		byte[] result = new byte[strAsByteArr.length];

		// store the characters of strAsbyteArr in reverse order into result

		for (int i = 0; i < strAsByteArr.length; i++) {
			result[i] = strAsByteArr[strAsByteArr.length - i - 1];
		}
		System.out.println(new String(result));
	}
}