package by.jonline.mod03.part02;

/* Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.*/
public class Task10 {

	public static void main(String[] args) {
		String str = "First sentence. Second sentence! Third sentence? Fourth sentence";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '.' || c == '!' || c == '?') {
				count++;
			}

		}

		System.out.println("Количество предложений = " + count);

	}

}
