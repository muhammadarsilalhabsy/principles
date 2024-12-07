package com.learn.wrong.o;

// ==== before update ====

/*
public class MyRobot {

  void talk(){
    // ...
  }

  void walk(){
    // ...
  }

}
*/

// ==== after update ====

/*
   Perubahan ini tidak di benarkan, jika MyRobot diggunakan pada class lain di sistem kita,
   ini akan berdampak pada sistem yang lain!
*/
public class MyRobot{
  void talk(){
    // ...
  }
  void killMosquito(){
    // ...
  }
  void fly(){
    // ...
  }
}

