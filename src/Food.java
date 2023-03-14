//Задача 1
//    Создать класс Food (еда). В классе должны быть:
//
//    поле "название"
//    поле "калорийность"
//    конструктор, геттеры, сеттеры
//    метод "употребить еду" с каким-нибудь выводом

public class Food {

  private String name;
  private int calories;

  public Food(String name, int calories) {
    this.name = name;
    this.calories = calories;
  }

  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public void eatFood() {
    System.out.printf("Please, be informed, that %s = %d calories per 100g%n", getName(),
        getCalories());
  }
}
