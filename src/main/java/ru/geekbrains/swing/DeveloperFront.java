package ru.geekbrains.swing;

public class DeveloperFront extends Developer implements Frontender{
    @Override
    public void createFront() {
        System.out.println("Frontender: Create front");
    }
}
