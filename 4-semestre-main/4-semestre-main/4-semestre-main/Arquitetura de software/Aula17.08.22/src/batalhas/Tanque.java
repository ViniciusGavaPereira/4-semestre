package batalhas;

public class Tanque implements Posicao, Cor, Canhao {

	private float x, y;
	private CoresRGB corTanque, corCanhao;

	@Override
	public void atirar() {
		System.out.println("Atirando...");
	}

	@Override
	public void setCorTanque(CoresRGB corTanque) {
		this.corTanque = corTanque;
	}

	@Override
	public void setCorCanhao(CoresRGB corCanhao) {
		this.corCanhao = corCanhao;
	}

	@Override
	public CoresRGB getCorCanhao() {
		return null;
	}

	@Override
	public CoresRGB getCorTanque() {
		return null;
	}

	@Override
	public void setX(float x) {
		this.x = x;
	}

	@Override
	public void setY(float y) {
		this.y = y;

	}

	@Override
	public float getX() {
		return this.x;
	}

	@Override
	public float getY() {
		return this.y;
	}


}
