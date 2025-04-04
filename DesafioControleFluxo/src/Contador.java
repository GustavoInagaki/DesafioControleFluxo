import java.util.Scanner;

 class ParametrosInvalidosException extends Exception {
    
    public ParametrosInvalidosException (String mensagem){
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        try{

            System.out.println("Informe o primeiro número: ");
            int parametroUm = entrada.nextInt();

            System.out.println("Informe o segundo número: ");
            int parametroDois = entrada.nextInt();

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());


            entrada.close();
        }


    }


    static void contar(int  parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){

            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");

        }
            int contagem = parametroDois - parametroUm;

            for(int i = 1 ; i <= contagem; i++){
                System.out.println("Imprimindo número: " + i);
            }
        

        
    }

}
