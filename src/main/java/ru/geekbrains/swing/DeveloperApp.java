package ru.geekbrains.swing;


public class DeveloperApp {
    public static void main(String[] args) {
        Fullstack devFull = new DeveloperFull();
        Backender devBack = new DeveloperBack();

        Developer developer = new DeveloperFront();

        if (developer instanceof Frontender) {
            ((DeveloperFront) developer).createFront();
        }

        devFull.createServer();
        devFull.createFront();

        devBack.createServer();
    }
}