// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  // Main.java
import java.beans.Expression;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Doacao> doacoes = new ArrayList<>();
    private static ArrayList<Beneficiario> beneficiarios = new ArrayList<>();

    public static void main(String[] args, int opcao) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Registrar Doação");
            System.out.println("3. Registrar Beneficiário");
            System.out.println("4. Exibir Total de Doações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            scanner.nextLine(); 
        }      
            
   switch (opcao) {
      case 1:
        cadastrarLivro(scanner);
              break;
      case 2:
         registrarDoacao(scanner);
              break;
     case 3:
         registrarBeneficiario(scanner);
              break;
    case 4:
        exibirGestaoDoacoes();
               break;
    case 5:
        System.out.println("Tudo Pronto!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    
    

    private static void exibirGestaoDoacoes() {
	}



	private static void registrarBeneficiario(Scanner scanner) {
	}



	private static void registrarDoacao(Scanner scanner) {
	}



	private static void cadastrarLivro(Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
    }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
 
