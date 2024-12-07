package com.learn.right.s;

public class App {

  public static void main(String[] args) {

  // Single Responsibility principle
  // Secara umum prinsip ini menganjurkan untuk membuat class dengan satu tujuan, tanggung jawab atau fungsi
  // Tidak boleh dalam satu class mampu melakukan apa saja (super class). Pada contoh dibawah ini,
  // setiap class memiliki fungsinya masing-masing sehingga kode mudah dibaca dan dikembangkan.

    Car suzuki = new Car();

    // turnOn
    suzuki.turnOn();
    suzuki.radio.playMusic();
    suzuki.airConditioner.turnOfAirConditioner();

    // turnOf
    suzuki.airConditioner.turnOfAirConditioner();
    suzuki.radio.stopMusic();
    suzuki.turnOf();


  }
}
