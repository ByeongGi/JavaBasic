
public class IsGuilty {
	private static boolean isguilty=true;	
	private static boolean isdrink = true;
	
	public static void main(String[] args){
		
		
		if (!isdrink&&!isguilty) {
			System.out.println("술을 마시고 죄를 짓는다.");
		} else {
			System.out.println("술을 안 마시고 죄를 안 짓는다.");
		}
		
		if (!isdrink) { 
			isguilty=true;
			System.out.println("술을 안 마셔도 죄를 짓는다.");
		} else if(isdrink){
			isguilty=true;
			System.out.println("술을 마셔도 죄를 짓는다.");
		}
		
		
		
	}
		
		
		
	
	
		
	
	

}
