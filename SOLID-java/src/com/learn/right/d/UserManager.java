package com.learn.right.d;

public class UserManager {
  private final IDataStorage dataStorage;

  UserManager(IDataStorage dataStorage){
    this.dataStorage = dataStorage;
  }

  void saveUserData(User user){
    dataStorage.saveDataUser(user);
  }
}
