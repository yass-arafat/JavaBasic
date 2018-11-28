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
interface LoginView {

    LoginPresenter getPresenter();

    void setPresenter(LoginPresenter loginPresenter);

    void updateModelFromView();

    void updateViewFromModel();

    void open();

    void close();

    void userRejected();
}
