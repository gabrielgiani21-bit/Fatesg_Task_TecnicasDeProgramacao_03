import java.util.Scanner;

class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

public class PrincipalCliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1- Cadastrar cliente");
            System.out.println("2- Exibir cliente");
            System.out.println("3 - Alterar uma informação do cliente");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = entrada.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = entrada.nextLine();
                cliente = new Cliente(nome, telefone);
            } else if (opcao == 2) {
                if (cliente != null) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Telefone: " + cliente.getTelefone());
                }
            } else if (opcao == 3) {
                if (cliente != null) {
                    System.out.print("Novo nome: ");
                    cliente.setNome(entrada.nextLine());
                    System.out.print("Novo telefone: ");
                    cliente.setTelefone(entrada.nextLine());
                }
            }
        }
        entrada.close();
    }
}
