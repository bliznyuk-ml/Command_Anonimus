package org.itstep;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Пишите ваш код здесь
        Command[] command = {
                new Command() {
                    {
                        com = "echo";
                    }

                    @Override
                    void command(String... str) {                        
                        System.out.println(String.join(" ", str));
                    }
                },
                new Command() {
                    {
                        com = "exit";
                    }

                    @Override
                    void command(String... str) {
                        System.out.println("Goodbye");
                    }
                },
                new Command() {
                    {
                        com = "help";
                    }

                    @Override
                    void command(String... str) {
                        System.out.println("Help executed");
                    }
                },
                new Command() {
                    {
                        com = "now";
                    }

                    @Override
                    void command(String... str) {
                        System.out.println(System.currentTimeMillis());
                    }
                }
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String operation = scanner.nextLine();
            String[] arrStr = operation.split("\\s+");
            for (Command com : command) {
                if (com.com.equals(arrStr[0])) {
                    com.command(Arrays.copyOfRange(arrStr, 1, arrStr.length);
                    break; // так буде ліпше
                }
            }
        }
    }
}
