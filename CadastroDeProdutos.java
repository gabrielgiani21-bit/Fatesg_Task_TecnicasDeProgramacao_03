import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class PrincipalProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto[] produtos = new Produto[10];
        int quantidade = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1- Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Alterar uma informação de um produto");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                if (quantidade < 10) {
                    System.out.print("Nome do produto: ");
                    String nome = entrada.nextLine();
                    System.out.print("Preço: ");
                    double preco = entrada.nextDouble();
                    produtos[quantidade] = new Produto(nome, preco);
                    quantidade++;
                }
            } else if (opcao == 2) {
                for (int i = 0; i < quantidade; i++) {
                    System.out.println(i + " - Produto: " + produtos[i].getNome() + " | R$: " + produtos[i].getPreco());
                }
            } else if (opcao == 3) {
                System.out.print("Digite o número (ID) do produto na lista para alterar: ");
                int indice = entrada.nextInt();
                entrada.nextLine();
                
                if (indice >= 0 && indice < quantidade) {
                    System.out.print("Novo nome: ");
                    produtos[indice].setNome(entrada.nextLine());
                    System.out.print("Novo preço: ");
                    produtos[indice].setPreco(entrada.nextDouble());
                }
            }
        }
        entrada.close();
    }
}
