package cn.uncode.schedule.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MoMeak
 */
public class SimpeTestNode_2 {

  public static void main(String[] args) throws InterruptedException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

    Thread.sleep(30 * 1000);

    context.stop();
    context.close();
    
    System.exit(0);
  }

}
