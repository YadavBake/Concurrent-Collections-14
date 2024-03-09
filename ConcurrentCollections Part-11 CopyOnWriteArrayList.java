
											ConcurrentCollections Part-11||CopyOnWriteArrayList
										==========================================================

 --------------
  Constructors 
----------------

	1. CopyOnWriteArrayList = new CopyOnWriteArrayList();
	2. CopyOnWriteArrayList = new CopyOnWriteArrayList(Collection c);	
	3. CopyOnWriteArrayList = new CopyOnWriteArrayList(Object[] a);
	

 1. boolean addIfAbsent(Object o): The Element will be added if and only if List doesn't contain this Element.

	 CopyOnWriteArrayList = new CopyOnWriteArrayList();
	 l.add("A");
	 l.add("A");
	 l.addIfAbsent("B");
	 l.addIfAbsent("B");
	 System.out.println(l);//[A,A,B]
	 
	 
  2. int addAllAbsent(Collection c): The elements of collection will be added to the List if elements are absent and 
	 returns Number of Elements Added.
	 
	 ArrayList l = new ArrayList();
	 l.add("A");
	 l.add("B");
	 
	 CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
	 l1.add("A");
	 l1.add("C");
	 System.out.println(l1); //[A,C]
	 l1.addAll(l);
	 System.out.println(l1); //[A,C,A,B]
	 
	 ArrayList l2 = new ArrayList();
	 l2.add("A");
	 l2.add("D");
	 l1.addAllAbsent(l2);
	 System.out.println(l1); //[A,C,A,B,D]