import java.util.Scanner;

public class jokenpo {
    // placar
    private static int placarJogador = 0;
    private static int placarComputador = 0;

    // Escolha dos jogadores
    private static int escolhaJogador;
    private static int escolhaComputador;

    public static int getEscolhaComputador() {
        return escolhaComputador;
    }

    public static void setEscolhaComputador(int escolhaComputador) {
        jokenpo.escolhaComputador = escolhaComputador;
    }

    // Principal
    public static void main(String[] args) {

        // Quantidade de rodadas
        int rodada = 0;
        int decisao = 1;
        Scanner scan = new Scanner(System.in);
        while (decisao == 1) {
            System.out.println("~~~ JOKÊNPO ~~~");
            System.out.println("Olá, jogador, deseja jogar quantas rodadas?");
            rodada = scan.nextInt();
            for (int i = 1; i <= rodada; ++i) {
                escolhaComputador = (int) (Math.random() * 3) + 1;
                rotuloEscolhaJogador();
                escolhaJogador = scan.nextInt();
                verificaResultado();
                exibePlacar();
            }
            System.out.println("Deseja jogar novamente? (1)Sim (0)Não");
            decisao = scan.nextInt();

        }
            in.close();
            System.out.println("Obrigado");
    }

    // Verifica resultado
    public static void verificaResultado() {

        if (escolhaJogador == escolhaComputador) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Empate!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        } else if (escolhaJogador == 1 && escolhaComputador == 2) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Você perdeu!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            placarComputador++;

        } else if (escolhaJogador == 1 && escolhaComputador == 3) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Você ganhou!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            placarJogador++;

        } else if (escolhaJogador == 2 && escolhaComputador == 1) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Você Ganhou!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            placarJogador++;

        } else if (escolhaJogador == 2 && escolhaComputador == 3) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Você perdeu!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            placarComputador++;

        } else if (escolhaJogador == 3 && escolhaComputador == 1) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Você perdeu!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            placarComputador++;

        } else if (escolhaJogador == 3 && escolhaComputador == 2) {
            System.out.println("O adversário escolheu: ");
            System.out.println(+escolhaComputador);
            System.out.println("Você venceu!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            placarJogador++;
        }
    }

    // Rodada
    public static void rotuloEscolhaJogador() {
        System.out.println("~~~ Jogador, insira: ~~~");
        System.out.println("::: 1-Pedra :::");
        System.out.println("::: 2-Papel :::");
        System.out.println("::: 3-Tesoura :::");
        System.out.println("~~~ Escolha uma opção ~~~");

    }

    public static void exibePlacar() {
        System.out.println("~~~ Placar ~~~");
        System.out.println("Você: " + placarJogador);
        System.out.println("Computador : " + placarComputador);
    }
}