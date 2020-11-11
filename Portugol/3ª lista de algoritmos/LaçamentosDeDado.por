programa
{
	/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado.
	 *  Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	 *  A seguir determine e imprima a média aritmética dos lançamentos, 
	 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	 */
	funcao inicio()
	{
		inteiro dado[10], maior = 0, rep = 0
		real media = 0.0, soma = 0.0
		para(inteiro i=0; i < 10; i++){
			escreva("\nInforme o valor do ", i+1," ° lançamento: ")
			leia(dado[i])
			limpa()
		}
		
		escreva("Os valores dos laçamentos: ")
		para(inteiro i=0; i < 10; i++){	
			se(i >= 9){
				escreva(dado[i])
			}senao{
				escreva(dado[i], ", ")
			}
			soma += dado[i]
			se(maior<dado[i]){
				maior = dado[i]
			}
		}

		para(inteiro i=0; i < 10; i++){
			se(maior == dado[i]){
				rep++
			}
		}
		media= soma/10.0
		 
		escreva("\nA média aritmética dos lançamentos: ", media)
		escreva("\nA ocorrências da maior pontuação foi: ", rep)
		
		
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */