package by.jonline.mod03.part02;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task04 {

	public static void main(String[] args) {
		String str = "информатика";

		String str1 = String.copyValueOf(str.toCharArray(), 7, 1);
		String str2 = String.copyValueOf(str.toCharArray(), 3, 2);

		String result = str1.concat(str2).concat(str1);

		System.out.println(result);

	}

}
