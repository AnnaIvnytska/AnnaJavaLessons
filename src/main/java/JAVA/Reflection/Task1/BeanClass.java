package JAVA.Reflection.Task1;

/**
 * Created by ivnytska on 2/29/2016.
 */

/*Создать аннотацию @Public, с помощью которой можно аннотировать только поля. Создать bean класс, в котором будут поля
во всеми возможными модификаторами доступа, аннотированные @Public и не аннотированные.  Создать утилитный класс с методом
getPublicValue, на вход которого подается проинициализированный любыми не пустыми значениями bean класс и название поля,
и на выходе получаем значение поля, если поле помечено аннотацией @Public, и получаем исключение IlegalAccessException в
обратном случае. В методе main нужно создать bean, проинициализировать и вывести в консоль значение объектов или исключения
для всех полей этого класса с помощью getPublicValue метода.*/

public class BeanClass {
    @AnnotationClass.Public
    public String publicStringAn;
    public String publicString;

    @AnnotationClass.Public
    private String privateStringAn;
    private String privateString;

    @AnnotationClass.Public
    protected String protectedStringAn;
    protected String protectedString;

    @AnnotationClass.Public
    String defoltStringAn;
    String defoltString;

    public BeanClass(String publicStringAn, String publicString, String privateStringAn, String privateString, String protectedStringAn,
                     String protectedString, String defoltStringAn, String defoltString) {
        this.publicStringAn = publicStringAn;
        this.publicString = publicString;
        this.privateStringAn = privateStringAn;
        this.privateString = privateString;
        this.protectedStringAn = protectedStringAn;
        this.protectedString = protectedString;
        this.defoltStringAn = defoltStringAn;
        this.defoltString = defoltString;


    }
}
