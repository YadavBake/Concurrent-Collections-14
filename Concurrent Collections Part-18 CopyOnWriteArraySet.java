				
											Concurrent Collections Part-18||CopyOnWriteArraySet
										=========================================================

 ============================
  CopyOnWriteArraySet (C) 
 ============================


			Collection(I)
			     ^
				 |
			   Set(I)
				 ^
				 |
			CopyOnWriteArraySet(C)											
			
			
  > It is a Thread Safe version of Set.

  > Iternally implement by CopyOnWriteArrayList

  > Insertion order is preserved.

  > Duplicate Object are not allowed.

  > Multiple Threads can able to perform read operation simultaneously but for Every update operation a separate cloned
	 copy will be created.
	 
  > As for Every Update operation a separate cloned copy will be created which is costly Hence if multiple update 
	operation are rquired then it is not recommneded to use CopyOnWriteArraySet.
	

  > While one thread  iterating set the other Threads are allowed to modify set and we won't get 
    ConcurrentModificationException.
	
  > Iterator  of CopyOnWriteArraySet can perform only Read operation and won't perform remove operation. otherwise 
	we will get Runtime Exception UnsupportedOperationException.