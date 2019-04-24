
public class Pajaro implements Cantante{
	private String raza;
	private int edad;
	private String habitat;
	private int tamaño;
	private String color;
	
	public Pajaro() {
	
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pajaro(String raza, int edad, String habitat, int tamaño, String color) {
		
		this.raza = raza;
		this.edad = edad;
		this.habitat = habitat;
		this.tamaño = tamaño;
		this.color = color;
	}

	@Override
	public void cantar() {
		System.out.println("pio, pio, pio, pio, pio");
	}
	

}
