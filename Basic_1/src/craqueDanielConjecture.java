import java.util.Scanner;

//Falha de cobertura: https://www.youtube.com/watch?v=i_od4HAsVLo

public class craqueDanielConjecture {
	
	private static int alemanha;
	private static int brasil;
	private static Scanner scan;
	private static int golDaAlemanha;
	private static int golDoBrasil;
	
	public static void main(String[] args){
	
		scan = new Scanner (System.in);
	 
		System.out.println("Escreva um outro placar possível para o 7 a 1.\n");
		System.out.println("Alemanha:");
		alemanha = scan.nextInt();
		System.out.println("Brasil:");
		brasil = scan.nextInt();
		
		golDaAlemanha = alemanha;
		golDoBrasil = brasil;
		
		int narracao = 0;
		
		while(golDaAlemanha != 7 && golDoBrasil != 1) {
		
			if(brasil < 0 || brasil > 8){
				
				System.out.println("Pode isso Cerginho?!?! Isso não existe!! Não com o David Luiz e o Fred em campo.");
				break;
			}
		
			if(alemanha > 7 || alemanha < 0){
			
				System.out.println("Todos temos direito a uma opinião, Cerginho, mas esse placar depende do desenrolar de acontecimentos extremamente improváveis!");
				break;
			}
			
			if(golDaAlemanha < 7) {
				
				switch(golDaAlemanha) {
				
					case 1: System.out.println("Gol da Alemanha!");
					break;
					case 2: System.out.println("Gol da Alemanha!");
					break;
					case 3: System.out.println("Não foi sorte, foi doideira.");
					break;
					case 4: System.out.println("Fiquei com medo de abrir a geladeira e ter um gol da Alemanha lá dentro...");
					break;
					case 5: System.out.println("Cerginho: Vou descrever todos os gols da Alemanha, Daniel. De uma maneira só, porque foram todos iguais. A Alemanha tocando a bola e o Brasil olhando, Daniel.");
					break;
					case 6: System.out.println("Daniel: Bela Aálise, Cerginho. Muito concisa. Inclusive, depois do quarto ou quinto gol já estava achando que era replay...");
					break;
					case 7: System.out.println("Daniel: A única instrução que o Felipão deveria ter feito no segundo tempo é: Não.vamos.voltar. Vamos ficar aqui, e a equipe reclusa no vestiário, passada algumas horas, alguns dias, a torcida ia esquecer do jogo e voltar pra casa");
					
					
				}
				
				golDaAlemanha++;
				
			}
			
			if(golDoBrasil > 0) {
				
				
				switch(golDoBrasil) {
				
					case 1: System.out.println("Que noite infeliz da seleção brasileira. Até chute para fora deu errado e entrou dentro do gol!");
					break;
					case 2: System.out.println("Além disso, Cerginho!! Quem garante que esse Neuer não é um cyborg!? Eles têm tecnologia para isso!");
					break;
					case 3: System.out.println("Olha o Hulk!!! Para foraaaa!");
					break;
					case 4: System.out.println("Cadê o Fred?? Certamente o melhor jogador em campo, Cerginho. Ele toca na bola e nem dá tempo de ser vaiado!");
					break;
					case 5: System.out.println("Aquele outro indivíduo, aquele cidadão aquele William, que fazia aquecimento dando piscadinha de olho para a câmera. Apareceu no futebol ontem!! Entrou perdendo de 5x0 hoje no jogo, dando passezinho de letra. Eu vou dedicar a minha vida inteira, a existência a odiar esse cidadão! Gostaria que ele soubesse disso!!");
					break;
					case 6: System.out.println("Fred!! Cadê o Fred??");
					break;
					case 7: System.out.println("Esqueceram do futebol, esqueceram do dibre e deram uma atenção descabida à locomoção do ônibus da seleção...");
					
					
					
				}
				
				golDoBrasil--;
				
			}	
			
			narracao++;
	
		}	
		
		if(golDoBrasil != 1) {
			
			golDoBrasil = 1;
			
		}
		
		if(golDaAlemanha != 7) {
			
			golDaAlemanha = 7;
			
		}
		
		System.out.println("Daniel: Esse rapaz, esse David Luiz, me irritou profundamente, já me irritava antes, dando abracinho em jogador que ele derrotava; jogou contra a Colômbia e foi dar abracinho e apontar pro jogador que tava chorando pra aparecer, essa é a forma mais baixa de se aparecer: em cima de um jogador derrotado.");
		System.out.printf("Placar final!!! Brasil %d, Alemanha... %d!!!!!", golDoBrasil, golDaAlemanha);
	
	}

}

