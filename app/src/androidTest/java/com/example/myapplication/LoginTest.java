package com.example.myapplication;

import android.view.View;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.runner.RunWith;
@RunWith(AndroidJUnit4.class)
public class LoginTest  {
    //if user does not input any thing .exception
    //if user input email. check if exisit.

    public void inputUserPassword(View view){
        view.findViewById(R.id.password);
        view.onCheckIsTextEditor();
    }

    public void inputUserEmail(View view){

    }
    public void userClickButton(){

    }

}
