import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Primeiro Parâmetro :_ ");
        int parametro0 = scanner.nextInt();
        System.out.print("Digite o Segundo parâmetro :_ ");
        int parametro1 = scanner.nextInt();
        
        try{
            Contar(parametro0, parametro1);

        } catch (err){ // ajustar o catch;
            System.out.println("erro here.");

        };
    };
    static void Contar(int parametro0, int parametro1)  {
        if(parametro1 > parametro0){
            //tratar com a exception;

        } else {
            for(int i = parametro0; i < parametro1; i ++){
                System.out.println("Imprimindo o número : " + i);
            };
        };
    };
};
