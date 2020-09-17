package by.jonline.mod03.part02;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task05 {

	public static void main(String[] args) {

		String str = " If necessary, you can change the project location on disk";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}

		}
		System.out.println(count);

	}

}
