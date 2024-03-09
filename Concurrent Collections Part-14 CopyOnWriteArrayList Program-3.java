
									Concurrent Collections Part-14||CopyOnWriteArrayList Program-3
								======================================================================


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
		 l.add("D");
		 System.out.println(l);// [A,B,C,D]
		 Iterator itr = l.iterator();
		 while(itr.hasNext())
		 {
			 String s = (String)itr.next();
			 if(s.equals("D"));
			 itr.remove();
		 }
		 System.out.println(l);// RE: UnsupportedOperationException
		}
	}
	
	> If we replace CopyOnWriteArrayList with ArrayList we won't get any UnsupportedOperationException
	
	> In this Case the output is 
	
		[A,B,C,D]
		[A,B,C]