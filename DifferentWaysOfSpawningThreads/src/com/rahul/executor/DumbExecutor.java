package com.rahul.executor;

import java.util.concurrent.Executor;

public class DumbExecutor implements Executor {

	@Override
	public void execute(Runnable run) {
      Thread t1= new Thread(run);
      t1.start();
      System.out.println("execute method running ");
      
      
		/*
		 * try { t1.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	}
}
