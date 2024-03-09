
										Concurrent Collections Part-4 || ConcurrentHashMap Details
									=================================================================
---------------------
  ConcurrentHashMap									
---------------------

 > Underlaying Data Structure is Hashtable.

 > ConcurrentHashMap allows Concurrent Read and Thread safe Update Operations.

 > To Perform Read Operation Thread won't require any Lock. But to perform Update operation Thread requires Lock but it is 
   the Lock of only a Particular part of Map (Segament level or Bucket Level Lock) initead of total lock .

 > Instead of whole Map Concurrent Update achieved by intrenally dividing Map into Smaller Portion which is defined by 
   Concurrency Level.
   
 > The Default Concurrency Leevl is 16.
 
 > That is ConcurrentHashMap allows simultaneous Read Operatio and simultaneously 16 Write at a time (update) Operations.
 
 > null is Not allowed for Both Keys adn values.
 
 > while one Thread iterating the other Thread can perform update Operations and ConcurrentHashMap never throw 
   ConcurrentModificationException.
 
 ----------------  
  Constructors:
 ----------------

  1. ConcurrentHashMap m = new ConcurrentHashMap();
		
	 - Creates an Empty ConcurrentHashMap with Default Initial Capacity 16 and Default Fill Ratio 0.75 and Default 
	   Concurrency level 16.

  2. ConcurrentHashMap m = new ConcurrentHashMap(intinitialCapacity);

  3. ConcurrentHashMap m = new ConcurrentHashMap(intinitialCapacity, float fillRatio);
  
  4. ConcurrentHashMap m = new ConcurrentHashMap(intinitialCapacity, float fillRatio, int concurrencyLevel);
  
  5. ConcurrentHashMap m = new ConcurrentHashMap(Map m);
  
  
			  t1 t2  t16
			  |  |   |
			  |	 |   |	
			|	      |
			|---------|
		  16|         |
			|---------|
		  15|         |						  t1 t2  tn 	
			|---------|						  |  |   |
		  14|         |						  |	 |   |
			|---------|						|---------|         |---------|
          13|         |                     |         |         |         |
            |---------|                     |---------|         |---------|
          12|         |                     |         |         |         |
            |---------|                     |---------|         |---------|
          11|         |                     |         |         |         |
            |---------|                     |---------|         |---------|-->t1
		  10|         |                     |         |         |         |
            |---------|                     |---------|         |---------|
           9|         |                     |         |         |         |
            |---------|                     |---------|         |---------|
           8|         |                     |         |         |         |
            |---------|                     |---------|         |---------|
           7|         |                     |         |         |         |
			|---------|                     |---------|         |---------|
           6|         |                     |         |         |         |
            |---------|                     ----------          ----------
           5|         |						HashMap				Hashtable	
            |---------|
           4|         |						Not ThreadSafe 		ThreadSafe
            |---------|
		   3|         |
            |---------|
           2|       <-|--// It is called Segament level or Bucket Level  
            |---------|
           1|         | // default intinitialCapacity is 16 
            |---------|	// and concurrensy level 16, or 8 ..
           0|         |
			----------
		 ConcurrentHashMap	