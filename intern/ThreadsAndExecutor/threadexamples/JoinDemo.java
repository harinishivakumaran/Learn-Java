package threadexamples;

import java.util.Scanner;

public class JoinDemo extends Thread{
	
	static int n,sum=0;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Sum of first 'N' numbers");
		System.out.println("enter a value");
		Scanner sc=new Scanner(System.in);
		JoinDemo.n=sc.nextInt();
		JoinDemo jd=new JoinDemo();
		jd.start();
		try {
			jd.join(); // after completion of join method only the compiler goes to next 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of first "+JoinDemo.n+ " Numbers is "+JoinDemo.sum);
		long end=System.currentTimeMillis();
		System.out.println("The total time taken is "+(end-start)/1000+" Seconds.");
		sc.close();
	}
	public void run() {
		for(int i=1;i<=JoinDemo.n;i++) {
			JoinDemo.sum+=i;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
