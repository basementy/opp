public class Agenda {
  private Contato[] contatos;

  public Agenda(int size) {
    this.contatos = new Contato[size];
  }

  public void menu() {
    System.out.print("-> Agenda <-\n\n");
    System.out.print("1 - Cadastrar Contato\n");
    System.out.print("2 - Buscar Contato\n");
    System.out.print("3 - Imprimir Agenda\n");
    System.out.print("4 - Sair\n\n");
    System.out.print("> Opção: ");
  }
}