class OutOfMemory{
	long id;
	double did;
	double salary;
	long uid;

	/*
	WAP to show the difference between OutOfMemoryError and StackOverflowError
	*/
	public static void main(String[] args){
		OutOfMemory arr[] = new OutOfMemory[1000000000];
		System.out.println("Working");

		try {
			OutOfMemory arr2[] = new OutOfMemory[1000000000];
		} catch (OutOfMemoryError e) {
			System.out.println(e);
		}
	}
}