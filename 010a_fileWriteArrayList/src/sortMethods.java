import java.util.ArrayList;

public class sortMethods {
	int temp;
	int key;
	int j;
	char alphaTemp;
	String alpha="abcdefghijklmnopqrstuvwxyz0123456789.,:;-\"?[]' ";
	int[] tempMergeArray;
	char[] tempCharMergeArray;
	int[] array;
	
	public void bubbleSort(int[] alphaArray, char[] charAlpha) {
		for (int i=0; i<Math.pow(alphaArray.length,2);i++) {
			for(int j=0; j<alphaArray.length-1; j++) {
				if (alphaArray[j]<alphaArray[j+1]) {
					temp = alphaArray[j];
					//Sort numbers in array
					alphaArray[j] = alphaArray[j+1];
					alphaArray[j+1] = temp;
					//Sort Alphabet
					alphaTemp=charAlpha[j];
					charAlpha[j] = charAlpha[j+1];
					charAlpha[j+1]= alphaTemp;
				}
			}
		}
		for(int i=0;i<alpha.length();i++) {
			if (alphaArray[i]!=0) {
				if(charAlpha[i]==alpha.charAt(alpha.indexOf(" "))) {
					System.out.println("Spaces:" + alphaArray[i]);
				}
				else {
					System.out.println(charAlpha[i] + ":" + alphaArray[i]);
				}
			}
		}
	}
	public void insertSort(int[] alphaArray, char[] charAlpha) {
		for(int i=0; i <alphaArray.length;i++) {
			key = alphaArray[i];
			j= i-1;
			while(j >= 0 && key > alphaArray[j]) {
				temp = alphaArray[j];
				alphaArray[j] = alphaArray[j+1];
				alphaArray[j+1] = temp;
				alphaTemp = charAlpha[j];
				charAlpha[j] = charAlpha[j+1];
				charAlpha[j+1] = alphaTemp;
				j--;
			}
		}
		for(int i=0;i<alpha.length();i++) {
			if (alphaArray[i]!=0) {
				if(charAlpha[i]==alpha.charAt(alpha.indexOf(" "))) {
					System.out.println("Spaces:" + alphaArray[i]);
				}
				else {
					System.out.println(charAlpha[i] + ":" + alphaArray[i]);
				}
			}
		}
	}
	public void insertSortAList(ArrayList<Integer> alphaArray, ArrayList<Character> charAlpha) {
		for(int i=0; i <alphaArray.size();i++) {
			key = alphaArray.get(i);
			j= i-1;
			while(j >= 0 && key > alphaArray.get(j)) {
				temp = alphaArray.get(j);
				alphaArray.set(j, alphaArray.get(j+1));
				alphaArray.set(j+1, temp);
				alphaTemp = charAlpha.get(j);
				charAlpha.set(j, charAlpha.get(j+1));
				charAlpha.set(j+1, alphaTemp);
				j--;
			}
		}
		for(int i=0;i<alpha.length();i++) {
			if (alphaArray.get(i)!=0) {
				if(charAlpha.get(i)==alpha.charAt(alpha.indexOf(" "))) {
					System.out.println("Spaces:" + alphaArray.get(i));
				}
				else {
					System.out.println(charAlpha.get(i) + ":" + alphaArray.get(i));
				}
			}
		}
	}
}