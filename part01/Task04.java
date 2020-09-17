package by.jonline.mod03.part01;

//В строке найти количество чисел
public class Task04 {

	public static void main(String[] args) {

		int amountOfNumbers;

		String str = "I'm 25. The size of Alaska is 571951 square miles. 12,3  89,0  ";

		amountOfNumbers = countAmountOfNumbers(str);
		
		System.out.println("Количество чисел в строке = " +amountOfNumbers);

	}

	public static int countAmountOfNumbers(String str) {
		if (str == null) {
			return 0;
		}

		int count = 0;
		char[] mas = str.toCharArray();
		boolean previousIsDigit = false;

		for (int i = 0; i < mas.length - 1; i++) {

			if (Character.isDigit(mas[i]) && !previousIsDigit) {
				count++;
			}

			if (Character.isDigit(mas[i]) || mas[i] == ',') {
				
				previousIsDigit = true;

			} else {
				
				previousIsDigit = false;
			}

		}
		
		return count;

	}

}
