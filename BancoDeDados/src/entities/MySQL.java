package entities;

import javax.sound.midi.Soundbank;

public class MySQL extends BancoDeDados{

    @Override
    public void inserir(String dados) {
        System.out.println("Inserindo dados no MySQL: "+dados);
    }

    @Override
    public void att(String id, String novosDados) {
        System.out.println("Atualizando dados no MySQL para o ID "+id+" com "+novosDados);
    }

    @Override
    public void excluir(String id) {
        System.out.println("Excluindo dados no MySQL com ID "+id);
    }

    @Override
    public String consulta(String id) {
        System.out.println("Consultando dados no MySQL com ID "+id);
        return "Dados do MySQL para o ID "+id;
    }
}
