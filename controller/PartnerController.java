package Lesson07.controller;

import java.util.Scanner;
import Lesson07.model.data.Partner;
import Lesson07.model.service.PartnerService;
import Lesson07.view.PartnerView;

public class PartnerController implements ContactController {

    private PartnerService model;
    private PartnerView view;

    public PartnerController(PartnerService model, PartnerView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню выбора действий:");
            System.out.println("1. Загрузить контакты из файла");
            System.out.println("2. Добавить нового контрагента");
            System.out.println("3. Напечатать все контакты");
            System.out.println("4. Сохранить список контрагентов");
            System.out.println("5. Выход");

            int index = scanner.nextInt();

            switch (index) {
                case 1:
                    model.load();
                    break;
                case 2:
                    model.addContact(new Partner(scanner.next(), "юридическое лицо", 111111, "продажа товаров",
                            "г. Москва, ул. Московская, д. 225", "sample@mail.ru", "+7 123 6543", "@sample"));

                    break;
                case 3:
                    view.showContacts();
                    ;
                    break;
                case 4:
                    model.save();
                    break;

                case 5:
                    return;
            }
            scanner.close();
        }
    }

}