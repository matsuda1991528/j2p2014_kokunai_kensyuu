package java_test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 10;
		//int [] a ={1,2,3,4,5,6,7,8,9,10};
		int [] b = new int[len];
		int sum=0;
		for(int i=0;i<10;i++){
			b[i] = i+1;
			sum += b[i];
		}
		
		System.out.println(sum);

	}

}
