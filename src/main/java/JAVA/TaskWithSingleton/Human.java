package JAVA.TaskWithSingleton;

/**
 * Created by ivnytska on 04-Apr-16.
 */
public class Human {
    public String name;

    private static Human human;

    private Human() {
    }

    private static class SingletonHolder {
        private final static Human name = new Human();
    }

    public static Human getHuman() {
        return SingletonHolder.name;
    }

    protected static void demoMethod() {
        System.out.println("I am a human");
    }
}
