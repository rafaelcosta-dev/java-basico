import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int contaBancaria;
        String agencia;
        String nomeCliente;
        Double saldo = 0.0;



        //BOAS VINDAS//
        System.out.println("Seja bem vindo ao banco DIO, vamos fazer o seu cadastro?");
        System.out.println("Digite S para sim, N para não!");
        String welcome = scanner.nextLine().toLowerCase();

        if (welcome.equals("s")) { // SE O USUARIO RESPONDER "S" ELE PROSSEGUE COM O PROGRAMA, SE NÃO, ELE O FINALIZA!

            System.out.print("\033[33m");
            System.out.println("Ok, vamos prosseguir!");
            System.out.print("\033[0m");

            while (true) {

                System.out.println("Digite sua conta bancaria:");
                if (scanner.hasNextInt()) {

                    contaBancaria = scanner.nextInt();
                
                    break;
                    
                }else {

                    System.out.print("\033[31m");
                    System.out.println("Digite apenas numeros!");
                    System.out.print("\033[0m");
                    scanner.next();

                }
                
                
            }
            

            System.out.println("Digite sua agência:");

            scanner.nextLine();

            agencia = scanner.nextLine();

        
            System.out.println("Digite seu nome:");

            nomeCliente = scanner.nextLine().toUpperCase();

           
            System.out.println(" ");
            System.out.print("\033[32m");
            System.out.println("Conta cadastrada com sucesso!");
            System.out.print("\033[0m");
            System.out.println(" ");
            

            //-------INFORMAÇÔES DO USUARIO--------//

            System.out.print("\033[33m");
            System.out.println("INFORMAÇÔES DO USUARIO:");
            System.out.print("\033[0m");
            System.out.println(" ");
            System.out.println("Conta Bancaria:" + " " + contaBancaria);
            System.out.println("Agência:" + " " + agencia);
            System.out.println("Nome Cliente:" + " " + nomeCliente);
            System.out.println("Saldo Atual:" + " " + saldo);

            
        }else if(welcome.equals("n")) {

            System.out.print("\033[31m");
            System.out.println("Que pena, obrigado pela visita!");
            System.out.println("Equipe Banco Dio agradece! Ate mais!");
            System.out.print("\033[0m");

        }else {

            System.out.println("Resposta inválida");

        }
        
    }

    
}


