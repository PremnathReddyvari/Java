package first;

public class Arrow {
	
public static void main(String[] args) {
	String a=new String("JAVAJ2EE");
	char[] ca = a.toCharArray();

	for(int i=0;i<ca.length;i++){
		for(int j=0;j<=i;j++){
			System.out.print(ca[j]);
		}
		System.out.println();
	}
	for(int i=ca.length-2;i>0;i--){
		for(int j=0;j<=i;j++){
			System.out.print(ca[j]);
		}
		System.out.println();
	}
	
	
}

}
