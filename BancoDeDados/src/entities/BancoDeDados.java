package entities;

public abstract class BancoDeDados {
    public abstract void inserir(String dados);
    public abstract void att(String id, String novosDados);
    public abstract void excluir(String id);
    public abstract String consulta(String id);
}
