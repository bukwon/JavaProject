package OSTest;

public class RunnableOne implements Runnable{
    int count = 0;

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            count ++;
        }
    }
}
