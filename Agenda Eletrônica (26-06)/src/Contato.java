public class Contato {
  private String name;
  private String phone;

  public Contato(String name, String phone) {
    this.setName(name);
    this.setPhone(phone);
  }

  public String getName() {
    return this.name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setName(String name) {
    this.name = name;
  }
}