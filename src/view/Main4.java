package view;

import controller.Negativo;

public class Main4 {

	public static void main(String[] args) {
		int []vt = {-7,-6,0,1,2,-5,-4};
		Negativo n=new Negativo();
		int qneg= n.QNeg(vt, vt.length);// vt.lenghth faz a contagem do vetor 
		System.out.println("A quantidade de números negativos no vetor e "+ qneg);
	}

}
