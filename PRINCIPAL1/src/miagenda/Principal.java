
package miagenda;

import java.util.Scanner;
public class Principal {

	public static void main(String[] arg){		

		Scanner reader=new Scanner(System.in);
		int opcion, tamanio;
		Contacto mi_contacto;
		String nombre, email;
		String telefono;
		boolean band=true;	
		

		System.out.print("Tama�o de la agenda: ");
		tamanio=reader.nextInt();
		Agenda mi_agenda=new Agenda(tamanio);		

		while(band==true){	
			menu();			
			System.out.print("> Elegir opcion: ");
			opcion=reader.nextInt();

			switch(opcion){
				case 1:   // insertar contacto
					System.out.print("Ingresar nombre contacto: ");
					nombre=reader.next();
					System.out.print("Ingresar telefono contacto: ");
					telefono=reader.next();
					System.out.print("Ingresar email contacto: ");
					email=reader.next();

					mi_contacto=new Contacto(nombre, telefono ,email);
					mi_agenda.a�adirContacto(mi_contacto);
					break;
					
				case 2:   //  Editar
					System.out.println("Escribe un nombre");
					nombre=reader.next();
					System.out.println("Escribe el telefono");
					telefono=reader.next();
					System.out.println("Escribe el email");
					email=reader.next();
					mi_agenda.ModificarContacto(mi_agenda);
					
					break;
					
				case 3://Buscar contacto
					
					System.out.println("Escribe un nombre");
					nombre=reader.next();
					mi_agenda.buscarPorNombre(nombre);
					break;
					
				case 4://Eliminar contacto
					
					System.out.println("Escribe un nombre");
					nombre=reader.next();
					mi_contacto= new Contacto(nombre);
					mi_agenda.eliminarContacto(mi_contacto);
					
					break;
			
				case 0://Finalizar programa
					band=false;
					break;
				default:				
					break;					
			}				
		}		
	}

	//Metodo de menu de opciones del proyecto
	public static void menu(){
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("--------- Menu Agenda Telefonica ----------");
		System.out.println("       [1]  A�adir Contacto");
		System.out.println("       [2]  Editar Contacto");
		System.out.println("       [3]  Buscar Contacto");
		System.out.println("       [4]  Eliminar Contacto"); // por nombre
		System.out.println("       [0]  Finalizar Programa");
		System.out.println("-------------------------------------------");
		System.out.println();
	}
	

 