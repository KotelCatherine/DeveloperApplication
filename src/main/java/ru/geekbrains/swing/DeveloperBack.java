package ru.geekbrains.swing;

public class DeveloperBack extends Developer implements Backender{
    @Override
    public void createServer() {
        System.out.println("Backender: Dropped server");
    }
}
