
										Concurrent Collections Part-2 ||Diff B/WTraditional&Concurrent
									 ====================================================================

 
 Difference Between Traditional And Concurrent Collections 


 1. Concurrent Collections are Always Thread Safe.
 
 2. When compared with Traditional Thread Sage Collections Performance is more because of different Locking Mechanism.
 
 3. While One Thread interactiing Collection the Other Threads are allowed to Modify Collection in Safe Manner.
 
 
 Hence Concurrent Collections Never threw ConcurrentModificationException.
 
	The important Concurrent Classes are.
	
	1. ConcurrentHashMap.
	2. CopyOnWriteArrayList
	3. CopyOnWriteArraySet