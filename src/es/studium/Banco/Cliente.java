package es.studium.Banco;

public class Cliente
{
	private String nombreCompleto;
	private String dni;
	private String direccion;
	
	public Cliente()
	{
		nombreCompleto = "";
		dni = "";
		direccion = "";
	}

	public Cliente(String nombreCompleto, String dni, String direccion)
	{
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.direccion = direccion;
	}

	public String getNombreCompleto()
	{
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto)
	{
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
}
