//Задача 1
//    Создать класс Food (еда). В классе должны быть:
//
//    поле "название"
//    поле "калорийность"
//    конструктор, геттеры, сеттеры
//    метод "употребить еду" с каким-нибудь выводом

//    Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//
//    поле "газированный" (да/нет)
//    поле "алкогольный" (да/нет)
//    метод "открыть", который:
//    для газированного напитка печатает "пшш",
//    для негазированного - "скр",
//    а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.

import java.io.IOException;

public class FoodMain {
  public static void main(String[] args) throws IOException {

    Food borsh = new Food("Borsh", 300);
    borsh.eatFood();

    Drink coffee = new Drink("Java", 40, false, false);
    coffee.openBrew();
    Drink cola = new Drink("Cola", 80, true, false);
    cola.openBrew();
    Drink bear = new Drink("Corona", 160, false, true);
    bear.openBrew();
  }
}
