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
/*-- file: Application.java --*/
import javax.swing.JOptionPane;

/**
 *
 * @author danLeon
 */

public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                LoginModel loginModel = new MyLoginModel();
                
                LoginPresenter loginPresenter = new MyLoginPresenter();
                loginPresenter.setModel(loginModel);
                
                LoginView loginView = new MyLoginView();
                
                loginPresenter.setView(loginView);
                loginPresenter.setOnLogin(new Runnable() {

                    @Override
                    public void run() {
                        JOptionPane.showMessageDialog(null, "Welcome user!");
                    }
                });
                loginPresenter.run();
            }
        });
    }
}
