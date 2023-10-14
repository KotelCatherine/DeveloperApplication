package ru.geekbrains.swing;

public class DeveloperFull extends Developer implements Fullstack {
    @Override
    public void createServer() {
        System.out.println("Fullstack developer: Create server");
    }

    @Override
    public void createFront() {
        System.out.println("Fullstack developer: Create front");
    }
}
