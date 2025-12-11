import java.util.stream.IntStream;

public class FP05Threads {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++){
                    System.out.println(Thread.currentThread().getId()+" : "+i);
                }
            }
        };

        Runnable runnable2=()-> {
                for (int i=0; i<1000; i++){
                    System.out.println(Thread.currentThread().getId()+" : "+i);
                }
        };

        Runnable runnable3=()-> {
            IntStream.range(0,1000).forEach(i-> System.out.println(Thread.currentThread().getId()+": "+i));
        };

        Thread thread1= new Thread(runnable3);
        Thread thread2=new Thread(runnable3);
        Thread thread3=new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
