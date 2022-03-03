import java.util.ArrayList;
import java.util.Scanner;

public class Sum2Elements {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			ArrayList<Integer> A =new ArrayList<Integer>();
			int a,sum;
			System.out.println("Please add numbers in array and add '0' before sum number ");
			while(true) {
				a=sc.nextInt();
				if(a==0) {
					break;
				}else {
					A.add(a);
				}
			}
			a=sc.nextInt();
			sum=a;

			for(int i=0;i<A.size();i++) {
				for(int j=i+1;j<A.size();j++) {
					if((sum-A.get(i))==A.get(j)) {
				System.out.println(i +","+ j);
				break;
					}
				}
			}
			
			sc.close();
		}

}
