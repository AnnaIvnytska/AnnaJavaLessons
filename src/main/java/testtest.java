/**
 * Created by ivnytska on 11-Apr-16.
 */
public class TestTest {
    String name;

    public TestTest(String personName) {
        this.name = personName;
    }

    public String greet(String yourName) {
        String a = String.format("Hi %s, my name is %s", name, yourName);
        return a;
    }

    public String SongDecoder (String song)
    {
        // Your code is here...
        String newS = song.replace("WUB", " ");
        String newNew = newS.trim();
        return newNew;

    }

    public static void main(String[] args){
        TestTest testTest = new TestTest("gggg");
        testTest.greet("dfcb");
        testTest.SongDecoder("RWUBWUBWUBLWUB");
    }


}