import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

class AgendaContatos {
    private ArrayList<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}

public class AgendaContatosApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContatos agenda = new AgendaContatos();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.next();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.next();
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.println("Saindo da Agenda de Contatos. Adeus!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
