package com;
class Worker1 implements Runnable
{
@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"putting job :"+i+1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
class Worker2 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<4;i++)
		{
			System.out.println(Thread.currentThread().getName()+"putting job :"+i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
//creating runnable object		
		Worker1 w1=new Worker1();
//for getting thread class ability passing runnable object to Thread
	Thread t1=new Thread(w1,"Harish");

		Worker2 w2=new Worker2();
		Thread t2=new Thread(w2,"Poonam");
		t1.start();
		t2.start();
		
	}

}
