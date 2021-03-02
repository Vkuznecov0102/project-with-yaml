package ru.itsjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itsjava.domain.Coffee;

public class CoffeeHouseServiceImpl implements CoffeeService {

    @Autowired
    private MenuService menuService;

    @Autowired
    private ScannerService scannerService;

    @Override
    public Coffee getCoffee() {

        Coffee coffee;

        menuService.menuReader("src/main/resources/coffeehouse.txt");
        int price = scannerService.readPrice();

        while (true) {
            if (price == 75) {
                coffee = new Coffee("Мокка");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 120) {
                coffee = new Coffee("Холодный кофе");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 130) {
                coffee = new Coffee("Горячий шоколад");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 90) {
                coffee = new Coffee("Какао");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }
}
