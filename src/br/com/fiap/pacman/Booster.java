package br.com.fiap.pacman;

public class Booster extends Item {

	private boolean invisivel = false;
	private int posicaoX;
	private int posicaoY;
	private double tempoInv;

	public Booster() {
		// TODO Auto-generated constructor stub
	}

	public Booster(int posicaoX, int posicaoY) {

		if (posicaoX >= 0 && posicaoY >= 0 && tempoInv >= 0) {
			//this.invisivel = invisivel;
			this.posicaoX = posicaoX;
			this.posicaoY = posicaoY;
			//this.tempoInv = tempoInv;
		}

	}

	public boolean isInvisivel() {
		return invisivel;
	}

	public void setInvisivel(boolean invisivel) {
		this.invisivel = invisivel;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		if (posicaoX >= 0) {
			this.posicaoX = posicaoX;
		}

	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		if (posicaoY >= 0) {
			this.posicaoY = posicaoY;
		}

	}

	public double getTempoInv() {
		return tempoInv;
	}

	public void setTempoInv(double tempoInv) {
		if (tempoInv >= 0) {
			this.tempoInv = tempoInv;
		}

	}

}
