import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de itens para a fila");

        int c = scanner.nextInt(), opcao = 0, valor = 0;

        //Fila Circular
        FilaCircular f1 = new FilaCircular(c);

        do {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("0 - Fim");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite um valor inteiro para inserir");
                valor = scanner.nextInt();
                f1.add(valor);
                f1.print();
            }
            else if (opcao == 2){
                f1.remove();
                f1.print();
            }

            else if (opcao == 3){
                f1.print();
            }

        } while(opcao != 0);




 //            f1.add(7);
//            f1.add(2);
//            f1.add(5);
//            f1.print();
//
//            f1.remove();
//        f1.print();
//        f1.remove();
//        f1.add(10);
//        f1.print();

        }
    }
