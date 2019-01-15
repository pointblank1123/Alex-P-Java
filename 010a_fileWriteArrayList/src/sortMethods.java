import java.util.ArrayList;
import java.util.Random;

public class sortMethods {
	int temp;
	int key;
	int j;
	char alphaTemp;
	String alpha="abcdefghijklmnopqrstuvwxyz0123456789.,:;-\"?[]' ";
	int[] tempMergeArray;
	char[] tempCharMergeArray;
	int[] array;
	char[] charArray;
	int[] tempMergArr;
	private char[] tempCharMergArr;
	private int length;
	int minVal;
	int minInd;
	int selTemp=0;
	char minChar;
	char selTempChar;
	
	//Bubble Sort-----------------------------------------------
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
	
	//Insert Sort-----------------------------------------------
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
	
	//ArrayList Insert Sort---------------------------------------------------------------------
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
	
	//Merge Sort---------------------------------------------
	public void MergeSort(int inputArr[], char[] charAlpha) {
	   this.array = inputArr;
	   this.charArray = charAlpha;
	   this.length = inputArr.length;
	   this.tempMergArr = new int[length];
	   this.tempCharMergArr = new char[charAlpha.length];
	   doMergeSort(0, length - 1);
	   for(int i=0;i<length;i++) {
		   if (inputArr[i]!=0) {
			   if(charAlpha[i]==alpha.charAt(alpha.indexOf(" "))) {
				   System.out.println("Spaces:" + inputArr[i]);
			   }
			   else {
				   System.out.println(charAlpha[i] + ":" + inputArr[i]);
			   }
		   }
	   }
	}
	private void doMergeSort(int lowerIndex, int higherIndex) {
    //recursion
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
    	}
   }
   private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	   for (int i = lowerIndex; i <= higherIndex; i++) {
           tempMergArr[i] = array[i];
           tempCharMergArr[i] = charArray[i];
       }
       int i = lowerIndex;
       int j = middle + 1;
       int k = lowerIndex;
       while (i <= middle && j <= higherIndex) {
    	   if (tempMergArr[i] >= tempMergArr[j]) {
    		   array[k] = tempMergArr[i];
    		   charArray[k] = tempCharMergArr[i];
               i++;
           } else {
               array[k] = tempMergArr[j];
               charArray[k] = tempCharMergArr[j];
               j++;
           }
           k++;
       }
       while (i <= middle) {
    	   array[k] = tempMergArr[i];
    	   charArray[k] = tempCharMergArr[i];
    	   k++;
    	   i++;
       }
   }
   //Quick Sort--------------------------------------------
	public void quickSort(int[] A, char[] C) {
		quickSort(A, C, 0, A.length-1);	
		for(int i=0;i<alpha.length();i++) {
			if (A[i]!=0) {
				if(C[i]==alpha.charAt(alpha.indexOf(" "))) {
					System.out.println("Spaces:" + A[i]);
				}
				else {
					System.out.println(C[i] + ":" + A[i]);
				}
			}
		}
	}
	public void quickSort(int[] A, char[] C, int low, int high) {
		if (low < high+1) {
			int p = partition(A, C, low, high);
			quickSort(A, C, low, p-1);
			quickSort(A, C, p+1, high);
			
		}
	}
	private void swap(int[] A, char[] C, int index1, int index2) {
			int temp=A[index1];
			A[index1]= A[index2];
			A[index2] = temp;
			char CharTemp=C[index1];
			C[index1]= C[index2];
			C[index2] = CharTemp;
	}
	private int getPivot(int low, int high) {
		Random  rand= new Random();
		return rand.nextInt((high - low) + 1)+low;
	}
	private int partition(int[] A, char[] C, int low, int high) {
		swap(A, C, low, getPivot(low,high));
		int border = low+1;
		for(int i = border; i <= high; i++) {
			if(A[i] > A[low]) {
				swap(A, C,i, border++);
			}
		}
		swap(A, C, low, border-1);
		return border-1;
	}
	//Selection Sort-----------------------------------------------
	public void selectionSort(int[] alphaArray, char[] charAlpha) {
		for(int i = 0; i<alphaArray.length;i++) {
			minVal = alphaArray[i];
			minInd = i;
			minChar = charAlpha[i];
			for(int j=i; j < alphaArray.length;j++) {
				if(alphaArray[j]>minVal) {
					minVal=alphaArray[j];
					minInd=j;
					minChar=charAlpha[j];
				}
			}
			if(minVal > alphaArray[i]) {
				selTemp= alphaArray[i];
				selTempChar = charAlpha[i];
				alphaArray[i]= minVal;
				alphaArray[minInd]= selTemp;
				charAlpha[i]= minChar;
				charAlpha[minInd]=selTempChar;
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
}