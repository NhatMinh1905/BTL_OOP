package controller;

import model.Tour;
import model.User;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TourController {
    List<User> users = new ArrayList<User>();
    Scanner sc = new Scanner(System.in);
    public void signUp(){
        System.out.println("Nhập tài khoản: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        while (password.length() < 6) {
            System.out.println("Vui lòng chọn mật khẩu lớn hơn 6 kí tự");
            password = sc.nextLine();
        }
        User user = new User(username, password);
        users.add(user);
        System.out.println("Đăng kí thành công!");
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User signIn(){
        System.out.println("Nhập tài khoản của bạn");
        String username = sc.nextLine();
        if (findByUsername(username) != null) {
            System.out.println("Nhập mật khẩu của bạn: ");
            String password = sc.nextLine();
            while (!findByUsername(username).getPassword().equals(password)) {
                System.out.println("Mật khẩu bạn nhập không chính xác vui lòng nhập lại: ");
                password = sc.nextLine();
            }

            System.out.println("Đăng nhập thành công");
            return new User(username, password);
        } else {
            System.out.println("Tài khoản không tồn tại vui lòng đăng kí!");
            return null;
        }
    }

    public void saveTour(List<Tour> tours) throws ParseException {
        System.out.println("Nhập tên tour du lịch: ");
        String tourName = sc.nextLine();
        System.out.println("Nhâp mô tả: ");
        String tourDescription = sc.nextLine();
        System.out.println("Nhập ngày bắt đầu(dd/MM/yyy): ");
        String tourDate = sc.nextLine();
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.parse(tourDate);
        System.out.println("Nhập giá tour: ");
        double price = sc.nextDouble();
        sc.nextLine();
        Tour tour = new Tour(tourName, tourDescription, tourDate, price);
        tours.add(tour);
        System.out.println("Thêm tour mới thành công! ");
    }

    public void getAllTours(List<Tour> tours){
        System.out.println("Danh sách các tour: ");
        for (int i = 0; i < tours.size(); i++) {
            System.out.println("Tên tour: " + tours.get(i).getTourName());
            System.out.println("Mô tả: " + tours.get(i).getTourDescription());
            System.out.println("Ngày bắt đầu: " + tours.get(i).getTourDate());
            System.out.println("Giá: " + tours.get(i).getPrice());
        }
    }

}
