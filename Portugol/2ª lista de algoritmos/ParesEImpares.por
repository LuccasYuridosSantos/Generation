programa
{
	//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (Para)
	funcao inicio()
	{
		inteiro vetor[10], pares =0 , impares = 0

		para(inteiro i=0; i < 10; i++){
			escreva("\nDigite o ", i+1, "° numero: ")
			leia(vetor[i])
		}

		para(inteiro i=0; i < 10; i++){
			
			se(vetor[i]%2 == 0){
				pares++
			}senao{
				impares++
			}
		}

		escreva("\nQuantidade de pares: ", pares)
		escreva("\nQuantidade de impares: ", impares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */