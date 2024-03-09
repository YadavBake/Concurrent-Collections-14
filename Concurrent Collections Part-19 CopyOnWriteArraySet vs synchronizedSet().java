
									Concurrent Collections Part-19||CopyOnWriteArraySet vs synchronizedSet()
								 =============================================================================	



	---------------------------------------------------------------------------------------------------------------
	|			CopyOnWriteArraySet										synchronizedSet()					       |
	----------------------------------------------------------------------------------------------------------------
	|											  |																   |	
    |1. It is Thread safe because Every update    |1. It is thread safe because at a time only one thread can      |
    |	operation will be performed on separete   |	 perform operation.	                                           |
    |	cloned copy.                              |                                                                |
    |---------------------------------------------|----------------------------------------------------------------|
    |2. While one Thread iterating set the other  |2. While one Thread iterating, the other thread are not allowed |
    |	Thread are allowed to modify and we won't |	 to modify set otherwise we will get 	                       |
    |	get ConcurrentModificationException		  |	 ConcurrentModificationException			                   |
    |---------------------------------------------|----------------------------------------------------------------|
    |3. Iterator is fail Safe 					  |3. Iterator is fail fast.                                       |
    |---------------------------------------------|----------------------------------------------------------------|
    |4. Iterator can perform only read operation  |4. Iterator can perform Both Read and Remove operation.         |
    |	and can't perform remove operation        |                                                                |
    |	otherwise we will get Runtime Exception   |                                                                |
    |	saying UnsupportedOperationException      |                                                                |
    |---------------------------------------------|----------------------------------------------------------------|
    |5. Introdced in 1.5 version 				  |5. Introdced in 1.2 version. 	                               |
    ----------------------------------------------------------------------------------------------------------------