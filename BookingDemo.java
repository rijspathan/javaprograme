package com;
class BookMyShow implements Runnable
{
	static int available=3;
	int req;
	public BookMyShow() {	}
	public BookMyShow(int req) {
		this.req=req;
	}
	@Override
	public void run() {
		synchronized(this){
		if(req<=available)
		{
			System.out.println(Thread.currentThread().getName() +" Booked successfully");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			available=available-req;
		}
		else
		{
			System.out.println("Sorry "+Thread.currentThread().getName()
					+" no more tickets.");
		}}}}

public class BookingDemo {

	public static void main(String[] args) {
		BookMyShow b=new BookMyShow(2);
		
		Thread t1=new Thread(b,"John");
		Thread t2=new Thread(b,"Smith");
		Thread t3=new Thread(b,"Jenna");
		t1.start();t2.start();t3.start();	}}
