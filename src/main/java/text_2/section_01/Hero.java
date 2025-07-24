package text_2.section_01;

import java.util.Objects;

public class Hero {
  String name;
  int hp;

  public int hashcode() {
    return Objects.hash(this.name, this.hp);
  }

  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof Hero)) return false;
    Hero h = (Hero)o;
    if(!this.name.trim().equals(h.name.trim())) {
      return false;
    }
    return true;
  }
}
