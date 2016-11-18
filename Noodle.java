/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class Noodle{
    public int i;
    public Noodle(int i){
        this.i=i;
    }
    public void beenEating(){
          if (i>0)
          {
              System.out.println(Thread.currentThread().getName()+"拿起了筷子正在吃");
              try {
                  Thread.currentThread().sleep(1000);
              } catch (Exception e) {
                  System.out.println(e);
              }
                 synchronized (this)
                 {
                     i--;
                     System.out.println(Thread.currentThread().getName()+"吃了还剩"+i+"碗,放下筷子");
                  }
          }
          else
              System.out.println(Thread.currentThread().getName()+"没吃的了");
      }
    public int getLast(){
        return i;
    }
}

