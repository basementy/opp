package main;

public class Television {
  protected int channel;
  protected int volume;

  public void getCurrentChannel() {
    System.out.printf("O canal atual é: %d\n", this.channel);
  }

  public void getCurrentVolume() {
    System.out.printf("O volume atual é: %d\n", this.volume);
  }
}