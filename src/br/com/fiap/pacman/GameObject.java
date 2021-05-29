package br.com.fiap.pacman;

public class GameObject {

	private int posicaoX;
	private int posicaoY;
	private int tamanhoPixelTela;

	public GameObject() {
		// TODO Auto-generated constructor stub
	}

	public GameObject(int posicaoX, int posicaoY) {
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

	public int getTamanhoPixelTela() {
		return tamanhoPixelTela;
	}

	public void setTamanhoPixelTela(int tamanhoPixelTela) {
		if (tamanhoPixelTela >= 0) {

			this.tamanhoPixelTela = tamanhoPixelTela;

		}

	}

}
