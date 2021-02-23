import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int opcao = 0;
        Pilha minhaPilha = new Pilha();
        Funcionario f;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        do
        {
            try
            {
            	System.out.println("\n\n Escolha: 1-> empilha 2->desempilha " +
                " 3->topo 4-> tamanho 5->  Somar  6-> Listar " +
                "7 -> remover a base  9-> sair : ");
                opcao = Integer.parseInt(scan.nextLine());
                if (opcao == 1)
                {
                    f = new Funcionario();

                    System.out.println(">>Digite o nome que deseja empilhar: ");
                    f.nome = scan.nextLine();

                    System.out.println(">>Digite o salário que deseja empilhar: ");
                    f.salario = Double.parseDouble(scan.nextLine());
                    minhaPilha.Empilha(f);
                }
                else if (opcao == 2)
                {
                    f = minhaPilha.Desempilha();
                    System.out.println(">>Desempilhado: " + f.nome + f.salario + "\n\n");
                }
                else if (opcao == 3)
                {
                    f = minhaPilha.RetornaTopo();
                    System.out.println(">>Topo: " + f.nome + f.salario + "\n\n");

                    System.out.println(">>Tipo: " + minhaPilha.RetornaTopo().nome + "\r\n" + minhaPilha.RetornaTopo().salario + "\n\n");
                }
                else if (opcao == 4)
                {
                	System.out.println(">>Tamanho da pilha: " + minhaPilha.Tamanho());
                }
                else if (opcao== 5)
                {
                    double soma = 0;
                    Pilha pilhaAux = new Pilha();
                    while (minhaPilha.Tamanho() > 0)
                    {
                        soma += minhaPilha.RetornaTopo().salario;                            
                        pilhaAux.Empilha(minhaPilha.Desempilha());
                    }

                    while (pilhaAux.Tamanho() > 0)
                        minhaPilha.Empilha(pilhaAux.Desempilha());

                    System.out.println("Soma: " + soma);
                }
                else if (opcao == 6)
                {

                    Pilha pilhaAux = new Pilha();
                    while (minhaPilha.Tamanho() > 0)
                    {
                    	System.out.println(minhaPilha.RetornaTopo().nome + minhaPilha.RetornaTopo().salario + "\n\n");

                        pilhaAux.Empilha(minhaPilha.Desempilha());
                    }

                    while (pilhaAux.Tamanho() > 0)
                        minhaPilha.Empilha(pilhaAux.Desempilha());                     
                }
                else if (opcao == 7)
                {
                    Pilha pilhaAux = new Pilha();
                    while (minhaPilha.Tamanho() > 1)
                        pilhaAux.Empilha(minhaPilha.Desempilha());

                    System.out.println(minhaPilha.RetornaTopo().nome + "\r\n" + minhaPilha.RetornaTopo().salario + "\n\n");
                    minhaPilha.Desempilha();
                                           
                    while (pilhaAux.Tamanho() > 0)
                        minhaPilha.Empilha(pilhaAux.Desempilha());
                }
                else if (opcao == 9)
                {
                    // sai do programa
                }
            }
            catch (Exception erro)
            {
                System.out.println("ERRO: " + erro.getMessage());
            }
        }
        while (opcao != 9);
    }
}
