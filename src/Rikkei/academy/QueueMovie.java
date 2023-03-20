package Rikkei.academy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập tên khách hàng chờ mua vé xem phim: ");
                    String name = sc.nextLine();
                    queue.add(name);
                    break;
                case 2:
                    System.out.println("Khách hàng đầu tiên: " + queue.peek());
                    queue.poll();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice !=0);
    }
}
