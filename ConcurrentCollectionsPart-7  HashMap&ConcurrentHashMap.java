
									ConcurrentCollectionsPart-7 || HashMap&ConcurrentHashMap
								 =============================================================


 Difference between HashMap and ConcurrentHashMap

		------------------------------------------------------------------------------------------
		|	HashMap						      |					ConcurrentHashMap  				 |
		------------------------------------------------------------------------------------------
		|								      |													 |
		|1. It is Not Thread Safe.			  |  1. It is Thread Safe.		                     |
        |-------------------------------------|--------------------------------------------------|
        |2. Relatively Performance is High	  |  2. Relatively performance is Low because	     |
        |   because Threads are not required  |     some times Threads are required to wait      |
        |   to wait to operate on HashMap	  |	    to operate on ConcurrentHashMap.             |
        |-------------------------------------|--------------------------------------------------|
        |3. While One Thread iterating HashMap|  3. While one Thread  iterating ConcurrentHashMap|
        |	the other Thread are not allowed  |     the other threads are allowed to modify Map  |	
        |   to modify Map objects otherwise   |	    object in safe Manner and it won't throw	 |
        |	we will get Runtiem Exception	  |	    ConcurrentModificationException	             |
        |	saying                            |                                                  |
        |   ConcurrentModificationException   |                                                  |
        |-------------------------------------|--------------------------------------------------|
        |4. null is allowed for Both Keys and |  4. null is not Allowed for Both Key and Values. |
        |	Values 							  |	    otherwise we will get NullPointerException	 |
		|-------------------------------------|--------------------------------------------------|
		|5. Introduced in 1.2 version 		  |  5. Introduced in 1.5 version                    |
		|-------------------------------------|--------------------------------------------------|
		|6. Iterator is Fail-Fast.			  |  6. Iterator is Fail-Safe.						 |
		------------------------------------------------------------------------------------------