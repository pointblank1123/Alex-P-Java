package testArea;

public class MergeSort {
    
   private int[] array;
   private char[] charArray;
   private int[] tempMergArr;
   private char[] tempCharMergArr;
   private int length;
   String alpha="abcdefghijklmnopqrstuvwxyz0123456789.,:;-\"?[]' ";
   
   public void sort(int inputArr[], char[] charAlpha) {
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
}
