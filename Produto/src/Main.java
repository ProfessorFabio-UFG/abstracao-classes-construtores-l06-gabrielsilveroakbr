import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[3];
        String resposta;
        int codigo;
        String nome;
        int quantidade;
        float valor;
        String tipo;
        double saldo = 100;//pra ter um valor incial
        int qt_vendida = 0;
        int qt_comprada = 0;
        double custo = 0;
        String nome2 = "nome2";
        for (int i = 0; i < 3; i++) {
            System.out.println("Quer adicionar apenas por código de produto?");
            resposta = sc.nextLine();
            if (resposta.equals("Sim")) {
                System.out.println("Digite o código do produto:");
                codigo = sc.nextInt();
                produtos[i] = new Produto(codigo);
                sc.nextLine();
            } else if (resposta.equals("Não")) {
                System.out.println("Digite o código do produto:");
                codigo = sc.nextInt();
                System.out.println("Digite o nome do produto:");
                nome = sc.nextLine();
                System.out.println("Digite a quantidade do produto:");
                quantidade = sc.nextInt();
                System.out.println("Digite o valor do produto:");
                valor = sc.nextFloat();
                System.out.println("Digite o tipo de produto:");
                tipo = sc.nextLine();
                produtos[i] = new Produto(codigo , nome, quantidade, valor, tipo);
                produtos[i].Vender(saldo, quantidade, valor, qt_vendida);
                produtos[i].Comprar(quantidade, valor, qt_comprada, saldo, custo);
                produtos[i].Igual(nome,nome2);
                sc.nextLine();
            }

        }










}

}