package com.bazyl.credits;

import java.util.Scanner;

class Controller {

  private Model model;
  private View view;

  Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  void processUser() {
    Scanner scanner = new Scanner(System.in);
    while (!model.isReadyToPrint()) {
      model.setHelloString(getHelloStringFromInput(scanner));
      model.setWorldString(getWorldStringFromInput(scanner));
    }
    View.showMessage(model.getHelloString() + " " + model.getWorldString());
  }

  private String getWorldStringFromInput(Scanner scanner) {
    View.showMessage(View.INPUT_WORLD_MSG);
    while (!scanner.hasNext("world")) {
      View.showMessage(View.ERROR_MSG + View.INPUT_WORLD_MSG);
      scanner.next();
    }
    return scanner.next();
  }

  private String getHelloStringFromInput(Scanner scanner) {
    View.showMessage(View.INPUT_HELLO_MSG);
    while (!scanner.hasNext("Hello")) {
      View.showMessage(View.ERROR_MSG + View.INPUT_HELLO_MSG);
      scanner.next();
    }
    return scanner.next();

  }

}
