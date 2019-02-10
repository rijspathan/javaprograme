package com;
class MyThread extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
	System.out.println(Thread.currentThread().getName()+" printing "+i);
				try {
					Thread.sleep(1000);
					} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println(Thread.currentThread().getName());
		MyThread t1=new MyThread();
		t1.setName("John");
		MyThread t2=new MyThread();
		t2.setName("Smith");
//Thread class have defined three final static variable
//MAX_PRIORITY=10  MIN_PRIORITY=1 and NORM_PRIORITY=5
	t1.setPriority(Thread.MIN_PRIORITY+1);
	System.out.println("priority of t1 :"+t1.getPriority());
	t1.start();
		//the joined thread will execute till the end of its task
		//it does not allow other thread to execute in between
	t1.join();
	t2.start();
System.out.println(Thread.MIN_PRIORITY+" "+Thread.MAX_PRIORITY);
}
}
