import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld myBean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(myBean.getMessage());
        System.out.println(bean==myBean);

        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        Cat catBean2 = applicationContext.getBean("catBean", Cat.class);

        System.out.println(catBean==catBean2);
    }
}