				
								Concurrent Collections Part-9||CopyOnWriteArrayList Properties Part-1
							  =========================================================================

 ============================
  CopyOnWriteArrayList (C) 
 ============================


			Collection(I)
			     ^
				 |
			   List(I)
				 ^
				 |
			CopyOnWriteArrayList(C)

 -> It is Thread safe version of ArrayList as the name indicates CopyOnWriteArrayList creates a Cloned copy of underlaying 
	ArrayList for evey Update operation at Certain point Both will synchronized automatically which is taken care by 
	JVM internally.
	
 -> As Update operation will be peformed on cloned copy there is no effect for the Threads which performs Read Operation.

 -> It is costly to use because for every Update Operation a cloned copy will be created. Hnece CopyOnWriteArrayList is 
    the Best choice if several read operations and less numer of write operations are required to perform.
	
 -> Insertion order is preserved.
 
 -> Duplicate object are allowed.
 
 -> Heterogeneous objects are allowed.
 
 -> null Insertion is possible.
 
 -> It implements Serializable, Clonable and RandomAccess interfaces.
 
 -> while one thread iterating CopyOnWriteArrayList, the other Threads are allowed to modify and we won't get 
	ConcurrentModificationException that s iterator is fail safe.
	
 -> Iterator of ArrayList can perform remove operation but Iterator of CopyOnWriteArrayList can't peforme remove operation
    Otherwise we will get Runtime Exception saying UnsupportedOperationException.
	
	
	