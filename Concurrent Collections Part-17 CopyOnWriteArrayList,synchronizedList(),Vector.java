
							Concurrent Collections Part-17||CopyOnWriteArrayList,synchronizedList(),Vector
						 ===================================================================================

						

-------------------------------------------------------------------------------------------------------------------------
|	CopyOnWriteArrayList 				|		synchronizedList()					|			,Vector		            |
-------------------------------------------------------------------------------------------------------------------------
|									   |										  |										|
|1. We will get Thread Safety because  |1. We will get Thread Safety because at a |1. We will get Thread Safety because |
|   Every Update operation will 	   |	time List can be accessed by only One |	  at a time only one Thread is      |
|	 performed on separate cloned Copy.|	Thread at a time.					  |	  allowed to access Vector object.  |
|--------------------------------------|------------------------------------------|-------------------------------------|
|2. At a time multiple Threads are	   |2. At a time only one Thread is allowed to|2. At a time only one Thread is      |
|	 allowed to access/operate on 	   |	perform any operation on list Object  |	  allowed to operate on Vector      |
|	 CopyOnWriteArrayList			   |										  |	  Object.                           |
|--------------------------------------|------------------------------------------|-------------------------------------|
|3. While One Thread iterating List	   |3. While one Thread iterating the other   |3. While one Thread iterating the   	|	 
|	 Object, the other Threads are 	   |   thread are not allowed to modify List  |	  other thread are not allowed to   |
|	allowed to modify and we won't get |   Otherwise we will get                  |	  modify List Otherwise we will get |
|	ConcurrentModificationException	   |   ConcurrentModificationException        |   ConcurrentModificationException   |
|--------------------------------------|------------------------------------------|-------------------------------------|
|4. Iterator Is FailtSafe and won't    |4. Iterator Is Failt-Fast and it will     |4. Iterator Is Failt-Fast and it will|
|   raise                              |   raise                                  |   raise                             |
|	 ConcurrentModificationException   |   ConcurrentModificationException        |	  ConcurrentModificationException   |
|--------------------------------------|------------------------------------------|-------------------------------------|
|5. Iterator can't perform Remove	   |5. Iterator Can perform Remove operation. |5. Iterator can perform remove       |
|	 Opration otherwise we will get    |										  |	  operation.                        |
|	 UnsupportedOperationException     |                                          |                                     |
|--------------------------------------|------------------------------------------|-------------------------------------|
|6. Introduced in 1.5 version 		   |6. Introduced in 1.2 version 			  |6. Introduced in 1.0 version         |
-------------------------------------------------------------------------------------------------------------------------