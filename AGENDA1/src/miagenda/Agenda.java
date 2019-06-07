
package miagenda;

import java.util.Scanner;
public class Agenda {	
	//Atributos
	
	private Contacto[] lista;	

	//Metodos Constructores
	public Agenda(int tamanio_agenda){
		this.lista= new Contacto[tamanio_agenda]; 
	}
	private int contador_contactos = 0;
	
	//Metodos
	
	public void añadirContacto(Contacto c){		
		boolean encontrado = false;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==null) {
				lista[i]=c;
				encontrado=true;
			}
		}	
		if(encontrado) {
			System.out.println("Se añadio contacto");
		}else {
			System.out.println("No se añadio contacto");
		}
	}


	private int buscar_indice_vacio() {		
		int indice=0;	
		for(int i=0;i<lista.length;i++)
		if(this.lista[i]==null){			
			indice++;
					
		}		
		return indice;				
	}
	
	public void buscarPorNombre(String nombre) {
	boolean encontrado =false;
	for(int i=0;i<lista.length && !encontrado;i++) {
		if(lista[i]!=null && lista[i].getNombre().equalsIgnoreCase(nombre)) 
			System.out.println("Su nombre es " + lista[i].getNombre());
			System.out.println("Su email es "+lista[i].getEmail());
			System.out.println("Su telefono es "+lista[i].getTelefono());

		encontrado=true;
		}
	if(!encontrado) {
	System.out.println("No se ha encontrado el contacto");}
	}
	
	
	public void eliminarContacto(Contacto c) {
		
		boolean encontrado=false;
		for(int i=0;i<lista.length && !encontrado;i++) {
			if(lista[i]!=null && lista[i].equals(c)) {
				lista[i]=null;
				encontrado=true;
			}
		
		}
		
		if(!encontrado) {
			System.out.println("No se ha eliminado el contacto");
		}
		else{
			System.out.println("Se ha eliminado contacto");
		}
		
	}
    public void ModificarContacto(Agenda mi_agenda) {
    	boolean encontrado = false;
    	String teclado;
         System.out.println("Nombre de contacto a modificar:");
         String eliminar = teclado;
         if (contador_contactos == 0) {
             System.out.println("No hay contactos");
         } else {
             for (int i = 0; i < this.contador_contactos; i++) {

                 if (eliminar.equals(this.lista[i].getNombre())) {
                     System.out.println(i + 1 + ". " + this.lista[i].getNombre() + "-" + "Tf:" + this.lista[i].getTelefono());
                     encontrado = true;
                 }
             }
             if (encontrado) {
                 System.out.println("¿Qué contacto quieres modificar?, introduce el número:");
                 int modificar_numero = Integer.parseInt(teclado);

                 System.out.println("Introduce nombre:");
                 String nombre_nuevo = teclado;
                 System.out.println("Introduce teléfono, formato numerico:");
                 int telefono_nuevo = Integer.parseInt(teclado);

                 this.lista[modificar_numero - 1].setNombre(nombre_nuevo);
                 this.lista[modificar_numero - 1].setTelefono(telefono_nuevo);
               
             } else {
                 System.out.println("No hay contactos con ese nombre");
             }

         }
     }
    	
    	
    }

