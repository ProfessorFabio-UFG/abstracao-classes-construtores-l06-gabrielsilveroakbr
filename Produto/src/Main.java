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
            if (resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Digite o código do produto:");
                codigo = sc.nextInt();
                produtos[i] = new Produto(codigo, "nome",0, 1 ,"Indef");
                System.out.println("Gostaria de inserir mais dados?");
                String respostas = sc.nextLine();
                if(respostas.equalsIgnoreCase("Sim")) {
                    System.out.println("Digite o nome do produto:");
                    nome = sc.nextLine();

                    System.out.println("Digite a quantidade do produto(Caso indefinido coloque 0:");
                    quantidade = sc.nextInt();

                    System.out.println("Digite o valor do produto (caso indefinido ainda coloque 0):");
                    valor = sc.nextFloat();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    System.out.println("Digite o tipo de produto (caso indefinido coloque indef):");
                    tipo = sc.nextLine();

                    produtos[i].setNome(nome);
                    produtos[i].setQuantidade(quantidade);
                    produtos[i].setValor(valor);
                    produtos[i].setTipo(tipo);
                    produtos[i].Vender(saldo, quantidade, valor, qt_vendida);
                    produtos[i].Comprar(quantidade, valor, qt_comprada, saldo, custo);
                    if(i > 1){
                        if(produtos[i-1].Igual(produtos[i])){
                            System.out.println("Os produtos são Iguais");

                        } else{
                            System.out.println("Os produtos são diferentes");
                        }
                    }
                    sc.nextLine();
                }
                sc.nextLine();
            } else if (resposta.equalsIgnoreCase("Nao")) {
                System.out.println("Digite o código do produto:");
                codigo = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome do produto:");
                nome = sc.nextLine();
                System.out.println("Digite a quantidade do produto:");
                quantidade = sc.nextInt();
                System.out.println("Digite o valor do produto:");
                valor = sc.nextFloat();
                System.out.println("Digite o tipo de produto:");
                tipo = sc.nextLine();
                sc.nextLine();
                produtos[i] = new Produto(codigo , nome, quantidade, valor, tipo);
                produtos[i].Vender(saldo, quantidade, valor, qt_vendida);
                produtos[i].Comprar(quantidade, valor, qt_comprada, saldo, custo);
                sc.nextLine();
            } else {
                System.out.println("Desculpe a resposta deve ser Sim ou Nao");
                return;
            }


        }










}

}