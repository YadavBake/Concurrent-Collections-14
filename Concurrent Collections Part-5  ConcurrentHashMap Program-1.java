
										Concurrent Collections Part-5 || ConcurrentHashMap Program-1
									 =================================================================


  ConcurrentHashMap Program-1 

		import java.util.concurrent.ConcurrentHashMap;
		class Test
		{
			public static void main(String args[])
			{
				ConcurrentHashMap m = new ConcurrentHashMap();
				m.put(101, "A");
				m.put(102, "B");
				m.putIfAbsent(103,"C");
				m.putIfAbsent(101,"D");
				m.remove(101,"D");
				m.replace(102,"B","E");
				System.out.println(m); // {103=C, 102=E,101=A}
			}
		}
				
		