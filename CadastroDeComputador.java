import java.util.Scanner;

class Computador {
    private String marca;
    private String modelo;

    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

public class PrincipalComputador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Computador computador = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1- Cadastrar computador");
            System.out.println("2- Exibir computador");
            System.out.println("3 - Alterar uma informação");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a marca: ");
                String marca = entrada.nextLine();
                System.out.print("Digite o modelo: ");
                String modelo = entrada.nextLine();
                computador = new Computador(marca, modelo);
            } else if (opcao == 2) {
                if (computador != null) {
                    System.out.println("Marca: " + computador.getMarca());
                    System.out.println("Modelo: " + computador.getModelo());
                }
            } else if (opcao == 3) {
                if (computador != null) {
                    System.out.print("Nova marca: ");
                    computador.setMarca(entrada.nextLine());
                    System.out.print("Novo modelo: ");
                    computador.setModelo(entrada.nextLine());
                }
            }
        }
        entrada.close();
    }
}
