package fibonacci;

import java.math.BigInteger;

public class Fbonacci {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    BigInteger[] fibonacci=null;
	    fibonacci=fibonacci(200);
	    for(int i=0;i<200;i++){
	    System.out.println(fibonacci[i]);
	    }
	}
	//循环
	public static BigInteger[] fibonacci(int length){
		BigInteger[] fibonacci=new BigInteger[length];
	    fibonacci[0]=new BigInteger("1");
	    fibonacci[1]=new BigInteger("1");
	    for(int i=2;i<length;i++)
	    	fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
	    return fibonacci;
	}
	 
}
