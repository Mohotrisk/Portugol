package POO;

public class preguica extends Animal{
	 
	private String subirArvore;
	
	public preguica (String nome, int idade, String som, String subirArvore) 
	{
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}

	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}


	public void imprimirInfo()
	{
		System.out.println("\n*****DADOS DA PREGUI?A*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom()+" \n "+getSubirArvore());
		
	}
	
	
}