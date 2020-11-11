programa
{
	/*1)	Desenvolva um sistema em que:
	*Leia 4 (quatro) números;
	*Calcule o quadrado de cada um;
	*Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	*Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	*/
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real num1, num2, num3, num4, quad1, quad2 = 0.0, quad3 = 0.0, quad4 = 0.0

		enquanto(quad3<1000){
			escreva("\nDigite o primeiro número: ")
			leia(num1)
			escreva("\nDigite o segundo número: ")
			leia(num2)	
			escreva("\nDigite o terceiro número: ")
			leia(num3)
			escreva("\nDigite o quarteiro número: ")
			leia(num4)
			quad1 = mat.potencia(num1, 2.0)
			quad2 = mat.potencia(num2, 2.0)
			quad3 = mat.potencia(num3, 2.0)
			quad4 = mat.potencia(num4, 2.0)
			se(quad3>=1000){
				escreva("\nO quadrado de  ",num3," é : ",quad3)
			}senao{
				escreva("\nO quadrado de  ",num1," é : ",quad1)
				escreva("\nO quadrado de  ",num2," é : ",quad2)
				escreva("\nO quadrado de  ",num3," é : ",quad3)
				escreva("\nO quadrado de  ",num4," é : ",quad4)
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */