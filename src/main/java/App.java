import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("bean1 == bean2 is " + (bean == bean2));

        Cat cat = (Cat) applicationContext.getBean("getCat");
        Cat cat2 = (Cat) applicationContext.getBean("getCat");
        System.out.println("cat1 == cat2 is " + (cat == cat2));
    }
}