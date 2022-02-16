import java.util.Scanner;
public class Remove {
	
	public static String remove(String word, char ch) {
    	String removedWord = word.replace(Character.toString(ch).toLowerCase(), "");
    	removedWord = removedWord.replace(Character.toString(ch).toUpperCase(), "");
    	return removedWord;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String word = input.next();
		System.out.print("Kelimeden kaldırmak istediğiniz harfi giriniz: ");
		char ch = input.next().charAt(0);
		System.out.print("Yeni Kelime: ");
		System.out.println(remove(word, ch));
		input.close();
	}
}