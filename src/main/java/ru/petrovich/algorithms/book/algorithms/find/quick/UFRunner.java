package ru.petrovich.algorithms.book.algorithms.find.quick;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UFRunner {

    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);
        int N = readNumberFromConsole(consoleReader);
        UF ufData = new UF(N);
        QuickFindUF uf = new QuickFindUF(N);

        while (consoleReader.hasNext()) {
            int p = readNumberFromConsole(consoleReader);
            int q = readNumberFromConsole(consoleReader);
            if (!ufData.connected(p, q)) {
                ufData.union(p, q);
                System.out.println(String.join(" ", p + "", q + ""));
            }
        }
    }

    private static int readNumberFromConsole(Scanner consoleReader) {
        try {
            return consoleReader.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ouch! Your input not a number");
            consoleReader.next();
            return 0;
        }
    }
}
