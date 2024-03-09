
										Concurrent Collections Part-13||CopyOnWriteArrayList Program-2
									====================================================================


		
	import java.util.cocurrent.CopyOnWriteArrayList;
    import java.util.ArrayList;
	class MyThread extends Thread 
	{
		
		static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		
		public void run()
		{
			try 
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			System.out.println("Child Thrad Updating List");
			l.add("C");
		}
			
			
		public static void main(String args[]) throws InterruptedException
		{
			l.add("A");
			l.add("B");
			MyThread t = new MyThread();
			t.start();
			Iterator itr = l.iterator();
			while(itr.hasNext())
			{
				String s1 = (String)itr.next();
				System.out.println("Main thread Iterating List and current Object is : " +s1);
				Thread.sleep(3000);
			}
			System.out.println(l);
		}
	}
	
	Main thread Iterating List and current Object is : A 
	Child Thrad Updating List
	Main thread Iterating List and current Object is : B
	[A,B,C]

  > In the above example while Main Thread iterating List child Thread is allowed to modify and won't get any 
    ConcurrentModificationException.
   
  > IF we replace CopyOnWriteArrayList with ArrayList then we will get ConcurrentModificationException.

  > Iterator of CopyOnWriteArrayList can't perform rmeove operation. otherwise we will get Runtime Exception 
	UnsupportedOperationException.