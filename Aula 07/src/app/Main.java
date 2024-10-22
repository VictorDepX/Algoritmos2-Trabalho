package app;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("---- Produtos Válidos ----");

            //Eletrônico válido
            Eletronicos smartphone = new Eletronicos("Smartphone", "150000", 12.00, 24, false);
            smartphone.Exibir();

            System.out.println(); //Espaçamento

            //Alimento válido
            Alimentos maca = new Alimentos("Maça", "010", 12.00, "18/09/2025", true);
            maca.Exibir();

            System.out.println(); //Espaçamento

            System.out.println("---- Produtos Inválidos ----");

            //Eletrônico Inválido
            Eletronicos eletronicoInvalido = new Eletronicos("Alo", "100", 12.00, -1, true);
            eletronicoInvalido.Exibir();

        } catch (Exception e) {
            System.err.println("Erro: " + e);
        }

        try {
            // Tentando criar um Alimento com nome nulo
            Alimentos alimentoInvalido = new Alimentos(null, "350", 192, "", false);
            alimentoInvalido.Exibir();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
