
							ConcurrentCollectionsPart-8||ConcurrentHashMap||synchronizedMap()||Hashtable
						 ---------------------------------------------------------------------------------


  Differnce between ConcurrentHashMap||synchronizedMap()||Hashtable.

   ----------------------------------------------------------------------------------------------------------------------	
   |		ConcurrentHashMap			|		synchronizedMap()			|					Hashtable				|
   ----------------------------------------------------------------------------------------------------------------------
   |									|									|											|
   |1. We will get Thread Safety with	| 1. We will get Thread Safety by   |  1. We will get Thread safety by locking  |
   |   out locking total Map Object		|	locking Whole Map Object.		|    whole Map Object.                      |
   |   just with BucketLevel lock.	    |                                   |                                           |
   |------------------------------------|-----------------------------------|-------------------------------------------|
   |2. At a time Multiple Threads are   | 2. At a time only one Thread is	|  2. At a time only one Thread is          |
   |   allowed to operate on Map 		|	allowed to perform any          |     allowed to perform any                |
   |   Object in safe Manner.			|	operation one Map Object.       |     operation one Map Object.             |
   |------------------------------------|-----------------------------------|-------------------------------------------|
   |3. Read Operation can be performed  | 3. Every Read and Write operations|   3. Every Read and Write operations      |
   |   without Lock but write operation	|	require Total Map OBject Lock.	|  	 require Total Map OBject Lock.	        |
   |   can be performed woth Bucket     |                                   |                                           |
   |   Level lock.                      |                                   |                                           |
   |------------------------------------|-----------------------------------|-------------------------------------------|
   |4. While One Thread iterating Map   | 4. While One Thread iterating Map |   4. While One Thread iterating Map    	|
   |   Object, The other Threads are 	|	Object, the other Thread are not|  	 Object, the other Thread are not       |
   |   allowed to modify Map and we 	|	allowed to modify Map.otherwise |  	 allowed to modify Map.otherwise        |
   |   get won't  						|	we will get 					|  	 we will get 							|				
   |   ConcurrentModificationException.	|	ConcurrentModificationException.|  	 ConcurrentModificationException.       |
   |------------------------------------|-----------------------------------|-------------------------------------------|
   |5. Iterator of ConcurrentHashMap	| 5. Iterator of synchronizedMap is |	  5. Iterator of synchronizedMap is 	|
   |   is Fail-safe and won't raise		|	and it will raise  	            |   	 and it will raise  	            |
   |   ConcurrentModificationException.	|	ConcurrentModificationException.|  	 ConcurrentModificationException.       |
   |------------------------------------|-----------------------------------|-------------------------------------------|
   |6. null is not allowed for both     | 6. null is  allowed for both		|  6. null is not allowed for both          |
   |   Keys and Values.                 |    Keys and Values.               |      Keys and Values.                     |
   |------------------------------------|-----------------------------------|-------------------------------------------|
   |7. Introduced in 1.5 version		| 7. Introduced in 1.2 version      |   7. Introduced in 1.0 version            |
   ----------------------------------------------------------------------------------------------------------------------
   
   
   
   
   
   
   
   
   
   