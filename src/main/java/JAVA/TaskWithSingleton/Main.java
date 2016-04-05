package JAVA.TaskWithSingleton;

/**
 * Created by ivnytska on 04-Apr-16.
 */
public class Main {
    public static void main(String[] args) {
        Human human = Human.getHuman();
        human.demoMethod();


        Human human1 = Human.getHuman();
        human1.demoMethod();

    }
}