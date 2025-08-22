// To check Vowel or Consonant

public class VowelConsonantCheck {
    public static void main(String[] args) 
	{
        char ch = 'O';  
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a': System.out.println(ch + " is a Vowel");
			             break;
            case 'e': System.out.println(ch + " is a Vowel");
			             break;
            case 'i': System.out.println(ch + " is a Vowel");
			             break;
            case 'o': System.out.println(ch + " is a Vowel");
			             break;
            case 'u': System.out.println(ch + " is a Vowel");
			             break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }
}