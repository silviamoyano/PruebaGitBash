package es.studium.Banco;

public class Cuenta
{
	private String numCuenta;
	private double saldo;
	private Cliente cliente;
	
	public Cuenta ()
	{
		numCuenta = "";
		saldo = 0.0;
		cliente = new Cliente();
	}

	public Cuenta(String numCuenta, double saldo, Cliente cliente)
	{
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumCuenta()
	{
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta)
	{
		this.numCuenta = numCuenta;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	
}
