package com.bkayranci.question1;
import java.util.ArrayList;
import java.util.Scanner;
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Text:\n");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		//String data = "hello world hello hello world turkey hello turkey";
		String words[] = data.split(" ");
		ArrayList<WordStruct> wordStructList = new ArrayList<Source.WordStruct>();
		
		for (int i = 0; i < words.length; i++) {
			
			if (getWithWord(wordStructList, words[i]) == null || i == 0) {
				wordStructList.add(new WordStruct(words[i]));
			}
			else {
				getWithWord(wordStructList, words[i]).howMany++;
			}
		}
		
		System.out.println("The Most Using Word or Words:\n" + getMostUsingWord(wordStructList));
		System.out.println("The Least Using Word or Words:\n" + getLeastUsingWord(wordStructList));
	}
	private static String getMostUsingWord(ArrayList<WordStruct> wordStructList) {
		WordStruct temp = wordStructList.get(0);
		String result = temp.word + ": " + temp.howMany;
		for (int i = 0; i < wordStructList.size(); i++) {
			if (wordStructList.get(i).howMany > temp.howMany) {
				temp = wordStructList.get(i);
				result = temp.word + ": " + temp.howMany;
			}
			else if (wordStructList.get(i).howMany == temp.howMany && i != 0) {
				result += "\n" + wordStructList.get(i).word + ": " + wordStructList.get(i).howMany;
			}
		}
		return result;
	}



	private static String getLeastUsingWord(ArrayList<WordStruct> wordStructList) {
		WordStruct temp = wordStructList.get(0);
		String result = temp.word + ": " + temp.howMany;
		for (int i = 0; i < wordStructList.size(); i++) {
			if (wordStructList.get(i).howMany < temp.howMany) {
				temp = wordStructList.get(i);
				result = temp.word + ": " + temp.howMany;
			}
			else if (wordStructList.get(i).howMany == temp.howMany  && i != 0) {
				result += "\n" + wordStructList.get(i).word + ": " + wordStructList.get(i).howMany;
			}
		}
		return result;
	}

	public static WordStruct getWithWord(ArrayList<WordStruct> myList,String myWord) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).word.equals(myWord)) {
				return myList.get(i);
			}
		}
		return null;
	}

	public static class WordStruct{
		String word = "";
		int howMany = (int)0;
		public WordStruct(String word) {
			this.word = word;
			this.howMany = (int)1;
		}
		public WordStruct() {
			this.word = "";
			this.howMany = (int)0;
		}
	}
}
