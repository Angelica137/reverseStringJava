class ReverseString3 {
	public static void main(String[] args) {
		String input = "Reverse this string";

		StringBuilder input1 = new StringBuilder();

		// append a string into input1
		input1.append(input);

		// use .reverse()
		input1.reverse();

		System.out.println(input1);
	}
}