package student;

public class JamesBond {

	// this is an array containing the alphabet in lower case
	//
	// the next line will print "david"
	// System.out.println("" + ALPHABET[3] + ALPHABET[0] + ALPHABET[21] +
	// ALPHABET[8] + ALPHABET[3]);
	//
	//

	public static final char[] ALPHABET = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	//
	// TODO complete this method
	//
	// this method must return the index (place in the ALPHABET) of searched char
	//
	public static int getIndexOfChar(char searchedChar) {

		// for each possible index of the array

		// for (int i = 0; ..... {

			// check if the value at index i is equal to the searchedChar parameter
			// if ( ......) {
			// 		if true, we found the index of searchedChar !
			// 		return i;
			// }
		// }

		throw new RuntimeException("You can not search this char '" + searchedChar + "'");

	}

	public static String cypher(String plainText, int shiftKey) {
		String cipheredText = "";

		for (int i = 0; i < plainText.length(); i++) {

			// get the position of the char at index i
			int charPosition = getIndexOfChar(plainText.charAt(i));

			// compute the shifted index
			int key = charPosition + shiftKey;

			// if key is too big
			if (key >= 26) {
				key = key - 26;
			}

			// get the char at the specific key
			char replaceVal = ALPHABET[key];

			// append the char to the returned value
			cipheredText = cipheredText + replaceVal;
		}

		return cipheredText;
	}

	//
	// TODO complete this method
	//
	// this method must return the index (place in the ALPHABET) of searched char
	//
	public static String decypher(String cypheredText, int shiftKey) {
		String plainText = "";

//		 for each char of the "cypheredText" parameter

		// for ...
		{
			// get the position of the char at index i
			// int charPosition = ...

			// compute the shifted index
			// int keyVal = ...

			// if the key is below zero
			// if (....) {
			// correct the key
			// }

			// get the deciphered char
			// char replaceVal =...

			// append to the returned string
			// plainText = plainText + replaceVal;
		}

		return plainText;
	}

	public static void main(String[] args) throws Exception {

		String plainText = "icam";

		System.out.println("I'm trying to cypher the following message : '" + plainText + "'");

		String cypheredMessage = cypher(plainText, 12);

		System.out.println("The cyphered message is : '" + cypheredMessage);

		System.out.println();
		System.out.println();
		System.out.println();

		// try to decypher with all possible keys
		for (int i = 0; i < ALPHABET.length; i++) {
			System.out.println(decypher(cypheredMessage, i));
		}

	}

}
