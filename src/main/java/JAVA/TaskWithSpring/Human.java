package JAVA.TaskWithSpring;

/**
 * Created by ivnytska on 04-Apr-16.
 */
public class Human {
    public String name;

    private static Human human = null;
    private Human() {
        // Exists only to defeat instantiation.
    }
    public static Human getHuman() {
        if(human == null) {
            human = new Human();
        }
        return human;
    }

    protected static void demoMethod( ) {
        System.out.println("I am a human");
    }
}
