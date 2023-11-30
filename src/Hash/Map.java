package Hash;

public class Map {
    public static void main(String[] args) {
        int result = 0;
        char c = '1';
        result += ((int)c * Math.pow(16, 3));
        result += ((int)c * Math.pow(16, 2));
        result += ((int)c * Math.pow(16, 1));
        result += ((int)c * Math.pow(16, 0));
        System.out.println(result);
    }
}

// 16진법 숫자 * 진법^자리