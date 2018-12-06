//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cipher {
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:";
	private String plainText = "";
	private String encodedText = "";
	private int key = 0;
	//private Scanner kbd= new Scanner(System.in);
	
	public Cipher() {
		
		System.out.println("Entered Caesar constructor");
	}
	public void getPlainText() {
		plainText = JOptionPane.showInputDialog("Enter the plain Text");
		plainText = plainText.toLowerCase();
		//System.out.println("Enter the plain text");
		//plainText = kbd.nextLine();
		System.out.println("Plain Text: "+plainText);
	}
	public void getKey() {
		key = Integer.parseInt(JOptionPane.showInputDialog("Enter the shift key"));
		//System.out.println("Enter the shift key");
		//key = kbd.nextInt();
		System.out.println("key: " + key);
		
	}
	public void encrypt() {
		encodedText = "";
		int len = plainText.length();
		for (int i=0; i < len; i++) {
			if (!alpha.contains(String.valueOf(plainText.charAt(i))) ) {
				encodedText += " ";
			}
			else {
				int index = (alpha.indexOf(plainText.charAt(i))+key)%alpha.length();
				encodedText += alpha.charAt(index);
			}
		}
		JOptionPane.showMessageDialog(null, "Encoded word: " + encodedText );
		System.out.println(encodedText);
	}
	public String getED() {
		//System.out.println("Do you want to encrypt or decrypt");
		//String ED = kbd.nextLine();
		String ED = JOptionPane.showInputDialog("Do you want to Encrypt or Decrypt ");
		ED = ("" + ED.charAt(0)).toUpperCase();
		System.out.println("Selected "+ ED);
		return ED;
	}
	public void decrypt() {
		encodedText = "";
		int len = plainText.length();
		for (int i = 0; i<len;i++) {
			if (!alpha.contains(String.valueOf(plainText.charAt(i))) ) {
				encodedText += " ";
			}
			else {
				int index = (alpha.indexOf(plainText.charAt(i))-key)%alpha.length();
				if (index < 0) {
					index+=alpha.length();
				}
				encodedText += alpha.charAt(index);
			}
		}
		JOptionPane.showMessageDialog(null, "Decoded word: " + encodedText );
		System.out.println("Decoded Word: " + encodedText);
	}
}
