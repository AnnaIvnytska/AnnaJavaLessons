package Chapter4.two;

/**
 * Created by ivnytska on 2/2/2016.
 */
public class Engine {
    final private int volume;
    final private String type;
    private boolean isTurnedOn;

    public Engine(int volume, String type, boolean isTurnedOn) {
        this.volume = volume;
        this.type = type;
        this.isTurnedOn = isTurnedOn;
//        isTurnedOn = false;
    }

    public int getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Мотор включен!");
    }

    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Мотор выключен!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Volume= ").append(volume);
        sb.append(", type='").append(type).append('\'');
        sb.append(", isTurnedOn=").append(isTurnedOn);
        return sb.toString();
    }
}
