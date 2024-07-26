

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        String winner = "";
        long distance = 0;
        ArrayList <Car> CarList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            int count = i+1;
            System.out.println("Введите название машины номер " + count);
            String name = scanner.nextLine();
            long speed;
            do{
                System.out.println("Введите скорость машины");
                if (scanner.hasNextLong()) {
                    speed = scanner.nextLong();
                    scanner.nextLine();
                    if (speed > 250) {
                        System.out.println("Скорость не должна превышать 250. Сбавь габаритики, уважаемый");
                    }else {
                        break;
                    }
                }else{System.out.println("Некорректный ввод. Введите число.");
                    scanner.nextLine();
                }
            }while(true);
            Car car = new Car(name,speed);
            CarList.add(car);
        }
        for(int i=0;i<3;i++){
            Car car = CarList.get(i);
            long dist = 24* car.speed;
            if (distance < dist ){
                distance = dist;
                winner = car.name;
            }



        }
        System.out.println("Самая быстрая машина:" + winner);
    }
}
    