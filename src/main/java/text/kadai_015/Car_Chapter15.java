package text.kadai_015;

public class Car_Chapter15 {
  private int gear = 1;
  private int speed = 10;

  public void gearChange(int afterGear) {
    this.gear = afterGear;

    if(gear == 1) {
      speed = 10;
    } else if(gear == 2) {
      speed = 20;
    } else if (gear == 3) {
      speed = 30;
    } else if (gear == 4) {
      speed = 40;
    } else if(gear == 5) {
      speed = 50;
    } else {
      speed  =10;
    }
  }

  public void run() {
    System.out.println("ギア: " + gear + ", 速度: " + speed + "km/h");
  }
}
