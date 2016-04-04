package JAVA.TaskWithSpring;

/**
 * Created by ivnytska on 04-Apr-16.
 */
public class Main {
    public static void main(String[] args) {
        Human human = Human.getHuman();
        human.demoMethod();
        human.name = "Bacя";

        Human human1 = Human.getHuman();
        human1.demoMethod();
        human1.name = "Петя";
    }
}