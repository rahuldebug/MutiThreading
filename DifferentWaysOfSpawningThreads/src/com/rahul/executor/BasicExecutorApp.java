package com.rahul.executor;

public class BasicExecutorApp {

	public static void main(String[] args) {
		DumbExecutor exec = new DumbExecutor();
		Task task = new Task();
		exec.execute(task);
        System.out.println("app ran");
        
        
        
        /*any number of threads can be created using this , so this is not very efficient 
         * , because creating or deleting thread is costly, so Executor framework has to be used  */
	}

}
