package Persona;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private double altura;
	private int peso;
	private String estado;
	
	private String caminar;
	private String sentarse;
	private String pararse;
	private String cumplir;
	private String encgordar;
	private String adelgazar;
	
		
	public Persona(String nombre,String apellido,int dni,int edad,double altura,int peso,String estado) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setEdad(edad);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setEstado(estado);
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public char[] getPersona() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCaminar() {
		return caminar;
	}

	public void setCaminar(String caminar) {
		this.caminar = caminar;
	}

	public String getSentarse() {
		return sentarse;
	}

	public void setSentarse(String sentarse) {
		this.sentarse = sentarse;
	}

	public String getPararse() {
		return pararse;
	}

	public void setPararse(String pararse) {
		this.pararse = pararse;
	}

	public String getCumplir() {
		return cumplir;
	}

	public void setCumplir(String cumplir) {
		this.cumplir = cumplir;
	}

	public String getEncgordar() {
		return encgordar;
	}

	public void setEncgordar(String encgordar) {
		this.encgordar = encgordar;
	}

	public String getAdelgazar() {
		return adelgazar;
	}

	public void setAdelgazar(String adelgazar) {
		this.adelgazar = adelgazar;
	}
	
	

}