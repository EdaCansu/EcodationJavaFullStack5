package com.edacansu.javase;

import javax.swing.*;


public class _07_PopUp {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Lütfen bir şeyler yazınız: ");
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

    }
}
