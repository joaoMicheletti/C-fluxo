import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o Primeiro Parâmetro :_ ");
        int parametro0 = scan.nextInt();
        System.out.print("Digite o Segundo parâmetro :_ ");
        int parametro1 = scan.nextInt();
        
        try{
            Contar(parametro0, parametro1);

        } catch (ParametrosInvalidosException e){ // ajustar o catch;
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");

        };
    };
    static void Contar(int parametro0, int parametro1) throws ParametrosInvalidosException {
        if(parametro0 > parametro1){
            //tratar com a exception;
            throw new ParametrosInvalidosException();

        } else {
            for(int i = parametro0; i < parametro1; i ++){
                System.out.println("Imprimindo o número : " + i);
            };
        };
    };
};
