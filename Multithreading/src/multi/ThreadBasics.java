package multi;
//two ways of creating thread 1.extending a thread class 2.implementing a runnable interface

class Task1 extends Thread{ //first way
	public void run() { //SIGNATURE
		System.out.println("Task1 Started");
		for(int i=101;i<=199;i+=10)
			System.out.print(i+" ");
		
		Thread.yield(); //just a request to giveup CPU
		
		System.out.println("\nTask1 Done ");
	}
}

class Task2 implements Runnable{ //second way

	@Override
	public void run() {
		System.out.println("Task2 Started");
		for(int i=201;i<=299;i+=10)
			System.out.print(i+" ");
		
		System.out.println("\nTask2 Done ");			
	}
	
}

public class ThreadBasics {

	public static void main(String[] args) throws InterruptedException {
		//Task1
		System.out.println("Task1 kicked");
		Task1 task1=new Task1();
		task1.setPriority(2);
		//priority request for thread //just a request it is not sure that always gets the highest priority
		//max priority is 10 and ranges upto 1 which is the min priority
		task1.start(); //to run parallely along other tasks use start()
		//task1.run();//this doesn't run along like start()
		Thread.sleep(1000); //sleeps for mentioned milliseconds.
		
		
		//Task2
		System.out.println("Task2 kicked");		
		Task2 task2=new Task2();
		//for runnable interface after creating the above instance you need to create a additional thread
		Thread task2Thread=new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		//wait or task1 to complete
		//join() method to wait for that specific thread to complete execution.
		task1.join(); //task3 starts only after completion of task1 
		task2Thread.join(); ////task3 starts only after completion of task2
		
		//Task3
		System.out.println("Task3 kicked");
		for(int i=301;i<=399;i+=10)
			System.out.print(i+" ");
		System.out.println("\nTask3 Done ");
		
		System.out.println("\nMain Done");
	}

}
