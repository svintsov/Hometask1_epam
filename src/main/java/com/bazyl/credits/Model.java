package com.bazyl.credits;

public class Model {

  private String helloString = "";
  private String worldString = "";


  String getHelloString() {
    return helloString;
  }

  public void setHelloString(String helloString) {
    this.helloString = helloString;
  }

  String getWorldString() {
    return worldString;
  }

  public void setWorldString(String worldString) {
    this.worldString = worldString;
  }

  public boolean isReadyToPrint() {
    return helloString.equals("Hello") && worldString.equals("world");
  }

}
