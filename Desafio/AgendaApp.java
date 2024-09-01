import java.util.Scanner;

public class AgendaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir novo evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha após o número

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do evento:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a data de inicio (dd/mm/aaaa):");
                    String dataInicio = scanner.nextLine();
                    System.out.println("Digite a duração do evento em minutos:");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha após o número

                    Evento evento = new Evento(nome, dataInicio, duracao);
                    agenda.adicionarEvento(evento);
                    System.out.println("Evento adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Eventos registrados:");
                    for (Evento e : agenda.listarEventos()) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
