//    Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//
//    поле "газированный" (да/нет)
//    поле "алкогольный" (да/нет)

//    метод "открыть", который:

//    для газированного напитка печатает "пшш",
//    для негазированного - "скр",
//    а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.

public class Drink extends Food {
  boolean gas = false;
  boolean alcohol = false;

  public Drink(String name, int calories, boolean gas, boolean alcohol) {
    super(name, calories);
    this.gas = gas;
    this.alcohol = alcohol;
  }
  public boolean getGas() {
    return gas;
  }

  public boolean getAlcohol(){
    return alcohol;
  }

//  public void openBrew() {
//    if ()
//  }

}
