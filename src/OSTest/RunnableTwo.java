package OSTest;

public class RunnableTwo implements Runnable{
    static int count = 0;

    @Override
    public void run(){
        for (int i = 0; i < 5000; i++) {
            count ++;
        }
    }
}
