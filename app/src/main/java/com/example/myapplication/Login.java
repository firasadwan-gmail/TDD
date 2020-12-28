package com.example.myapplication;

public class Login implements LoginPersenter {
    private LoginView view;
    protected Login (LoginView view){
        this.view=view;
    }
    @Override
    public void isClear_name(int length) {

    }

    @Override
    public void isClear_password(int length) {

    }
}
