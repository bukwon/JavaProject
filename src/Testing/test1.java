package Testing;

public class test1 {
    public static void main(String[] args) {
        int a = 3;
        int b= 5;
        long result = 0;
        for (int i = 0; i < 100000; i++) {
            if(i % a == 0 || i % b == 0)
                result += i;
        }
        System.out.println(result);
    }
}

// 23 2318 233168 2331668