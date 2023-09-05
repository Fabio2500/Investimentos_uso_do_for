import java.util.Scanner;

class Investimento{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
         
        int anos,i;
		float p, juros_anual;
		double a;

		System.out.println("digite o quanto investiu:");
		p = sc.nextFloat();
		System.out.println("digite a taxa de juros anual");
		juros_anual = sc.nextFloat();
		System.out.println("quantos anos o dinheiro ficou?");
		anos = sc.nextInt();
        
        for(i = 0 ;i <= anos; i++){
        	a = p * Math.pow(1+juros_anual/100,i);
        	System.out.println("a quantidade de dinheiro no fim do ano " + i );
        	System.out.println(a);

        }

	}
}