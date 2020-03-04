class MyThread extends Thread{  
	MyThread(int i){
	super(i);	
	}
	public void run(){  
		System.out.println("thread "+i+" is running...");  
	}  
	public static void main(String args[]){  
		int i = 1;
		MyThread t1=new MyThread(i);  
		MyThread t2=new MyThread(i);  
		MyThread t3=new MyThread(i);  
		MyThread t4=new MyThread(i);  
		MyThread t5=new MyThread(i);  
		t1.start();  
		t2.start(); 
		t3.start(); 
		t4.start(); 
		t5.start(); 
	}  
}  
