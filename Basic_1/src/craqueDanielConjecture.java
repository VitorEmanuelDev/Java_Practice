import java.util.Scanner;

//Para compreender esta máquina do tempo: https://www.youtube.com/watch?v=i_od4HAsVLo

/*

"Somos joguete nas mãos dos astros, Cerginho! Não decidimos nada! Não sabemos nada! 
Somos trapos de imundice diante do que os planetas podem fazer com os nossos destinos! 

Daniel, Craque (2019)"

Veja o vídeo: https://twitter.com/natidanaiti/status/1146569926758543360

*/

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
		
		golDoBrasil = brasil;
		
		if(brasil < 0 || brasil > 8){
			
			System.out.println("Pode isso Cerginho?!?! Isso não existe!! Não com o David Luiz e o Fred em campo.");
				
			golDoBrasil = 7;
			
		}
		
		while(golDoBrasil > 1) {
					
			switch(golDoBrasil) {
				
				case 2: System.out.println("Gol da Alemanha!");
				break;
				case 3: System.out.println("Além disso, Cerginho!! Quem garante que esse Neuer não é um cyborg!? Eles têm tecnologia para isso!");
				break;
				case 4: System.out.println("Olha o Hulk!!! Para foraaaa!");
				break;
				case 5: System.out.println("Cadê o Fred?? Certamente o melhor jogador em campo, Cerginho. Ele toca na bola e nem dá tempo de ser vaiado!");
				break;
				case 6: System.out.println("Aquele outro indivíduo, aquele cidadão... aquele William, que fazia aquecimento dando piscadinha de olho para a câmera. Apareceu no futebol ontem!! Entrou perdendo de 5x0 hoje no jogo, dando passezinho de letra. Eu vou dedicar a minha vida inteira, a existência a odiar esse cidadão! Gostaria que ele soubesse disso!!");
				break;
				case 7: System.out.println("Esqueceram do futebol, esqueceram do dibre e deram uma atenção descabida à locomoção do ônibus da seleção...");
				break;
						
			}
					
					golDoBrasil--;
						
		}
			
		golDaAlemanha = alemanha;	
		
		if(alemanha > 7 || alemanha < 0){
			
			System.out.println("Todos temos direito a uma opinião, Cerginho, mas esse placar depende do desenrolar de acontecimentos extremamente improváveis!");
				
			golDaAlemanha = 1;
			
		}
		
		while(golDaAlemanha < 7) {
				
			switch(golDaAlemanha) {
			
				case 1: System.out.println("Que noite infeliz da seleção brasileira. Até chute para fora deu errado e entrou dentro do gol!");
				break;
				case 2: System.out.println("Não foi sorte, foi doideira.");
				break;
				case 3: System.out.println("Fiquei com medo de abrir a geladeira e ter um gol da Alemanha lá dentro...");
				break;
				case 4: System.out.println("Cerginho: Vou descrever todos os gols da Alemanha, Daniel. De uma maneira só, porque foram todos iguais. A Alemanha tocando a bola e o Brasil olhando, Daniel.");
				break;
				case 5: System.out.println("Daniel: Bela Aálise, Cerginho. Muito concisa. Inclusive, depois do quarto ou quinto gol já estava achando que era replay...");
				break;
				case 6: System.out.println("Daniel: A única instrução que o Felipão deveria ter feito no segundo tempo é: Não.vamos.voltar. Vamos ficar aqui, e a equipe reclusa no vestiário, passada algumas horas, alguns dias, a torcida ia esquecer do jogo e voltar pra casa");
				break;
			
			}
				
					golDaAlemanha++;
				
		}
		
		System.out.println("Daniel: Esse rapaz, esse David Luiz, me irritou profundamente, já me irritava antes, dando abracinho em jogador que ele derrotava; jogou contra a Colômbia e foi dar abracinho e apontar pro jogador que tava chorando pra aparecer, essa é a forma mais baixa de se aparecer: em cima de um jogador derrotado.");
		System.out.printf("Placar final.. Brasil %d, Alemanha... %d!!!!!!", golDoBrasil, golDaAlemanha);
	
	}

}

