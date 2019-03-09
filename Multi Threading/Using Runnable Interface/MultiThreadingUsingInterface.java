package com.training.class2;

public class Thread1 implements Runnable {
	
	private Thread t;
	private String threadName;
	

	public Thread1(String name) {
		// TODO Auto-generated constructor stub
		threadName = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " +  threadName );
		for (int i = 0; i < 10; i++) {
			System.out.println("threadname = "+ threadName + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void startMyThread() {
		System.out.println("Starting " +  threadName );
		t = new Thread(this, threadName);
		
		// this keyword refers to this class a runnable class
		t.start();
	}

}

