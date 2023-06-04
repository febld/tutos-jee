package feb.java.serverapp.domain;

/**
 * Pet
 */
public class Pet {

  private Long   id;
  private String name;
  private String race;
  private Integer age;
  private String sexe;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getSexe() {
    return sexe;
  }

  public void setSexe(String sexe) {
    this.sexe = sexe;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Domain class Pet {\n");
    sb.append("    id: ").append(id).append("\n");
    sb.append("    name: ").append(name).append("\n");
    sb.append("    race: ").append(race).append("\n");
    sb.append("    age: ").append(age).append("\n");
    sb.append("    sexe: ").append(sexe).append("\n");
    sb.append("}");
    return sb.toString();
  }

}

