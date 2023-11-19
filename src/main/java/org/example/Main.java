package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        while(true) {
            System.out.print("명령) ");
//          명령문 입력
            sc.next();
//          명령문 type 파악
            if (sc.next().equals("등록")) {
                System.out.print("명언 : 현재를 사랑하라.");
                System.out.print("작가 : 작자미상");
                int i = 0;
                i++;
                System.out.println(i + "번 명언이 등록 되었 습니다.");
            }
            if (sc.next().equals("종료")) {
                break;
            }
            break;
        }
    }
}