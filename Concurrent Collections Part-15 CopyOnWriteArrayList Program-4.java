
									Concurrent Collections Part-15||CopyOnWriteArrayList Program-4
								====================================================================


    import java.util.cocurrent.CopyOnWriteArrayList;
    import java.util.Iterator;
	class Test 
	{
		
		public static void main(String args[])
		{
		 
		 CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		 l.add("A");
		 l.add("B");
		 l.add("C");
		 Iterator itr = l.iterator();
		 l.add("D");
		 while (itr.hasNext())
		 {
			 String s = (String)itr.next();
			 System.out.println(s);
		 }
		}
	}
	
 Reason:

	> Every Update Operation will be performed on Separate copy Hence After getting iterator if we are trying to 
	  perform any modification to the List it won't be reflected to the iterator.
	  
	> In the above program if we replace CopyOnWriteArrayList with ArrayList then we will get RuntimeException: 
	  ConcurrentModificationException
		 							