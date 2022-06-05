package ru.netology;

public class Box implements Runnable{

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.toggle) {
                Main.toggle = false;
                System.out.println("Коробка выключила тумблер");
            }
        }
    }
}
