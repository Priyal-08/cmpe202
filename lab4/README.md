1. CRC Cards:

	Classes:
	
	1. Customer (CustomerCRCCard Image)
	
	2. Table (TableCRCCard Image)
	
	3. WaitListManager (WaitListManagerCRCCard Image)
	
	4. TableManager (TableManagerCRCCard Image)

	
2. Design Patterns Used:

	1. State Pattern: I have used state pattern for table state. The state of table can be "Booked" or "Available".
	
	2. Observer Pattern: In this TableManager notifies the WaitListManager(observer), if the table state changes. 
