
							Concurrent Collections Part-16||ArrayList vs CopyOnWriteArrayList
						======================================================================

						
						
		-------------------------------------------------------------------------------------------  	
		|	ArrayList											CopyOnWriteArrayList			   |	
		-------------------------------------------------------------------------------------------
		|										  |												   | 
        |1. It is not Thread Safe.			      |1. It is not Thread Safe because Every Update   |
        |										  |	operation will be performed on separate        |
        |										  |	cloned copy.                                   |
        |-----------------------------------------|------------------------------------------------|
        |2. While one Thrad iterating List object |2. While one Thrad iterating List object        |
        |   the other Threads are not allowed to  |   the other Threads are  allowed to            |
        |	modify List otherwise we will get     |	modify List in safe manner we won't get        |
        |	ConcurrentModificationException       |	ConcurrentModificationException                |
        |-----------------------------------------|------------------------------------------------|
        |3. Iterator is Fail-Fast 				  |3. Iterator Is fail-safe.                       |
        |-----------------------------------------|------------------------------------------------|
        |5. Iterator of ArrayList can peform      |4. Iterator of CopyOnWriteArrayList can't peform| 
        |	remove operation                      |	remove operation otherwise we will get Runtime |
        |										  |	Exception UnsupportedOperationException        |
		|-----------------------------------------|------------------------------------------------|
        |5. Introduce in 1.2 version 			  |5. Introduce in 1.5 version.                    |
		--------------------------------------------------------------------------------------------			