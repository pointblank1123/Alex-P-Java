import java.util.Arrays;
/**
 * 
 * @author AlexP
 *
 */
public class ArrayTester {
	static String arrS;
	static String col1;
	/**
	 * 
	 * @param arr2D
	 * @param c
	 * @return
	 * Part a:
	 * +1 point for constructing int array with the size arr2D.length
	 * +1 point for accessing all items in one column of arr2D (no bounds error)
	 * +1 point for assignment of one element from arr2D to corresponding element in new array
	 * +1 point on exit: with the new array contains all elements of selected column
	 */
	public static int[] getColumn(int[][] arr2D, int c) {	
		int[] result = new int[arr2D.length];
		for(int i=0; i<arr2D.length;i++) {
			for(int j=0; j<arr2D[i].length;j++) {
				if(j == c) {
					result[i] = arr2D[i][j];
				}
			}
		}
		return result;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for(int i=0; i<arr1.length;i++) {
			arrS= Arrays.toString(arr1);
			if(!arrS.contains(arr2[i] + "")) {
				return false;
			}
		}
		return true;
	}
	public static boolean containsDuplicates(int[] arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length;j++) {
				if(j!=i) {
					if(arr[i]==arr[j]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	/**
	 * 
	 * @param square
	 * @return
	 * Part b:
	 * +1 point for calling containsDuplicates referencing a row or column of square
	 * +1 point for calling hasAllValues referencing 2 different rows, 2 different columns or a row and a column
	 * +1 point for applying hasAllValues to all rows or all columns
	 * +1 point for calling getColumn to obtain a column from square
	 * +1 point for returning true if all three latin square requirements are met otherwise false
	 */
	public static boolean isLatin(int[][] square) {
		for(int i=0;i<square.length-1;i++) {
			if(containsDuplicates(square[0])) {
				//the array contains a duplicate
				return false;
			}
			if(hasAllValues(square[0],square[i+1]) == false) {
				return false;
			}

			int[] column1= getColumn(square, i);
			int[] column2= getColumn(square, i+1);
			for(int j=0;j<column1.length-1;j++) {
				col1=Arrays.toString(column1);
				if(!col1.contains(column2[i] + "")) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int [][] arr2D= {
				{1,2,3},
				{2,3,1},
				{3,1,2}
			};
		//int[] column = ArrayTester.getColumn(arr2D, 1);
		boolean result = ArrayTester.isLatin(arr2D);
		System.out.println(result);
	}
}
