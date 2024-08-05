package controller;

import model.MainModel;
import view.View;

public class MainController {
    private MainModel model;
    private View view;

    public MainController(MainModel model, View view) {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView() {
        view.setLabelText("Mi primer programa en JavaFx: Mario Sanchez Villa");
    }

    public void initController() {
        view.getButton().setOnAction(e -> view.setLabelText(model.getGreeting()));
    }
}
