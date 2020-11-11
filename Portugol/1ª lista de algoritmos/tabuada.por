programa
{
	/* ULTILIZANDO APENAS OS CONCEITOS APRENDIDOS REFERENTE A LAÇOS DE REPETIÇÕES(PARA, ENQUANTO E FAÇA ENQUANDO): 
	 *  Desenvolva um algoritmo que receba qualquer numero maior que 0 e imprima a sua respectiva tabuada. 
	 *  Exemplo de entrada: Usuário digita 2, Exemplo de saída: 2x0=0, 2x1=2, 2x2=4... até 2x10=20  
	 */
	funcao inicio()
	{
		inteiro numero;

		escreva("Digite o Numero que deseja saber a tabuada: ")
		leia(numero)
		se(numero>0){
			para(inteiro i=0; i <= 10; i++){
				escreva("\n",numero, " x ", i," = ",numero*i)
			}
		}senao{
			escreva("\nNumero invalido!!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 592; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */