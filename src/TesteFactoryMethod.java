package atividadeFactory;

public class TesteFactoryMethod {

	public static void main(String[] args) {
		LivroFactory factory = new LivroFactory();

		Livro livro1 = factory.criarLivro(new EditoraErica());
		System.out.println(livro1.getTitulo()); // imprime "JavaScript Descomplicado - Editora Erica"
	
		Livro livro2 = factory.criarLivro(new FabricaEditoraModerna());
		System.out.println(livro2.getTitulo()); // imprime "Dom Casmurro - Editora Moderna"
		
		Livro livro3 = factory.criarLivro(new FabricaEditoraUnesp());
		System.out.println(livro3.getTitulo()); // imprime "Discurso de Ódio - Editora UNESP"
		
		Livro livro4 = factory.criarLivro(new FabricaEditoraSaraiva());
		System.out.println(livro4.getTitulo()); // imprime "A Biblioteca da Meia-Noite - Editora Saraiva"
	}
	
}