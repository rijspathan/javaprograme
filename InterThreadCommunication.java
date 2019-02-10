package com;
//shared Resource
class Buffer
{
	int data;
	boolean available=true;//for empty buffer
	public synchronized void get() throws InterruptedException
	{
		System.out.println("Printer started..!!");
		if(available==true)
		{
			System.out.println("Printer goes into waiting state");
			wait();
		}
		System.out.println("Printer printing :"+data);
		available=true;
		notify();
	}
	
	public synchronized void put(int data) throws InterruptedException
	{
		System.out.println("Document started..!!");
		
		if(available==false)
		{
			System.out.println("Document goes into waiting..!!");
			wait();
		}
		System.out.println("document putting :"+data);
		this.data=data;
		available=false;
		notify();
		}
}
class Printer extends Thread
{
	Buffer b;
	public Printer(Buffer b) {this.b=b;}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				b.get();
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		}
}

class Document extends Thread
{
	Buffer b;
	public Document(Buffer b) {this.b=b;}
	@Override
		public void run() {
			for(int i=1;i<=5;i++)
			{
				try {
					b.put(i*10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}}
		}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
	Buffer b=new Buffer();
	Document d=new Document(b);
	Printer p=new Printer(b);
	d.start();
	p.start();
	}
}
