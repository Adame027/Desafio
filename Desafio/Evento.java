public class Evento {
    private String nome;
    private String dataInicio;
    private int duracao;

    public Evento(String nome, String dataInicio, int duracao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public String toFileFormat() {
        return String.format("%s;%s;%d", nome, dataInicio, duracao);
    }

    @Override
    public String toString() {
        return String.format("Titulo: %s\nData de inicio: %s\nDuracao: %d minutos\n",
                             nome, dataInicio, duracao);
    }
}
