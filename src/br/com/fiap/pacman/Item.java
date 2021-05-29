package br.com.fiap.pacman;

public class Item extends GameObject {

	private boolean invisivel = false;
	private int posicaoX;
	private int posicaoY;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int posicaoX, int posicaoY) {
		if (posicaoX >= 0 && posicaoY >= 0) {

			this.posicaoX = posicaoX;
			this.posicaoY = posicaoY;

		}
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

}
