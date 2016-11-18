import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class Game {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("大人你想给哲♂学家们几碗3两牛肉面：");
        Scanner num=new Scanner(System.in);
        int i=num.nextInt();
        Noodle noodle=new Noodle(i);

        Chopstick chopstick1=new Chopstick();
        Chopstick chopstick2=new Chopstick();
        Chopstick chopstick3=new Chopstick();
        Chopstick chopstick4=new Chopstick();
        Chopstick chopstick5=new Chopstick();

        Philosopher philosopher1=new Philosopher(chopstick1,chopstick5,noodle);  philosopher1.setName("哲学家1->");
        Philosopher philosopher2=new Philosopher(chopstick2,chopstick1,noodle);  philosopher2.setName("哲学家2->");
        Philosopher philosopher3=new Philosopher(chopstick3,chopstick2,noodle);  philosopher3.setName("哲学家3->");
        Philosopher philosopher4=new Philosopher(chopstick4,chopstick3,noodle);  philosopher4.setName("哲学家4->");
        Philosopher philosopher5=new Philosopher(chopstick5,chopstick4,noodle);  philosopher5.setName("哲学家5->");

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
    }
}
