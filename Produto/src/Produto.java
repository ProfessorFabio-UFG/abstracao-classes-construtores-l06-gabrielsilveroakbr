import java.util.Scanner;

public class Produto {
    int codigo;
    String nome;
    int quantidade;
    float valor;
    String tipo;
    double saldo = 100;//pra ter um valor incial
    int qt_vendida;
    int qt_comprada;
    double custo;
    String nome2;

    boolean Igual(String nome, String nome2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Produto para comparar:");
        nome2 = sc.nextLine();
        if(nome.equals(nome2)){
            System.out.println("Os produtos são iguais.");
            return true;
        } else {
            System.out.println("Os produtos são diferentes!");
            return false;
        }
    }


    public void Comprar(int quantidade, float valor,int qt_comprada, double saldo, double custo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saldo disponível:" + saldo);
        while (true) {
            System.out.println("Digite a ser comprada (ou digite 0 para cancelar):");
            qt_comprada = sc.nextInt();

            if (qt_comprada == 0) {
                System.out.println("Compra cancelada.");
                return;
            } else {
                break;
            }
        }
        System.out.println("Qual o custo do produto a ser comprado:");
        custo = sc.nextDouble();
        if(custo > saldo){
            System.out.println("Saldo insuficiente!");
            return;
        } else {
            quantidade = quantidade + qt_comprada;
            saldo = saldo - custo;
        }
        System.out.println("Novo saldo:" + saldo);
        System.out.println("nova quantidade:" + quantidade);
    }

    public void Vender(double saldo, int quantidade, float valor, int qt_vendida) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a quantidade vendida (ou digite 0 para cancelar):");
            qt_vendida = sc.nextInt();

            if (qt_vendida == 0) {
                System.out.println("Venda cancelada.");
                return; // Sai do método sem fazer a venda
            }

            if (qt_vendida > quantidade) {
                System.out.println("Não temos essa quantidade no estoque no momento");
                System.out.println("Estoque disponível: " + quantidade);
                // Continua no loop para tentar novamente
            } else {
                break; // Quantidade válida, sai do loop
            }
        }

        quantidade = quantidade - qt_vendida;
        saldo = saldo + (valor * qt_vendida);
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Quantidade vendida: " + qt_vendida);
        System.out.println("Novo saldo: " + saldo);
        System.out.println("Novo estoque: " + quantidade);
    }


    Produto(int codigo){
        this.codigo = codigo;
    }

    Produto(int codigo, String nome,int quantidade, float valor ,String tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipo = tipo;
    }






}
