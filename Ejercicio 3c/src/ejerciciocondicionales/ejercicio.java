package ejerciciocondicionales;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Introduce un numero");
		int c = Integer.parseInt(a);
		int resto2 = c%2;
		int resto5 = c%5;
		int resto10 = c%10;
		if(c > -1){
			//System.out.println("Tu numero es positivo");
			if(resto2==0){
				//System.out.println("Tu numero es par.");
				if (resto5==0){
					//System.out.println("tu numero es multiple de 5");
					if (resto10==0){
						//System.out.println("Tu numero es mulitiple de 10");
						if (c>100){
							System.out.println("Tu  numero es positivo, par, multiple de 5, multiple de 10 y  es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, par, multiple de 5, multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("Tu numero no es multiple de 10");
						if(c>100){
							System.out.println("Tu numero es positivo, par, multiple de 5, no es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, par, multiple de 5, no es multiple de 10 y es menor de 100");
						}
					}
				}else{
					//System.out.println("Tu numero no es multiple de 5");
					if (resto10==0){
						//System.out.println("Tu numero es multuiple de 10");
						if(c>100){
							System.out.println("Tu numero es positivo, par, no es multiple de 5, es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, par, no es multiple de 5, es multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("Tu numero no es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es positivo, par, no es multiple de 5, no es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, par, no es multiple de 5, no es multiple de 10 y es menor de 100");
						}
					}
				}
			}else{
				//System.out.println("Tu numero es impar");
				if(resto5==0){
					//System.out.println("Tu numero es multiple de 5");
					if (resto10==0){
						//System.out.println("Tu nuemro es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es positivo, impar, es multiple de 5, multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, impar, es multiple de 5, es multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("tu numero no es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es positivo, impar, es multiple de 5, no es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, impar, es multiple de 5, no es multiple de 10 y es menor de 100");
						}
					}
				}else{
					//System.out.println("Tu numero no es multiple de 5");
					if (resto10==0){
						//System.out.println("Tu numero es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es positivo, impar, no es multiple de 5, es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es positivo, impar, no es multiple de 5, es multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("Tu numero no es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es positivo, impar, no es multiple de 5, no es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es posisitvo, impar, no es multiple de 5, no es multipple de 10 y es menor de 100");
						}
					}
				}
			}
		}else{
			//System.out.println("Tu numero es negativo");
			if(resto2==0){
				//System.out.println("Tu numero es par");
				if (resto5 == 0){
					//System.out.println("Tu numero es multiple de 5");
					if (resto10==0){
						//System.out.println("Tu numero es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es negativo, par, multiple de 5, multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, par, multiple de 5, multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("Tu numero no es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es negativo, par, multiple de 5, no es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, par, multiple de 5, no es multiple de 10 y es menor de 100");
						}
					}
				}else{
					//System.out.println("Tu numero no es multiple de 5");
					if(resto10==0){
						//System.out.println("Tu numero es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es negativo, par, no es multiple de 5, es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, par, no es multiple de 5, es multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("tu numero no es multiple de 10");
						if(c>100){
							System.out.println("Tu numero es negativo, par, no es multiple de 5, no es multiple de 10 y es es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, par, no es multiple de 5, no es multiple de 10 y es menor de 100");
						}
					}
				}
			}else{
				//System.out.println("Tu numero es impar");
				if (resto5 == 0){
					//System.out.println("Tu numero es multiple de 5");
					if (resto10==0){
						//System.out.println("Tu numero es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es negativo, impar, es multiple de 5, es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, impar, es multiple de 5, es multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("Tu numero no es multiple de 10");
						if(c>100){
							System.out.println("Tu numero es negativo, impar, es multiple de 5, no es multiple de 10 y es mayor que 100");
						}else{
							System.out.println("Tu numero es negativo, impar, es multiple de 5, no es multiple de 10 y es menor que 100");
						}
					}
				}else{
					//System.out.println("Tu numero no es multiple de 5");
					if(resto10==0){
						//System.out.println("Tu numero es multiple de 10");
						if(c>100){
							System.out.println("Tu numero es negativo, impar, no es multiple de 5, es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, impar, no es multiple de 5, es multiple de 10 y es menor de 100");
						}
					}else{
						//System.out.println("Tu numero no es multiple de 10");
						if (c>100){
							System.out.println("Tu numero es negatgivo, impar, no es multiple de 5, no es multiple de 10 y es mayor de 100");
						}else{
							System.out.println("Tu numero es negativo, impar, no es multiple de 5, no es multiple de 10 y es menor de 100");
						}
					}
				}
			}
		}

	}

}