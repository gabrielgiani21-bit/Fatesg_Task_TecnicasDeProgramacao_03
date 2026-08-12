import java.util.Scanner;

class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];
        int quantidade = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1- Cadastrar funcionário");
            System.out.println("2- Listar funcionários");
            System.out.println("3 - Alterar uma informação de um funcionário");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                if (quantidade < 10) {
                    System.out.print("Nome do funcionário: ");
                    String nome = entrada.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = entrada.nextLine();
                    funcionarios[quantidade] = new Funcionario(nome, cargo);
                    quantidade++;
                }
            } else if (opcao == 2) {
                for (int i = 0; i < quantidade; i++) {
                    System.out.println(i + " - Nome: " + funcionarios[i].getNome() + " | Cargo: " + funcionarios[i].getCargo());
                }
            } else if (opcao == 3) {
                System.out.print("Digite o número (ID) do funcionário na lista para alterar: ");
                int indice = entrada.nextInt();
                entrada.nextLine();
                
                if (indice >= 0 && indice < quantidade) {
                    System.out.print("Novo nome: ");
                    funcionarios[indice].setNome(entrada.nextLine());
                    System.out.print("Novo cargo: ");
                    funcionarios[indice].setCargo(entrada.nextLine());
                }
            }
        }
        entrada.close();
    }
}
