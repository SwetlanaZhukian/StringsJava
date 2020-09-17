package by.jonline.mod03.part01;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
public class Task01 {

	public static void main(String[] args) {

		String[] mas = new String[] { "camelCase", "firstNumber", "secondNumber", null, "endOfLine", "toLowerCase",
				"countNumberOfLettersInUpperCase" };
		System.out.println("Названия в camelCase ");
		printArray(mas);

		String[] resultMas = convertToSnakeCase(mas);
		System.out.println("Названия в snake_case ");
		printArray(resultMas);

	}

	public static void printArray(String[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == null) {
				continue;
			}

			System.out.print(mas[i] + "  ");

		}

		System.out.println();

	}

	public static int countNumberOfLettersInUpperCase(char[] mas) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {

			if (Character.isUpperCase(mas[i])) {

				count++;

			}

		}

		return count;

	}

	public static String[] convertToSnakeCase(String[] mas) {
		if (mas == null) {
			return null;
		}

		char[] camelCase;
		char[] snakeCase;
		int count;
		int k;

		String[] result = new String[mas.length];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == null) {
				continue;
			}

			count = 0;
			k = 0;

			camelCase = mas[i].toCharArray();
			count = countNumberOfLettersInUpperCase(camelCase);

			snakeCase = new char[camelCase.length + count];

			for (int j = 0; j < snakeCase.length; j++) {

				if (Character.isUpperCase(camelCase[k])) {
					camelCase[k] = Character.toLowerCase(camelCase[k]);
					snakeCase[j] = '_';

				} else {

					snakeCase[j] = camelCase[k];
					k++;
				}
			}

			result[i] = new String(snakeCase);

		}

		return result;

	}

}
