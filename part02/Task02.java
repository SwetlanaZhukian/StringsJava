package by.jonline.mod03.part02;
//В строке вставить после каждого символа 'a' символ 'b'.

public class Task02 {

	public static void main(String[] args) {
		
//		StringBuilder str = new StringBuilder(
//				"In the left-hand pane, select your language (for example, Java or Kotlin ). aaa");
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a') {
//				str.insert(i + 1, 'b');
//			}
//
//		}
//		System.out.println(str);
		
		String str = new String("In the left-hand pane, select your language (for example, Java or Kotlin ). aaa");
		String result = str.replace("a", "ab");
		System.out.println(result);
	}

}
