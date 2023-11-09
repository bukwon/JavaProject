/*
package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wiseSaying {
    static Scanner sc = new Scanner(System.in);
    private static int id;
    private static String content;
    private static String author;
    private static List<wiseSayingList> list = new ArrayList<>();  // 동적 저장을 위한 리스트
    public static void main(String[] args) {
        while(true) {
            System.out.println("== 명언 앱 ==");
            System.out.print("명령) ");
            String menu = sc.nextLine();
            switch (menuCheck())
            if(menuCheck(menu) == 1) break;
            else if(menuCheck(menu) == 2) addList();
            else if () {

            }
        }

    }

    public static int menuCheck(String menu) {
        int returnMenu = 0;  // 메뉴 리턴할 값

        if(menu.equals("종료")) returnMenu = 1;
        else if (menu.equals("등록")) returnMenu = 2;

        return returnMenu;
    }

    public static void addList() {
        System.out.print("명언 : ");
        content = sc.nextLine();
        System.out.print("작가 : ");
        author = sc.nextLine();
        id++;
        list.add(new wiseSayingList(id, content, author));
        System.out.println(list.get(id-1).id + "번 째 작성 완료");
    }
}

class wiseSayingList {
    int id;
    String content;
    String author;
    wiseSayingList(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}*/
