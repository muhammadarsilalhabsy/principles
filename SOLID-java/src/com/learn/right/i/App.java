package com.learn.right.i;

public class App {

  public static void main(String[] args) {

    // Interface Segregation Principle

    // Secara umum prinsip ini mengajarkan bahwa, kita tidak perlu membuat interface besar yang mengandung
    // banyak method di dalamnya, sehingga ada beberapa method yang tidak kita pakai/relevan dengan class yang dibuat.
    // Sebaiknya kita membuat antarmuka yang lebih kecil dan lebih spesifik.
    // Sehingga kita hanya perlu mengimplementasikan method yang ingin digunakan saja

    BlackMage blackMage = new BlackMage();
    blackMage.castMagic();
    blackMage.regularAttack();

    Thief thief = new Thief();
    thief.stealMoney();
    thief.regularAttack();

    WhiteMage whiteMage = new WhiteMage();
    whiteMage.castMagic();
    whiteMage.heal();
    whiteMage.regularAttack();
  }
}
