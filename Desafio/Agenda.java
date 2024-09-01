import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private static final String FILE_NAME = "eventos.txt";

    public void adicionarEvento(Evento evento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(evento.toFileFormat());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao adicionar evento: " + e.getMessage());
        }
    }

    public List<Evento> listarEventos() {
        List<Evento> eventos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split(";");
                if (partes.length == 3) {
                    String nome = partes[0];
                    String dataInicio = partes[1];
                    int duracao = Integer.parseInt(partes[2]);
                    eventos.add(new Evento(nome, dataInicio, duracao));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao listar eventos: " + e.getMessage());
        }
        return eventos;
    }
}
