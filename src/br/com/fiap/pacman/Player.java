package br.com.fiap.pacman;

public class Player extends GameObject {

	private double grauDirecao;
	private int qtdVida;
	private boolean invisivel = false;
	private double posicaoAtual = getPosicaoX() + getPosicaoY() + grauDirecao;
	private int posicaoX;
	private int posicaoY;

	public boolean podeMover() {
		if (this.posicaoAtual <= getTamanhoPixelTela()) {
			return true;
		} else {
			return false;
		}

	}

	public double playerMover() {
		if (podeMover()) {
			return this.posicaoAtual += 100000;
		} else {
			return posicaoAtual;
		}

	}

	public Player() {

	}
	
	
	public Player(int posicaoX, int posicaoY, double grauDirecao) {
		if (posicaoX >= 0 && posicaoY >= 0 && grauDirecao >= 0) {

			this.posicaoX = posicaoX;
			this.posicaoY = posicaoY;
			this.grauDirecao = grauDirecao;

		}
	}

	public double getGrauDirecao() {
		return grauDirecao;
	}

	public void setGrauDirecao(double grauDirecao) {
		if (grauDirecao >= 0) {
			this.grauDirecao = grauDirecao;

		}

	}

	public int getQtdVida() {
		return qtdVida;
	}

	public void setQtdVida(int qtdVida) {
		if (qtdVida >= 0) {

			this.qtdVida = qtdVida;
		}

	}

	public boolean isInvisivel() {
		return invisivel;
	}

	public void setInvisivel(boolean invisivel) {
		this.invisivel = invisivel;
	}

	public double getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(double posicaoAtual) {
		if (posicaoAtual >= 0) {
			this.posicaoAtual = posicaoAtual;
		}

	}
	

}
