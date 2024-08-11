package rpg.jogo.itens;

public class Itens {
	// atributos //////////////////////////////
	private byte dano;
	private byte vel;
	private byte forca;
	private int vida;
	
	// Contrutor /////////////////////////////
	public Itens(byte forca, int vida) {
		this.forca	= forca;
		this.vida	= vida;
	}
	
	// metodos ///////////////////////////////
	public byte espada() {
		return dano = (byte) (10 * forca);
	}
	public byte flecha() {
		return dano = 5;
	}
	public byte arco() {
		return (byte) (flecha()*forca); 
	}
	public byte mao() {
		return (byte) forca;
	}
	public int vida(byte dano) {
		vida -= dano;
		if (vida < 0){
			vida = 0;
		}
		return vida;
	}

	
	
	
	
	
	
	
	
	
	// Getters and Setters /////////////////
	public byte getDano() {
		return dano;
	}

	public void setDano(byte dano) {
		this.dano = dano;
	}

	public byte getVel() {
		return vel;
	}

	public void setVel(byte vel) {
		this.vel = vel;
	}

	public byte getForca() {
		return forca;
	}

	public void setForca(byte forca) {
		this.forca = forca;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
}
