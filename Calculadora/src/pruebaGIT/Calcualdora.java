package pruebaGIT;
// Probando comando PULL
public class Calcualdora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=4, num2=7;
System.out.println("Calculadora basica");
int suma=Sumar(num1, num2);
System.out.println("Suma "+suma);
int resta=Restar(num1, num2);
System.out.println("Resta "+resta);
	}
public static int Sumar(int n1, int n2) {
	return n1+n2;
}
public static int Restar(int n1, int n2) {
	return n1-n2;
}
public static int Multiplicar(int n1, int n2){
	return n1*n2;
}
}
