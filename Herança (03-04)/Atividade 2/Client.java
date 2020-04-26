public class Client {
  String name;
  String address;
  String phone;

  public Client(
    String clientName,
    String clientAddress,
    String clientPhone
  ) {
    name = clientName;
    setAddress(clientAddress);
    setPhone(clientPhone);
  }

  public void setAddress(String clientAddress) {
    this.address = clientAddress;
  }

  public void setPhone(String clientPhone) {
    this.phone = clientPhone;
  }

  public String getName() {
    return this.name;
  }

  public String getAdress() {
    return this.address;
  }

  public String getPhone() {
    return this.phone;
  }
}