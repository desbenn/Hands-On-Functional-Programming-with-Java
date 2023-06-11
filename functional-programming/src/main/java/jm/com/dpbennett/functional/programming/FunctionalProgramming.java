/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jm.com.dpbennett.functional.programming;

/**
 *
 * @author Desmond Bennett
 */
public class FunctionalProgramming {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello from lambda thread");
        }).start();
    }
}
