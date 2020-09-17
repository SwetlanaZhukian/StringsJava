package by.jonline.mod03.part02;

//  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
public class Task01 {

	public static void main(String[] args) {
		int maxNumberOfSpaces;

		String str = new String("   I like  to   learn       Java     ");
		System.out.println(str);

		maxNumberOfSpaces = countMaxNumberOfSpaces(str);
		System.out.println("Наибольшее количество подряд идущих пробелов в строке = " + maxNumberOfSpaces);

	}

	public static int countMaxNumberOfSpaces(String str) {
		if (str == null) {
			return 0;
		}

		int max = 0;
		int count = 0;
		int end = str.length();

		for (int i = 0; i < end; i++) {
			count = 0;

			while (str.charAt(i) == ' ') {
				count++;
				i++;
				if (i == end) {
					break;
				}
			}

			if (max < count) {
				max = count;
			}

		}

		return max;

	}

}
