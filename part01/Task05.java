package by.jonline.mod03.part01;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Task05 {

	public static void main(String[] args) {

		String str = "       I'm   happy.    I'm learning   java     !  ";
		String result = removeSpaces(str);

		System.out.println(str);
		System.out.println(result);
	}

	public static String removeSpaces(String str) {
		if (str == null) {
			return null;
		}

		String result = "";
		char[] mas = str.toCharArray();
		int start = 0;
		int end = mas.length - 1;
		boolean previousIsSpase = false;

		if (mas.length >= 1) {

			while (mas[start] == 32 && start < mas.length - 1) {
				start++;
			}

			while (mas[end] == 32 && end > 0) {
				end--;
			}
		}

		for (int i = start; i <= end; i++) {

			if (mas[i] == 32 && previousIsSpase) {
				continue;

			} else {
				result = result + mas[i];
			}

			if (mas[i] == 32) {
				previousIsSpase = true;

			} else {
				previousIsSpase = false;
			}

		}

		return result;

	}

}
