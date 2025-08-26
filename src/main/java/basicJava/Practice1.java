package basicJava;

public class Practice1 {
	public static void main(String[] args) {
		
		String str ="Payment $100 paid";
		int length =str.length();
		
		for (int i=0;i<length;i++)
		{
			if(str.charAt(i) == '$')
			{
				System.out.println("Character: "+str.charAt(i));
				System.out.println("Index: "+i);
				System.out.println("Prints value from $: "+str.substring(i));
			}
		}
	}

}
