package by.jonline.mod03.part02;

//Из заданной строки получить новую, повторив каждый символ дважды.
public class Task06 {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("If necessary, you can change the project location on disk!");
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			result = result.append(str.charAt(i)).append(str.charAt(i));

		}
		
		System.out.println(result);

	}

}
