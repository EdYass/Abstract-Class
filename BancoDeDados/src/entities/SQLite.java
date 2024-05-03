package entities;

public class SQLite extends BancoDeDados {
    @Override
    public void inserir(String dados) {
        System.out.println("Inserindo dados no SQLite: "+dados);
    }

    @Override
    public void att(String id, String novosDados) {
        System.out.println("Atualizando dados no  SQLite para o ID "+id+" com "+novosDados);
    }

    @Override
    public void excluir(String id) {
        System.out.println("Excluindo dados no  SQLite com ID "+id);
    }

    @Override
    public String consulta(String id) {
        System.out.println("Consultando dados no  SQLite com ID "+id);
        return "Dados do SQLite para o ID "+id;
    }
}
