package String;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="madam";
		Palindrom obj=new Palindrom();
		obj.test(str);

	}
	
	public void test(String s){
		boolean status=true;
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
			if(s.charAt(i)!=s.charAt(j)){
				status=false;
				break;
			}
		}
		if(status){
			System.out.println("Palindrom");
		}
		else{
			System.out.println("Not a Palindrom");
		}
	}

}
