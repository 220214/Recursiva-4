package controller;

public class Negativo {

	public Negativo() {
		super();
	}
	public int QNeg(int []vt,int num) {
		// se a posição for zero ele retorna 0
		if(num==0) {
			return 0;
			// como o tamanho começa com um por isso num -1, verifico aqui se o valor e negativo
		//cada vez que for negativo vai acumular 1 e chama a recursiva para verificar os outros
		}else if (vt[num-1]<0) {
			return 1+ QNeg(vt, num -1);
			//aqui se não for negativo ele chama a recursiva para verificar os outros vetores sem acumular
		}else {
			return QNeg(vt, num-1);
		}
	}

}
