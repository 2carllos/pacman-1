package br.com.fiap.pacman;
import java.util.Random;

public class Ghost extends GameObject {

	private int posicaoX;
	private int posicaoY;
	private int tamanhoPixelTela;
	private double posicaoAtual;
	private double grauDirecao;

	public boolean podeMover() {
		if (this.posicaoAtual <= getTamanhoPixelTela()) {
			return true;
		} else {
			return false;
		}

	}

//
//	public double playerMover() {
//		if (podeMover()) {
//			Random random = new Random();
//			double n = random.nextInt((int) posicaoAtual);
//			return this.posicaoAtual;
//		} else {
//			return posicaoAtual;
//		}
//
//	}
//	
	public double GhostMover() {
		if (podeMover()) {
			Random random = new Random();
			posicaoAtual = random.nextInt(10);
			return posicaoAtual;
		} else {
			return posicaoAtual;
		}

	}

	public Ghost() {

	}

	public Ghost(int posicaoX, int posicaoY, double grauDirecao) {
		if (posicaoX >= 0 && posicaoY >= 0 && grauDirecao >= 0) {

			this.posicaoX = posicaoX;
			this.posicaoY = posicaoY;
			this.grauDirecao = grauDirecao;

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

	public double getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(double posicaoAtual) {
		if (posicaoAtual >= 0) {
			this.posicaoAtual = posicaoAtual;
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

}
