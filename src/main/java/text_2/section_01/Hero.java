package text_2.section_01;

import java.util.Objects;

public class Hero {
  private String name;
  private int hp, mp;

  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public String toString() {
    return "勇者 (名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
  }

  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof Hero)) return false;
    Hero h = (Hero)o;
    return this.hp == h.hp && this.mp == h.mp && Objects.equals(this.name, h.name);
  }

  public int hashCode() {
    return Objects.hash(this.name, this.hp, this.mp);
  }
}
