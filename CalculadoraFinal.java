import java.util.Scanner;

public class CalculadoraFinal {
	final static Scanner TECLADO=new Scanner(System.in);
	
	  public static void main(String[]args) {
		   int opcion;
		   do {
			   System.out.println("\n Menu Principal");
				System.out.println("\n Elija una opcion (numero)");
				System.out.println("1) Calculadora Basica");
				System.out.println("2) Calculadora de Numeros Complejos");
				System.out.println("3) Calculadora Cientifica");
				System.out.println("4) Calculadora de Matrices");
				System.out.println("0) Salir \n");
				opcion=TECLADO.nextInt();
				switch (opcion) {
				case 1: {
					 CalculadoraInicial();
					 break;
					 }
				
				case 2: {
					   CalculadoraCompleja();
					   break;
					 }
				
				case 3: {
					   CalculadoraCientifica();
					   break;
					 }
				
				case 4: {
					   CalculadoraMatrices();
					   break;
					 }
				
				}
				
				}while(opcion!=0);
		  
	
	
		   System.out.println("Apagando Calculadora...");
		   
	   }
	   	private static void CalculadoraInicial() {
		   double n1, n2, sol;  
		   int opcion;
   


		   do{
			   System.out.println("\n Calculadora Basica");
			   System.out.println("\n Escribe una opcion(numero): ");
			   System.out.println("1) Suma");
			   System.out.println("2) Resta");
			   System.out.println("3) Multiplicación");
			   System.out.println("4) División ");
			   System.out.println("0) MENU PRINCIPAL \n");
	
			   opcion=TECLADO.nextInt();
	
			   switch(opcion) {
			   case 1:
				   n1=leerParametros("Introduzca el primer sumando: ");		    	
				   n2=leerParametros("Introduzca el segundo sumando: ");
	    		sol=n1+n2;
	    		System.out.println("La suma de "+n1+" y "+n2+" es "+sol);
	    		break;
			   case 2:
				   n1=leerParametros("Introduzca el primer restando: ");		    	
				   n2=leerParametros("Introduzca el segundo restando: ");
				   sol=n1-n2;
				   System.out.println("La resta de "+n1+" y "+n2+" es "+sol);
				   break;
			   case 3:
				   n1=leerParametros("Introduzca el primer factor: ");		    	
				   n2=leerParametros("Introduzca el segundo factor: ");
				   sol=n1*n2;
				   System.out.println("La multiplicacion de "+n1+" y "+n2+" es "+sol);
				   break;
			   case 4:
				   n1=leerParametros("Introduzca el dividendo: ");		    	
				   n2=leerParametros("Introduzca el divisor: ");
				   sol=n1/n2;
				   if(n2==0)
					   System.out.println("ERROR. No se puede dividir entre: "+n2);
					
				   else
				   System.out.println("La division de "+n1+" y "+n2+" es "+sol);
				   break;
			   }
	
	
		   }while(opcion!=0);

	   }
	   	private static void CalculadoraCompleja() {
		   int opcion;
			double mod, arg, m1, m2, n1, n2, n3, n4, solr, soli; 
	
			
			do{
				System.out.println("\n Calculadora Compleja");
				System.out.println("\n Escribe una opcion(numero): ");
				System.out.println("1) Suma");
				System.out.println("2) Resta");
				System.out.println("3) Multiplicacion");
		        System.out.println("4) Division ");
		        System.out.println("5) Binómica-polar ");
		        System.out.println("6) Polar-binómica");
		        System.out.println("0) MENU PRINCIPAL");
				
				opcion=TECLADO.nextInt();
				
				switch(opcion) {
				    case 1:
				    	System.out.println("Primer numero complejo");
				    		n1=leerParametros("Introduzca el parametro real: ");
				    		n2=leerParametros("Introduzca el parametro imaginario: ");
				    	System.out.println("Segundo numero complejo");
					    	n3=leerParametros("Introduzca el parametro real: ");
					    	n4=leerParametros("Introduzca el parametro imaginario: ");
				    		solr=n1+n3;
				    		soli=n2+n4;
				    	System.out.println("La suma de los dos numeros complejos es ("+solr+","+soli+")");
				    	break;
				    case 2:
				    	System.out.println("Primer numero complejo");
				    	System.out.println("Introduzca el parametro real: ");
				    		n1=leerParametros("Introduzca el parametro real: ");
				    		n2=leerParametros("Introduzca el parametro imaginario: ");
				    	System.out.println("Segundo numero complejo");
					    System.out.println("Introduzca el parametro real: ");
					    	n3=leerParametros("Introduzca el parametro real: ");
					    	n4=leerParametros("Introduzca el parametro imaginario: ");
				    		solr=n1-n3;
				    		soli=n2-n4;
				    	System.out.println("La resta de los dos numeros complejos es ("+solr+","+soli+")");
			    		break;
				    case 3:
				    	System.out.println("Primer numero complejo");
				    		n1=leerParametros("Introduzca el parametro real: ");
				    		n2=leerParametros("Introduzca el parametro imaginario: ");
				    	System.out.println("Segundo numero complejo");
					    System.out.println("Introduzca el parametro real: ");
					    	n3=leerParametros("Introduzca el parametro real: ");
					    	n4=leerParametros("Introduzca el parametro imaginario: ");
				    		solr=n1*n3-n2*n4;
				    		soli=n1*n4+n2*n3;
				    	System.out.println("La multiplicacion de los dos numeros complejos es ("+solr+","+soli+")");
		    			break;
				    case 4:
				    	System.out.println("Primer numero complejo");
				    		n1=leerParametros("Introduzca el parametro real: ");
				    		n2=leerParametros("Introduzca el parametro imaginario: ");
				    	System.out.println("Segundo numero complejo");
					    	n3=leerParametros("Introduzca el parametro real: ");
					    	n4=leerParametros("Introduzca el parametro imaginario: ");
				    		solr=(n1*n3+n2*n4)/(n3*n3+n4*n4);
				    		soli=(n2*n3-n1*n4)/(n3*n3+n4*n4);
				    	System.out.println("La division de los dos numeros complejos es ("+solr+","+soli+")");
		    			break;
				    case 5:
				    	System.out.println("Introduzca el parametro real: ");
				    		m1=leerParametros("Introduzca el parametro real: ");
				    		m2=leerParametros("Introduzca el parametro imaginario: ");
					    	mod=Math.sqrt(m1*m1+m2*m2);
					    	arg=Math.toDegrees(m2/m1);
				    
				    	System.out.println("La forma polar resultante es Modulo: "+mod+" y argumento "+arg);
		    			break;
				    case 6:
			    			mod=leerParametros("Introduzca el modulo: ");
			    			arg=leerParametros("Introduzca el argumento: ");
			    			m1=mod*Math.cos(arg);
			    			m2=mod*Math.sin(arg);
			    
			    		System.out.println("La forma binomica resultante es : ("+m1+","+m2+")");
		    			break;
				}
				
				
				
				
			}while(opcion!=0);
			   
	
		   
	   }
	   	private static void CalculadoraCientifica() {
			int opcion, e;
			double sol, N, ind; 
			
	
			
			do{
				System.out.println("\n Calculadora Cientifica");
				System.out.println("\n Escribe una opcion(numero): ");
				System.out.println("1) Factorial"); 
				System.out.println("2) Factorial(recursiva)");
				System.out.println("3) Potencia");
				System.out.println("4) Potencia(recursivo)");
				System.out.println("5) Potencia base e");
		     	System.out.println("6) Raiz n-ésima");
		    	System.out.println("7) Inverso");
				System.out.println("8) Logaritmo neperiano");
				System.out.println("9) Logaritmo decimal");
				System.out.println("10) Seno");
				System.out.println("11) Coseno");
		     	System.out.println("12) Tangente");
				System.out.println("13) ArcoSeno");
				System.out.println("14) ArcoCoseno");
		     	System.out.println("15) ArcoTangente");
				System.out.println("16) Seno hiperbolico");
				System.out.println("17) Coseno hiperbolico");
		     	System.out.println("18) Tangente hiperbolico");
		     	System.out.println("0) MENU PRINCIPAL \n");
				
				opcion=TECLADO.nextInt();
				
				switch(opcion) {
				    case 1:
			
				    		N=leerParametros("Introduzca un número (entero): ");
				    		sol=1;
				    		for(int i=1;i<=N;i++) {
				    			sol=sol*i;		    			
				    		}
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 2:
				    	N=leerParametros("Introduzca un número (entero): ");
				    	Factorial(N);
				    	System.out.println("El resultado es: "+ Factorial(N));
				    	break;
				    case 3:	 
			
				    		N=leerParametros("Introduzca la base: ");
				    		ind=leerParametros("Introduzca el exponente: ");
				    		sol=Math.pow(N, ind);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 4:
				    	N=leerParametros("Introduzca la base: ");
			    		e=leerParametrosEnteros("Introduzca el exponente (entero): ");
			    		System.out.println("El resultado es: "+ Potencia(N, e));
				    	break;
				    case 5:
			
			    			ind=leerParametros("Introduzca el exponente: ");
			    			sol=Math.expm1(ind)+1;
			    		
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 6:
				    	do {

				    		ind=leerParametros("Introduzca un radical positivo: ");
				    	}while(ind<=0);
				    	if(ind%2==0) {
				    		do {
			    				N=leerParametros("Introduzca un radicando positivo: ");
				    		}while(N<0);
				    	}
				    	else {
		    				N=leerParametros("Introduzca el radicando: ");
				    	}
			    		sol=Math.pow(N,1/ind);
				    	
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 7:
				    		N=leerParametros("Introduzca un número: ");
				    		sol=1/N;
				    	
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 8:
				    	do {
				    		N=leerParametros("Introduzca un número positivo: ");
				    	}while(N<0);
				    	sol=Math.log(N);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 9:
				    	do {

					    	N=leerParametros("Introduzca un número positivo: ");
					    	}while(N<0);
					    	sol=Math.log10(N);
					
					    	System.out.println("El resultado es: "+ sol);
					    	break;
				    case 10:
				    	  	N=leerParametros("Introduzca un número: ");
				    	sol=Math.sin(N);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 11:
				       		N=leerParametros("Introduzca un número: ");
				       		sol=Math.cos(N);
			
				       	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 12:
				       		N=leerParametros("Introduzca un número: ");
			    	  		sol=Math.tan(N);
			
			    		System.out.println("El resultado es: "+ sol);
				    	break;
				    case 13:
				    		N=leerParametros("Introduzca un número: ");
			    	  		sol=Math.asin(N);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 14:
				    		N=leerParametros("Introduzca un número: ");
			    	  		sol=Math.acos(N);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 15:
				    		N=leerParametros("Introduzca un número: ");
				    		sol=Math.atan(N);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 16:
				    		N=leerParametros("Introduzca un número: ");
			    	  		sol=Math.sinh(N);
				
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 17:
				    		N=leerParametros("Introduzca un número: ");
				    		sol=Math.cosh(N);
				    	System.out.println("El resultado es: "+ sol);
				    	break;
				    case 18:
				    		N=leerParametros("Introduzca un número: ");
			    	  		sol=Math.tanh(N);
			    		
				    	System.out.println("El resultado es: "+ sol);
				    	break;
			
				}
				
				
			}while(opcion!=0);
			

	
	   }
	   	private static void CalculadoraMatrices() {
			
			
			int opcion, c1, f1, c2, f2;
			float Dt;
			do {
				System.out.println("\n Calculadora De Matrices");
				System.out.println("\n CALCULADORA DE MATRICES");
				System.out.println("1) Suma");
				System.out.println("2) Resta");
				System.out.println("3) Multiplicación");
				System.out.println("4) Transpuesta");
				System.out.println("5) Adjunta (Sólo orden 2 y 3)");
				System.out.println("6) Inversa (Sólo orden 2 y 3)");
				System.out.println("0) MENU PRINCIPAL\n");
				opcion=TECLADO.nextInt();
				

				
			switch (opcion) {
				
				case 1 : {   //SUMA
					System.out.println("Suma");
					System.out.println(" Suma de dos matrices : a(m,n)+ b(p,q)");
					System.out.println(" Recuerde que las dos matrices "
							+ " deben tener las mismas dimensiones ");
					f1=leerParametrosEnteros("Escriba las filas de las matrices");
					c1=leerParametrosEnteros("Escriba las columnas de las matrices");
					
					
						float[][] suma = new float[f1][c1];
						float[][] a =leerMatriz(" Introduzca la matriz a", f1, c1);
						float[][] b =leerMatriz(" Introduzca la matriz b", f1, c1);
						// Impresion de las matrices a y b a sumar
						System.out.println("\n Matriz a \n");
						ImpMatrices(a);
						System.out.println("\n Matriz b \n");
						ImpMatrices(b);
					
						System.out.println("\n Matriz Suma \n");
						for (int i = 0; i < f1; i++) {
							for (int j = 0; j < c1; j++) {
								suma[i][j] = a[i][j] + b[i][j];
							}
				        }   
						ImpMatrices(suma);
				        
					break;
		        }
				case 2 : {   //RESTA
					System.out.println("Resta");
					System.out.println(" Resta de dos matrices : a(m,n)+ b(p,q)");
					System.out.println(" Recuerde que las dos matrices "
							+ " deben tener las mismas dimensiones ");
					f1=leerParametrosEnteros("Escriba las filas de las matrices");
					c1=leerParametrosEnteros("Escriba las columnas de las matrices");
					float[][] resta = new float[f1][c1];
					float[][] a =leerMatriz(" Introduzca la matriz a", f1, c1);
					float[][] b =leerMatriz(" Introduzca la matriz b", f1, c1);
				
			 // Impresion de las matrices a y b a restar
					System.out.println("\n Matriz a \n");
					ImpMatrices(a);
					System.out.println("\n Matriz b \n");
					ImpMatrices(b);
						// resta e impresion de la matriz resta
						System.out.println("\n Matriz Resta \n");
						for (int i = 0; i < f1; i++) {
							for (int j = 0; j < c1; j++) {
								resta[i][j] = a[i][j] - b[i][j];
								
							} 
				        }   
						ImpMatrices(resta);
				
				        }
					break;
		        
				case 3 : {
					
					   do {
					f1=leerParametrosEnteros("Escriba las filas de la primera matriz");
					c1=leerParametrosEnteros("Escriba las columnas de la primera matriz");
					f2=leerParametrosEnteros("Escriba las filas de la segunda matriz");
					c2=leerParametrosEnteros("Escriba las columnas de la segunda matriz");
				
					
					   }while(c1!=f2);
					   
					   float[][] a=leerMatriz("Añada los datos de la matriz a: ", f1, c1);
					   float[][] b=leerMatriz("Añada los datos de la matriz b: ", f2, c2);
					   float[][] s=new float[f1][c2];
						System.out.println("\n Matriz a \n");
						ImpMatrices(a);
						System.out.println("\n Matriz b \n");
						ImpMatrices(b);
			
					   for(int i=0;i<f1;i++) {
						   
					   for(int j=0;j<c2;j++) {
						   
						   for(int k=0;k<c1;k++) {
						
							   s[i][j] = a[i][k]*b[k][j];	
								
						   }
						 
					   }
					   }
					   System.out.println("\n Matriz Producto \n");
					   ImpMatrices(s);
					
				   }
				case 4:{
					f1=leerParametrosEnteros("Añada las filas de la matriz");
					c1=leerParametrosEnteros("Añada las columnas de la matriz");
					float[][] a = leerMatriz("Añada los datos de la matriz",f1,c1);
					System.out.println("La matriz es: ");
					ImpMatrices(a);
					System.out.println("La traspuesta de la matriz es: ");
					ImpMatrices(transpuesta(a));
			        
				break;
				}
				case 5:{
					
				System.out.println("Determine el orden de la matriz(2 o 3): ");				
				int orden=TECLADO.nextInt();
				do {
					if(orden!=2 && orden!=3) {
						
				
					System.out.println("El orden "+orden+" no esta disponible. "+
							"Pruebe otra vez");
					}
				
				}while(orden!=2 && orden!=3);
				
				f1=orden;
				c1=orden;
					
				 float[][] a = leerMatriz("Añada los datos de la matriz",f1,c1);
				  System.out.println("La matriz es: ");
				  	ImpMatrices(a);
				  System.out.println("La adjunta de la matriz es: ");
				  	ImpMatrices(adjunta(a));
					break;
				}
				case 6:{
					System.out.println("Determine el orden de la matriz(2 o 3): ");				
					int orden=TECLADO.nextInt();
					do {
						if(orden!= 2&& orden!=3) {
							System.out.println("El orden "+orden+" no esta disponible. "+
									"Pruebe otra vez");
					}
				
					}while(orden!=2 && orden!=3);
					
					f1=orden;
					c1=orden;
					float[][] a = leerMatriz("Añada los datos de la matriz",f1,c1);
					 System.out.println("La matriz es: ");
					  	ImpMatrices(a);
					if(orden==2) {
						Dt=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
						a=transpuesta(a);
						a=adjunta(a);
						
						for(int i=0; i<a.length; i++) {
							for(int j=0; j<a[0].length; j++) {
							 a[i][j]=a[i][j]/Dt;
							 
							}
						}
					}
					if(orden==3) {
					
					Dt=a[0][0]*a[1][1]*a[2][2]+a[1][0]*a[2][1]*a[0][2]+a[0][1]*a[1][2]*a[2][0]-
							(a[2][0]*a[1][1]*a[0][2]+a[2][1]*a[1][2]*a[0][0]+a[0][1]*a[1][2]*a[2][0]);
					
					a=transpuesta(a);
					a=adjunta(a);
					
					for(int i=0; i<a.length; i++) {
						for(int j=0; j<a[0].length; j++) {
						 a[i][j]=a[i][j]/Dt;
						 
						}
					}
					}
					
					
					System.out.println("La inversa de la matriz es: ");
					ImpMatrices(a);
					
					break;
				}
			}			
				
			}while (opcion!=0);	
			
			System.out.println("MENU PRINCIPAL");
	   }
	     private static void ImpMatrices(float[][] I){
			for(int i=0; i<I.length; i++ ) {
				for(int j=0; j<I[0].length; j++) {
					System.out.print(I[i][j] + " ");
			   } System.out.println();
		     }
		}
	   	 private static float [][] adjunta(float [][] M) {
		     float [][] A=new float [M.length][M[0].length];
				for(int i=0; i<M.length; i++ ) {
					for(int j=0; j<M[0].length; j++) {
						
						A[i][j]=M[i][j];
						
				   }
			     }
			if(M.length==2) {
				A[0][0]=M[1][1];
				A[0][1]=-M[0][1];
				A[1][0]=-M[1][0];
				A[1][1]=M[0][0];
				
			}
			else {
				A[0][0]=M[1][1]*M[2][2]-(M[1][2]*M[2][1]);
				
				A[0][1]=-(M[1][0]*M[2][2]-(M[1][2]*M[2][0]));
				
				A[0][2]=M[1][0]*M[2][1]-(M[2][0]*M[1][1]);
				
				A[1][0]=-(M[0][1]*M[2][2]-(M[2][1]*M[0][2]));
				
				A[1][1]=M[0][0]*M[2][2]-(M[2][0]*M[0][2]);
				
				A[1][2]=-(M[0][0]*M[2][1]-(M[2][0]*M[0][1]));
				
				A[2][0]=M[0][1]*M[1][2]-(M[1][1]*M[0][2]);
				
				A[2][1]=-(M[0][0]*M[1][2]-(M[1][0]*M[0][2]));
				
				A[2][2]=M[0][0]*M[1][1]-(M[1][0]*M[0][1]);
			}
			
		
			
			
				return A;
			}
	   	 private static float [][] leerMatriz(String txt, int f1, int c1) {
			
			System.out.println(txt);
			float [][] M=new float [f1][c1];
			for (int i = 0; i < f1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print("a(" + i + "," + j + ")=");
					M[i][j] = TECLADO.nextInt();
				} 
			} 
			return M;
		}
	     private static float [][] transpuesta(float [][] M) { 
			float [][] A=new float [M.length][M[0].length];
			
			for(int i=0; i<M.length; i++ ) {
				for(int j=0; j<M[0].length; j++) {
					
					A[i][j]=M[j][i];
					
			   }
			}
			return A;
		}
	     private static double leerParametros(String txt){
		    System.out.println(txt);
		   double numero=TECLADO.nextDouble();
		   
		   return numero;
		  }
	     private static int leerParametrosEnteros(String txt){

			   System.out.println(txt);
			   int numero=TECLADO.nextInt();
		
			   return numero;
		   }
	     private static double Potencia(double b, int e){
	    	 double valor;
	    	 if(e==0){
	    		 valor=1;
	    	 }else {
	    		 valor=b*Potencia(b, e-1);
	    	 }
	    	 return valor;
	     }
	     private static double Factorial(double N){
	    	 double valor;
	    	 if(N==0) {
	    		 valor=1;
	    	 }else{
	    		 valor=N*Factorial(N-1);
	    	 }
	    	 return valor;
	    	 }
}
