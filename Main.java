
//Estructura
class Persona{
	//atributos
	//String[] nombre = new String[20];
	String nombre;
	public int edad;
	//Metodo para asignar con Set el nombre de la persona
	void setNombre(String nombre ){
		this.nombre = nombre ;
	}
	//Metodos para obtener el nombre de la estructura persona
	String getNom(){
		return nombre;
	}
	//Metodo para obtener la edad de la estructura persona
	int getEd(){
		return edad;
	}
	//Metodo para aumentar la edad de la persona
	int CumplirAnios(){
		edad+=1;
		return edad;
	}

}

public class Main
{
	public static void main(String []args){
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		persona1.setNombre("Oliver");
		persona2.setNombre("Karla");
		int i,j;
		for(i=0;i<4;i++)
		{
			persona1.CumplirAnios();
		}
		for(i=0;i<2;i++)
		{
			persona2.CumplirAnios();
		}
		System.out.println(persona1.getNom() +" tiene "+persona1.getEd()+" años ");
		System.out.println(persona2.getNom() +" tiene "+persona2.getEd()+" años ");
	}
}


