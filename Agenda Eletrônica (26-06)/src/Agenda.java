import java.util.Scanner;

public class Agenda {
  private Contato[] contatos;
  int counter = 0;
  int size = 0;
  Scanner scan = new Scanner(System.in);

  public Agenda(int size) {
    this.size = size;
    this.contatos = new Contato[this.size];
  }

  public void showMenu() {
    int option = 0;

    do {
      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.print("-> Agenda <-\n\n");
      System.out.print("1 - Cadastrar Contato\n");
      System.out.print("2 - Buscar Contato\n");
      System.out.print("3 - Imprimir Agenda\n");
      System.out.print("4 - Sair\n\n");
      System.out.print("> Opção: ");

      option = scan.nextInt();

      switch (option) {
				case 1:
					registerContact();
					break;
				case 2:
					searchContact();
					break;
				case 3:
          listAllContact();
					break;
				default:
					System.out.println("Opção inválida.");
			}
    } while (option != 4);

    scan.close();
  }

  public void registerContact() {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    if (this.counter < this.size) {
      String name;
      String phone;

      System.out.print("-> Insira o nome do contato: ");
      name = scan.next();

      System.out.print("-> Insira o número do contato: ");
      phone = scan.next();

      this.contatos[counter] = new Contato(name, phone);
      this.counter++;
    }
  }

  public void searchContact() {
    String name;
    Boolean founded = false;

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.print("-> Insira o nome do contato: ");
    name = scan.next();

    System.out.print("Nome\t\t");
    System.out.print("Telefone\n");

    for (int i = 0; i < this.counter; i++) {
      Contato currentContact = this.contatos[i];

      if (currentContact.getName().equals(name)) {
        founded = true;

        System.out.print(currentContact.getName() + "\t\t");
        System.out.print(currentContact.getPhone());
      }
    }

    if (!founded) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.print("-> O contato não existe na agenda!");
    }

    scan.nextLine();
    scan.nextLine();
  }

  public void listAllContact() {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.print("-> Lista de contatos\n\n");
    System.out.print("Nome\t\t");
    System.out.print("Telefone\n");

    for (int i = 0; i < this.counter; i++) {
      Contato currentContact = this.contatos[i];
      System.out.print(currentContact.getName() + "\t\t");
      System.out.print(currentContact.getPhone() + "\n");
    }

    scan.nextLine();
    scan.nextLine();
  }
}