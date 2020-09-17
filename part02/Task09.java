package by.jonline.mod03.part02;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/
public class Task09 {

	public static void main(String[] args) {
		String str = "I LIKe to LearN Java";

		int lowerCase = 0;
		int upperCase = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				lowerCase++;

			} else if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				upperCase++;
			}

		}

		System.out.println("Количество строчных букв в строке = " + lowerCase);
		System.out.println("Количество прописных букв в строке = " + upperCase);

	}

}
