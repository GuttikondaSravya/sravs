import java.util.Scanner;
 class Ideone
 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int k=in.nextInt();
		int[]a=new int[size];
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
if(a[k]%2!=0){
	System.out.println(a[k]);
}else{
	System.out.println(a[k+1]);
}
	}

}
