package POO;

public class TesteAnimal {

	public static void main(String [] args)
	{
		cachorro cachorro1 = new cachorro("Teka",11,"Au","O cachorro corre!");
		cavalo cavalo1 = new cavalo("Doc",8,"Irr�","O cavalo corre!");
		preguica preguica1 = new preguica("Ted",8,"Sem som","A pregui�a sobe em �rvores!");
		
		cachorro1.imprimirInfo();
		cavalo1.imprimirInfo();
		preguica1.imprimirInfo();
		
	}
	
}