/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.designPattern.MVP;

/**
 *
 * @author Yassir Arafat
 */
interface LoginPresenter {

    LoginModel getModel();

    void setModel(LoginModel loginModel);

    LoginView getView();

    void setView(LoginView loginView);

    void setOnLogin(Runnable onLogin);

    void run();

    void login();
}
