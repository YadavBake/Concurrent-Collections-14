
											Concurrent Collections Part-12||CopyOnWriteArrayList Program-1
										=====================================================================	
										

 import java.util.cocurrent.CopyOnWriteArrayList;
 import java.util.ArrayList;
 class Test
 {
		public static void main(String args[])
		{
			ArrayList al = new ArrayList()
			l.add("A");
			ladd("B");
			
			CopyOnWriteArrayList l1 = new CopyOnWriteArrayList():
			l1.addIfAbsent("A");
			l1.addIfAbsent("C");
			l1.addAll(al);
			
			ArrayList l2 = new ArrayList();
			l2.add("A");
			l2.add("E");
			l1.addAllAbsent(l2);
			System.out.println(l1); // [A,C,A,B,E]
		}
 }
			