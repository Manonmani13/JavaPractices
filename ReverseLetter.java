package logicprograms;

public class ReverseLetter {
public static void main(String[] args) {
	String words="Hello welcome to Learning";
	String word[]=words.split(" ");
	for(int i=word.length-1;i>=0;i--)
	{
		System.out.println(word[i]);
	}
}
}
