/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaIntermediatebasic.File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Yassir Arafat
 */
public class FileOperation {

    public static void main(String[] args) {
        createFile();
    }

    private static void createFile() {

        Path filePath = Paths.get("C:\\ProgramData\\MySQL\\MySQL Server 5.7\\Data\\mysql\\slow-query.log");

        try {
            File file = new File(filePath.toString());

            boolean isCreated = file.createNewFile();

            if (isCreated) {
                System.out.println("File has been created successfully");
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}
