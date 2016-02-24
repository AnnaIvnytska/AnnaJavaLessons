package JAVA.Serialization;

import java.io.*;

/**
 * Created by ivnytska on 2/23/2016.
 */

/*Создать свой bean класс Account, и переопределить методы equals и hashcode в нем. Класс должен содержать следующие поля:
id: Long
name: String
role: String
Класс должен быть сериализируемым и в нем должна быть организована кастомная сериализация, которая представляет собой
конкатенацию значений каждого поля в строку, и соответственно обратная операция для десериализации.

В методе main нужно провести сериализацию данного объекта и сохранить результат в файл с расширением .dat, далее
прочитать содержимое файла и провести десериализацию объекта и вывести на экран хеш коды оригинального и клонированного
объектов и результат сравнения их через == и equals.
*/

public class Account implements Serializable {
    long id = 123;
    String name = "Anna";
    String role = "Role";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        String result = "";
        result = getId() + "," + getName() + "," + getRole();
        out.writeObject(result);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        String[] s = in.readObject().toString().split(",");
        setId(Long.parseLong(s[0]));
        setName(s[1]);
        setRole(s[2]);
    }
}