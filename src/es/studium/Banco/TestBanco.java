package es.studium.Banco;

public class TestBanco
{

	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente ("Antonio Alonso", "12345678-L", "Avda. de La Rosa, 10");
		Cliente cliente2 = new Cliente ("Beatriz Benítez", "98765432-M","Calle de la Amargura, 12");
		
		Cuenta cuenta1 = new Cuenta ("ES00 0000 00 0000", 200.0, cliente1);
		Cuenta cuenta2 = new Cuenta ("ES01 0001 00 0001", 100.0, cliente2);
		
		System.out.println("La cuenta de "+ cuenta1.getCliente().getNombreCompleto() + " tiene " + cuenta1.getSaldo() + " Euros.");
		System.out.println("La cuenta de "+ cuenta2.getCliente().getNombreCompleto() + " tiene " + cuenta2.getSaldo() + " Euros.");
	
		cuenta1.setSaldo(cuenta1.getSaldo()-50);
		cuenta2.setSaldo(cuenta2.getSaldo()+50);
		
		System.out.println();
		
		System.out.println("La cuenta de "+ cuenta1.getCliente().getNombreCompleto() + " tiene " + cuenta1.getSaldo() + " Euros.");
		System.out.println("La cuenta de "+ cuenta2.getCliente().getNombreCompleto() + " tiene " + cuenta2.getSaldo() + " Euros.");
		
	}

}
