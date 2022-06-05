package ru.netology;

public class User implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (!Main.toggle) {
                Main.toggle = true;
                System.out.println("Пользователь включил тумблер.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
