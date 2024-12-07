package com.learn.right.d;

public class App {

  public static void main(String[] args) {

    // Dependency Inversion Principle

    // Secara umum prinsip ini menjelaskan bahwa Module (class/interface) tingkat tinggi
    // tidak boleh bergantung pada module tingkat rendah, keduanya harus bergantuk pada abstraksi
    // Abstraksi tidak boleh bergantung pada rincian, tetapi rincian yang harus bergantung pada abstaksi

    User user = new User();

    // save to firebase
    FirebaseStorage firebaseStorage = new FirebaseStorage();
    UserManager userManager1 = new UserManager(firebaseStorage);
    userManager1.saveUserData(user);

    // save to local storage
    LocalStorage localStorage  = new LocalStorage();
    UserManager userManager2 = new UserManager(localStorage);
    userManager2.saveUserData(user);
  }
}
