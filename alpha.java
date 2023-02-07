public class alpha {
  public static void main(String[] args) {
    char character = 'N';
    if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) 
		{
      System.out.println(character + " is an alphabet");
    } else 
		{
      System.out.println(character + " is not an alphabet");
    }
  }
}