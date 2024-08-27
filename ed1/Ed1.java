package com.mycompany.ed1;

import java.util.Random;

public class Ed1 {

    public static void main(String[] args) {
        Random rand = new Random();

        PilhaDinamica pilha1 = new PilhaDinamica();
        PilhaDinamica pilha2 = new PilhaDinamica();
        PilhaDinamica pilha3 = new PilhaDinamica();

        for (int i = 0; i < 100; i++) {
            int numero = rand.nextInt(9) + 1;
            if (numero >= 1 && numero <= 3) {
                pilha1.push(numero);
            } else if (numero >= 4 && numero <= 6) {
                pilha2.push(numero);
            } else {
                pilha3.push(numero);
            }
        }

        for (int i = 0; i < 100; i++) {
            int escolha = rand.nextInt(3) + 1;
            switch (escolha) {
                case 1:
                    if (!pilha2.isEmpty() && !pilha3.isEmpty()) {
                        try {
                            int num2 = pilha2.pop();
                            int num3 = pilha3.pop();
                            pilha1.push(num2);
                            pilha1.push(num3);
                            System.out.println("Empilhando " + num2 + " e " + num3 + " na Pilha 1");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                    break;
                case 2:
                    if (!pilha1.isEmpty() && !pilha3.isEmpty()) {
                        try {
                            int num1 = pilha1.pop();
                            int num3 = pilha3.pop();
                            pilha2.push(num1);
                            pilha2.push(num3);
                            System.out.println("Empilhando " + num1 + " e " + num3 + " na Pilha2");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                    break;
                case 3:
                    if (!pilha1.isEmpty() && !pilha2.isEmpty()) {
                        try {
                            int num1 = pilha1.pop();
                            int num2 = pilha2.pop();
                            pilha3.push(num1);
                            pilha3.push(num2);
                            System.out.println("Empilhando " + num1 + " e " + num2 + " na Pilha 3");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } else {
                        break;
                    }
                    break;
            }

            if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
                break;
            }
        }

        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);
    }
}
