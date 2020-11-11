programa
{
	/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
	 *  e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
	 *   ou seja, diagonal principal.
	 */
	funcao inicio()
	{
		real matriz[3][3], somaMat = 0.0, somaDiagonal = 0.0
		
		para(inteiro i = 0; i < 3; i++){
	 		para(inteiro j = 0; j < 3; j++){
	 			escreva("Informe o elemento da Matriz ", i+1 ,"ª linha, coluna ",j+1,": ")
	 			leia(matriz[i][j])
	 			limpa()
	 		}
	 	}

		para(inteiro i = 0; i < 3; i++){
	 		para(inteiro j = 0; j < 3; j++){
	 			somaMat += matriz[i][j]
	 			se(i == j){
	 				somaDiagonal += matriz[i][j]
	 			}
	 		}
	 	}

	 	escreva("\nA soma dos valores da matriz é: ", somaMat)
	 	escreva("\nA soma dos valores da diagonal principal da matriz é: ", somaDiagonal)
		
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */