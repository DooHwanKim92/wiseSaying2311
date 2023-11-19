package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    void run() {
        System.out.println("== 명언 앱 ==");
        long num = 0;
        while (true) {
            System.out.print("명령) ");
            String command = this.sc.nextLine().trim();

            if(command.equals("종료")) {
                break;
            }
            else if(command.equals("등록")) {
                System.out.print("명언 : ");
                String content = this.sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = this.sc.nextLine().trim();
                num++;
                System.out.println(num+"번 명언이 등록되었습니다.");

                WiseSaying wiseSaying = new WiseSaying(num, author, content);
                wiseSayingList.add(wiseSaying);


            }
            else if(command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(20));
                for (int i =0;i<wiseSayingList.size();i++) {
                    WiseSaying wiseSaying = wiseSayingList.get(i);

                    System.out.printf("%d, %s, %s\n",wiseSaying.getId(),wiseSaying.getAuthor(),wiseSaying.getContent());
                }
            }
        }
    }
}