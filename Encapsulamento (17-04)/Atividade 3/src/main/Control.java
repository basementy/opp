package main;

public class Control extends Television {
  public void incrementVolume() {
    if (this.volume < 100) this.volume++;
  }

  public void drecrementVolume() {
    if (this.volume > 0) this.volume--;
  }

  public void changeChannel(int channel) {
    this.channel = channel;
  }
}