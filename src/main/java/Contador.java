import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo valor: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo!");
        }

        int contagem = parametroDois - parametroUm;

        for(int c = 1; c <= contagem; c++){
            System.out.println("Valor da contagem: "+c);
        }
    }
}
