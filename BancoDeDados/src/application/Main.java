package application;

import entities.BancoDeDados;
import entities.MySQL;
import entities.SQLite;

public class Main {
    public static void main(String[] args) {
        BancoDeDados b1 = new MySQL();
        BancoDeDados b2 = new SQLite();

        b1.inserir("nome='John Doe', idade=30");
        b1.att("1","idade=31");
        b1.consulta("1");
        b1.excluir("1");
        System.out.println("===========================================");
        b2.inserir("nome='Jane Doe', idade=25");
        b2.att("2","idade=26");
        b2.consulta("2");
        b2.excluir("2");
    }
}