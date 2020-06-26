public class Contato {
  private String name;
  private String phone;

  public Contato(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setName(String name) {
    this.name = name;
  }
}