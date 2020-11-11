programa
{
	/*3-	Solicitar a idade de várias pessoas e imprimir: 
	 * Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
	 * O programa termina quando idade for =-99. (Enquanto)
	 */ 
	funcao inicio()
	{
		 inteiro idade = 0, menor = 0, maior = 0
		 enquanto(idade  != -99){
			escreva("Informe a idade: ")
			leia(idade)
			se(idade>50){
				maior++
			}senao se(idade> 0 e idade < 21){
				menor++
			}
			limpa()
		}
		escreva("\nTotal de pessoal com menos de  21 anos: ",menor)
		escreva("\nTotal de pessoas com mais de 50 anos:   ",maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */