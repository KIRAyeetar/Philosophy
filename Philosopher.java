/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class Philosopher extends  Thread{
    public  Chopstick chopstick_left;
    public  Chopstick chopstick_right;
    private Noodle noodle;
    public Philosopher(Chopstick chopstick_left, Chopstick chopstick_right,Noodle noodle) {

        this.chopstick_left=chopstick_left;
        this.chopstick_right=chopstick_right;
        this.noodle=noodle;
    }

    public  void useChopstick(Chopstick chopstick_left,Chopstick chopstick_right){
            chopstick_left .beenUsed_right(noodle);
            chopstick_right.beenUsed_left();
          //  System.out.println(Thread.currentThread().getName()+"没吃到,好气哦！");
        }
    @Override
    public void run() {
        while (noodle.getLast()>0) {
            System.out.println(Thread.currentThread().getName() + "哲学♂饥饿，准备抢吃的");
            synchronized (chopstick_right) {
                synchronized (chopstick_left) {
                    this.useChopstick(chopstick_left, chopstick_right);
                }
            }
        }
    }
}


