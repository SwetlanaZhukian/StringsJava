package by.jonline.mod03.part01;

//В строке найти количество цифр.
public class Task03 {

	public static void main(String[] args) {
		
		int numberOfDigits;
		
		String str = "I'm 25. The size of Alaska is 571951 square miles. 1 2 3.";
		
		numberOfDigits= countNumberOfDigits(str);
		
		System.out.println("Количество цифр в строке = " + numberOfDigits);
		

	}

	public static int countNumberOfDigits(String str) {
		if (str == null) {
			return 0;
		}

		int count = 0;
		char[] mas = str.toCharArray();
		
		for (int i = 0; i < mas.length; i++) {
			if (Character.isDigit(mas[i])) {
				count++;
			}

		}
		return count;

	}

}
