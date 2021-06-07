Algoritmo pseudocodigoEjercicio10
	Mientras num<1000 Hacer
		Escribir "Ingrese un numero"
		leer num;
		si num mod 6=0 Entonces
			n=n+1
		FinSi
		si num <11 y num>0 Entonces
			num=num+numPrim
			numPrim=num;
		FinSi
		num=num1+num;
		num1=num;
	FinMientras
	
	Escribir "la suma de los numero de 1 a 10 es de ",numPrim;
	Escribir "Los multiplos de 6 son ", n;
FinAlgoritmo
