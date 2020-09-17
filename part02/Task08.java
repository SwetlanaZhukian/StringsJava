package by.jonline.mod03.part02;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/
public class Task08 {

	public static void main(String[] args) {
		String str = "If necessary you can change the project location on disk";
		String result = " ";

		String[] mas = str.split(" ");

		for (int i = 0; i < mas.length; i++) {

			if (result.length() < mas[i].length()) {
				result = mas[i];
			}

		}

		System.out.println(result);

	}

}
