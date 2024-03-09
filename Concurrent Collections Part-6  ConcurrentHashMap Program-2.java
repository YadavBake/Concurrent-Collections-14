							
									Concurrent Collections Part-6 || ConcurrentHashMap Program-2
								 ================================================================	
								 
 ConcurrentHashMap Program-2
 
	import java.util.concurrent.ConcurrentHashMap;
	import java.util.*;
	class MyThread extends Thread 
	{
		// static HashMap m new HashMap();// java.util.ConcurrentModificationException
		
		static ConcurrentHashMap m = new ConcurrentHashMap();
		
		public void run()
		{
			try{
				
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			System.out.println("Child Thread updating Map");
			m.put(103,"C");
		}
		public static void main(String args[]) throws InterruptedException
		{
			m.put(101,"A");
			m.put(102,"B");
			MyThread t = new MyThread();
			t.start();
			Set s = m.keySet();
			Iterator itr = s.iterator();
			while (itr.hasNext())
			{
				Integer I1 = (Integer)itr.next();
				System.out.print("Main Trhead iterating and Current Entry is : " +I1+"........."+m.get(I1));
				Thread.sleep(3000);
			}
			System.out.println(m);
		}
	}
	
	output:
		
		Main Thrad iterating and Current Entry is : 102 ......B
		Child Thread updating Map
		Main Thread iterating and Current Entry is : 101 ......A
		{103 =c, 102=B,101=A}
		
	- Update and we won't get any ConcurrentModificationException.
	
	- If we replace ConcurrentHashMap with HashMap then we will get ConcurrentModificationException.
								 