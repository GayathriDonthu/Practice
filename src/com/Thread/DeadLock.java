package com.Thread;

public class DeadLock {
	
	public static String s1 = "Gayathri";
	public static String s2 = "Divya";
	
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2(); 
		t1.start();
		t2.start();
		
		
	}



private static class Thread1 extends Thread{
	public void run(){
		synchronized(s1){
			System.out.println("thread 1 holding s1 ");
			try{
				Thread.sleep(10);
			}
			catch(Exception e){}
			System.out.println("thread 1 waiting for s2");
			synchronized(s2){
				System.out.println("thread 1 holding s1 and s2");
			}
		}
	}
}

private static class Thread2 extends Thread{
	public void run(){
		synchronized(s2){
			System.out.println("thread 2 holding s2 ");
			try{
				Thread.sleep(10);
			}
			catch(Exception e){}
			System.out.println("thread 2 waiting for s1");
			synchronized(s1){
				System.out.println("thread 2 holding s1 and s2");
			}
		}
	}
}
}