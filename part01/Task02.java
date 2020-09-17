package by.jonline.mod03.part01;

//Замените в строке все вхождения 'word' на 'letter'.
public class Task02 {

	public static void main(String[] args) {

		String str = "I don't want to hear a word from you.I didn't say a word. I want a quiet word.word";
		String result = "";

		char[] mas = str.toCharArray();

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 'w' && mas[i + 1] == 'o' && mas[i + 2] == 'r' && mas[i + 3] == 'd') {
				
				result = result + "letter";
				i += 3;

			} else {
				
				result = result + mas[i];
			}

		}

		System.out.println(str);
		System.out.println(result);

	}

}
