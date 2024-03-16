import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem:O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
        
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
        for(int contador = 20;contador >= 10;contador--){
            System.out.println("Número é " + contador);
        }
		if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();   
            
    
        else{
            System.out.println(" o número atual é:" + contagem);
        }
        
    }

    
}
