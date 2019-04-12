import classic.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        
        //Singleton mySingleton = new Singleton.getInstance();

        Singleton mySingleton = new Singleton();
        mySingleton.getInstance();
        
    }
}