package by.jonline.mod03.part02;

//Проверить, является ли заданное слово палиндромом
public class Task03 {

	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder("топот");

		if (checkIsPalindrome(str1)) {
			System.out.println("Слово является палиндромом");
		} else {
			System.out.println("Слово  не  является палиндромом");

		}

	}

	public static boolean checkIsPalindrome(StringBuilder str) {

		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();

		if (str.toString().equals(str1.toString())) {
			return true;
		} else {
			return false;
		}

	}

}
