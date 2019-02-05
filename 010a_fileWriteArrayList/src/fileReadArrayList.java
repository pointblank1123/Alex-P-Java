import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

<<<<<<< HEAD
public class fileReadArrayList {

	public static void main(String[] args) {
		String filename = "/home/compsci/eclipse-workspace/TextFiles/Kennedy_Cuba_Crisis.txt";
=======
import javax.swing.JOptionPane;

public class fileReadArrayList {

	public static void main(String[] args) {
		String filename = "/home/compsci/eclipse-workspace/TextFiles/SampleTextFile_1000kb.txt";
>>>>>>> edc8e4e9d0b66c092e5349a1b635113549050039
		String line;
		ArrayList<String> alist = new ArrayList<String>();
		String alpha="abcdefghijklmnopqrstuvwxyz0123456789.,:;-\"?[]' ";
		char[] charAlpha=alpha.toCharArray();
		int[] alphaArray = new int[alpha.length()];
		int unknown=0;
		
		//ArrayList<Integer> alphaArrayL = new ArrayList<Integer>();
		//ArrayList<Character> alphaChars = new ArrayList<Character>();
		
		sortMethods sm = new sortMethods();
<<<<<<< HEAD
		MergeSort ms = new MergeSort();
=======
>>>>>>> edc8e4e9d0b66c092e5349a1b635113549050039
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(filename));
			if(!input.ready()) {
				input.close();
				throw new IOException();
			}
			while((line = input.readLine())!= null) {
				alist.add(line);
			}
			input.close();
		}
		catch (IOException e){
			System.out.println("Error: " + e);
		}
		/*
		for(int i=0;i<alpha.length();i++) {
			alphaChars.add(i, alpha.charAt(i));
		}
		*/
		for(int i=0;i<alpha.length();i++) {
			alphaArray[i]=0;
			//alphaArrayL.add(i, 0);
		}
		
		for(int i=0; i<alist.size();i++){
			String word = alist.get(i).toString().toLowerCase();
			int len = word.length();
			for(int pos = 0; pos<len;pos++) {
				if (!alpha.contains(""+word.charAt(pos))) {
					unknown+=1;
				}
				else {
					alphaArray[alpha.indexOf(word.charAt(pos))] += 1;
					//alphaArrayL.set(alpha.indexOf(word.charAt(pos)), alphaArrayL.get(alpha.indexOf(word.charAt(pos)))+1);
				}
			}
		}
<<<<<<< HEAD
		//Bubble sort
		//sm.bubbleSort(alphaArray,charAlpha);
		//Insert sort
		//sm.insertSort(alphaArray, charAlpha);
		//Insert sort w/ ArrayList
		//sm.insertSortAList(alphaArrayL, alphaChars);
		//merge sort
		ms.sort(alphaArray, charAlpha);
=======
        String[] options = {"Bubble Sort", "Insert Sort", "Merge Sort", "Quick Sort", "Selection Sort"};

        int x = JOptionPane.showOptionDialog(null, "Which type of sort do you want to use?",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		//Bubble sort
        if (x==0) {
        	sm.bubbleSort(alphaArray,charAlpha);
        }
		//Insert sort
        if (x==1) {
        	sm.insertSort(alphaArray, charAlpha);
        }
		//Insert sort w/ ArrayList
		//sm.insertSortAList(alphaArrayL, alphaChars);
		//Merge sort
        if(x==2) {
        	sm.MergeSort(alphaArray, charAlpha);
        }
		//QuickSort
        if(x==3) {
        	sm.quickSort(alphaArray, charAlpha);
        }
		//Selection Sort
        if(x==4) {
        	sm.selectionSort(alphaArray, charAlpha);
        }
>>>>>>> edc8e4e9d0b66c092e5349a1b635113549050039
		
		//unknown characters
		System.out.println("unknown: " + unknown);
		/*
		int sz = alist.size();
		for (int i = 0; i<sz; i++) {
			System.out.println(i+1 + " " + alist.get(i).toString());
		}
		*/
	}

}
