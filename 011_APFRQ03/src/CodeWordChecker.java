/**
 * 
 * @author Alex P
 * +1 Point for Declaring header
 */
public class CodeWordChecker implements StringChecker{
	private int minLength;
	private int maxLength;
	private String notAllowed;
	/** 
	 * +1 point for present variables in private instance
	 * <br>
	 * +3 points for constructors
	 * <br>
	 * 	1 for declared header
	 * <br>
	 * 	1 for usage of all proper parameters
	 * <br>
	 * 	1 for usage of default vales and parameters in 1 parameter constructor
	 */
	public CodeWordChecker(int minLen, int maxLen, String symbol) {
		minLength = minLen;
		maxLength = maxLen;
		notAllowed = symbol;
	}
	public CodeWordChecker(String symbol) {
		minLength = 6;
		maxLength = 20;
		notAllowed = symbol;
	}
	/**
	 * +4 points for IsValid method
	 * <br>
	 * 	1 point for declared header 
	 * <br>
	 * 	1 point for checking length between min and max inclusively
	 * <br>
	 * 	1 point for checking for unwanted string
	 * <br>
	 * 	1 point for returns true if length is within bounds and unwanted string is not present
	 */
	public boolean isValid(String str) {
		// TODO Auto-generated method stub
		return str.length()>= minLength && str.length()<=maxLength && str.indexOf(notAllowed) == -1;
	}
	
	public static void main(String[] args) {
		StringChecker sc1 = new CodeWordChecker(5,8,"$");
		StringChecker sc2 = new CodeWordChecker("pass");
		System.out.println(sc1.isValid("happy"));
		System.out.println(sc2.isValid("MyPass"));
		
	}
}
