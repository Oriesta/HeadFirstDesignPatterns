package classic;

// NOTE: This is not thread safe!

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	//private Singleton() {}
 
	public static Singleton getInstance() {
		System.out.print("Singleton.getInstance()");
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
