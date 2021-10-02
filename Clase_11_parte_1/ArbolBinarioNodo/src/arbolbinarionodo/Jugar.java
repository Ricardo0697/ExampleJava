/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinarionodo;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
class AdivinaAnimal {
    private static Nodo raiz;
    private Scanner in;

    /**
     * Constructor por omision. Crea el nodo raiz con un elefante
     */
    public AdivinaAnimal (){
	raiz = new Nodo("Elefante");
	in = new Scanner(System.in);
    }

    /**
     * Metodo para jugar a adivinar animales
     */
  public void jugar () {
    Nodo nodo = raiz;

    while (nodo != null) {   
      if (nodo.getIzquierda() != null) {   //Hay una pregunta
        System.out.println(nodo.getDato());
        nodo = (respuesta()) ? nodo.getIzquierda() : nodo.getDerecha();
      } else {  // Se tiene un animal
        System.out.println("Ya sí, es un(a) " + nodo.getDato());
        if (respuesta())
          System.out.println("Gane :) !!");
        else 
          animalNuevo (nodo);
        nodo = null;
	return;
      }
    }
  }

  /*
   * M�todo privado para leer una respuesta del usuario s�lo puede ser si o no
   * @return boolean -- true si la respuesta es si y false en otro caso.
   */
  private boolean respuesta () {

      while (true) {
	  String resp = in.nextLine().toLowerCase().trim();

	  if (resp.equals("si")) return true;
	  if (resp.equals("no")) return false;
	  System.out.println("La respuesta debe ser si o no");
      }
  }

  /**
   * M�todo para dar de alta un nuevo animal
   * @param nodo -- nodo del cual se va a colgar el animal
   */
  private void animalNuevo (Nodo nodo) {
    String animalNodo = (String) nodo.getDato();
    System.out.println("Cuál es tu animal?");
    String nuevoA = in.nextLine();
    System.out.println("Qué pregunta con respuesta si/no puedo hacer" +
             " para poder decir que es un(a) " + nuevoA);
    String pregunta = in.nextLine();
    Nodo nodo1 = new Nodo(animalNodo);
    Nodo nodo2 = new Nodo(nuevoA);
    System.out.println("Para un(a) " + nuevoA + " la respuesta es si/no?");
    nodo.setDato(""+pregunta+"?");
    if (respuesta()) {
	nodo.setIzquierda(nodo2);
	nodo.setDerecha(nodo1);
    } else {
	nodo.setIzquierda(nodo1);
	nodo.setDerecha(nodo2);
    }
  }

  public static void main (String [] pps) { 
    System.out.println("Juguemos a adivinar animales");
    boolean otroJuego = true;
    AdivinaAnimal juego = new AdivinaAnimal();

    do {
	juego.jugar(); 
	System.out.println("Jugamos otra vez?");
	otroJuego = juego.respuesta();
    } while (otroJuego);
  }
}
