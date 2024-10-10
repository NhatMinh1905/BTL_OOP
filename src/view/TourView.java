package view;

import controller.TourController;
import model.Tour;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TourView {
    Scanner sc = new Scanner(System.in);
    TourController tourController = new controller.TourController();
    public void menu() {
        String option;
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng kí");
            System.out.println("3. Đăng nhập quyền admin");
            System.out.println("4. Thoát");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    tourController.signIn();
                    break;
                case "2":
                    tourController.signUp();
                    break;
                case "3":

                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }

    public void menuAdmin() throws ParseException {
        List<Tour> tours = new ArrayList<>();
        String option;
        while (true) {
            System.out.println("1. Thêm 1 tour mới");
            System.out.println("2. Xoá tour");
            System.out.println("3. Sửa tour");
            System.out.println("4. Kiểm tra cac tour: ");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    tourController.saveTour(tours);
                    break;
                case "2":
                    break;
                case "3":

                    break;
                case "4":
                    tourController.getAllTours(tours);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }


}
