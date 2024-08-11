package rpg.jogo.jogo;
import rpg.jogo.itens.Itens;

public class Jogo {
	
	public static void main(String[] args) {
		Itens player	= new Itens((byte) 10, 100);
		Itens slime		= new Itens((byte)  7, 1000);
		
		System.out.println("Ataco o slime com minha espada....");
		slime.vida(player.espada());
		System.out.println("Vida do slime: " + slime.vida((byte) (0)));
		
		System.out.println("\nO slime me ataca......");
		player.vida(player.mao());
		System.out.println("Sua via: " + player.vida((byte) 0));
		
		System.out.println("\nVoce usa arco e flecha....");
		slime.vida(player.arco());
		System.out.println("Vida do slime: " + slime.vida((byte) 0));
		
		
	}
}
