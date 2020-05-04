package app.Animal;

public class Animal {
  private String nome;
  private String raca;

  public Animal(String nome, String raca) {
    this.setNome(nome);
    this.setRaca(raca);
  }

  public String getNome() {
	  return nome;
  }

  public String getRaca() {
    return raca;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public void caminha() {
    System.out.printf("O animal está caminhando\n");
  }

  public void mostraAnimal() {
    System.out.printf("Nome: %s, Raça: %s\n",
      this.getNome(),
      this.getRaca());
  }
}