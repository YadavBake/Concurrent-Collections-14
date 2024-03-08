
											Concurrent Collections Part-1 || Need of Concurrent Collections
										=====================================================================


  Need of Cocurrent Collections 
 -------------------------------
 
	1. Traditional Collection Object(Like ArrayList, HashMap ect) can be accessed by Multiple Threads simultaneously and 
	   there May be a chanec of Data inconsistency problems and Hence there are Not Thread Safe.
	
	2. Already Existnig Thread safe Collections (Vector, Hashtable, SynchronizedList(),SynchronizedSet(),
	   SynchronizedMap() performance wise not upto the mark.
	   
	3. Because of Every Operation Even for Read Operation Also total Collection will be loaded by only one Thread at a time 
	   and it increase waiting Time of thread.
	   
	   
		import java.util.ArrayList;
		import java.util.iteratorl
		class Test 
		{
			public static void main(String args[])
			{
				ArrayList al = new ArrayList();
				al.add("A");
				al.add("B");
				al.add("C");
				Iterator itr = al.iterator();
				while(itr.hashNext())
				{
					String s = (String)itr.next();
					System.out.println(s);
					//al.add("D");// RE java.util.ConcurrentModificationException
				}
				
			}
		}
		
	1. Another Big problem with Traditional Collections is while one Thread Iterating Colleciton, the other Threads are 
	   not allowed ot Modify Collection Object simultaneously if we are trying to modify then we will get
	   ConcurrentModificationException.
	   
	2. Hnce these Traditional collection objects are nto suitable for Scalble Multi Threaded Applications.
	
	3. To Overcome these problems sun people introduced Concurrent COllections in 1.5v version.
	
	
	   
 

 
	import java.util.*;
	class MyThread extends Thread 
	{
		static ArrayList al = new ArrayList();
		public void run()
		{
			try{
					Thread.sleep(2000);
			}catch(InterruptedException  e){}
			    System.out.println("Child Thread Updatig List");
				l.add("D");	
		}
		public static void main(String args[])throws InterruptedException
		{
			l.add("A");
			l.add("B");
			l.add("C");
			MyThread t = new MyThread();
			t.start();
			Iterator itr = l.iterator();
			while (itr.hashNext())
			{
				String s1 = (String)itr.next();
				System.out.println("Main Thread Iterating List and Current Object is :" +s1);
				Thread.sleep(3000);
			}
			System.out.println(l);
		}
	}
			