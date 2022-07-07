package com.ll.exam;

import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("-- 명연 SSG --");

        Scanner sc = new Scanner(System.in);

        outer:
        while (true) {
            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "종료":
                    break outer;
            }
        }

        sc.close();
    }
}
