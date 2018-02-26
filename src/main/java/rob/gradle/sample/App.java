package rob.gradle.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author rob
 */
public class App
{
  public static void main(String[] args)
  {
    new App(new AnnotationConfigApplicationContext());
  }

  private ApplicationContext context;

  private App(ApplicationContext context)
  {
    this.context = context;
    System.out.println("Running.");
  }
}
