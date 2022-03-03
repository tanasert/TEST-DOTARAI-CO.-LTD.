
public class ThreeFive {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i%15==0) {
				System.out.println("ThreeFive");
			}else if(i%3==0) {
				System.out.println("Three");
			}else if(i%5==0) {
				System.out.println("Five");
			}else {
				System.out.println(i);
			}
		}

	}

}
