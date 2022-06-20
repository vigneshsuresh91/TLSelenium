package assignments;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] charArray = test.toCharArray();
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		for (int i = 0; i < charArray.length; i++) {
			if(Character.isLetter(charArray[i])) {
				letter += 1;
			} else if(Character.isDigit(charArray[i])) {
				num += 1;
			}else if(Character.isSpace(charArray[i])) {
				space += 1;
			} else {
				specialChar += 1;
			}
		}
		System.out.println("The String has the following : "+'\n'+"Letters = "+letter+" Spaces = "+space+ " Numbers = "+num+" Special Characters = "+specialChar);
	}
}