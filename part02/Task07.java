package by.jonline.mod03.part02;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
*/public class Task07 {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("abc cde c deff ");

		deleteSpaces(str);
		deleteDuplicateCharacters(str);

		System.out.println(str);

	}

	public static void deleteSpaces(StringBuilder str) {
		if (str == null) {
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {

				str.deleteCharAt(i);
				i--;
			}

		}

	}

	public static void deleteDuplicateCharacters(StringBuilder str) {
		if (str == null) {
			return;
		}

		char c;

		for (int i = 0; i < str.length() - 1; i++) {

			c = str.charAt(i);

			for (int j = i + 1; j < str.length(); j++) {

				if (c == str.charAt(j)) {

					str.deleteCharAt(j);
					j--;
				}

			}

		}
	}

}
