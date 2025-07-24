package text_2.section_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Hero> list = new HashSet<>();
    Hero hero1 = new Hero();
    list.add(hero1);
    System.out.println("要素数= " + list.size());
    hero1 = new Hero();
    hero1.name = "ミナト";
    list.remove(hero1);
    System.out.println("要素数= " + list.size());
  }
}
