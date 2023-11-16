package tp_4;

import java.io.*;
import java.util.Scanner;
	
public class tp_4 {

		static String[] nombre = new String [3];
		static String[] apellido = new String [3];
		static int[] num_camiseta = new int[3];
		static String[] nombre_suplente = new String [4];
		static String[] apellido_suplente = new String [4];
		static String posicion;
		static int[] num_suplente = new int [4];
		static boolean agregar_suplente = false, num_encontrado = false;
		static String respuesta;
		static int cambio_num;
		
		public static void ingresar_datos () {
			
			Scanner entrada = new Scanner(System.in);
			
			for (int i = 0 ; i < 3 ; i++) {
				
			System.out.println("Ingresar el nombre del jugador: ");
			nombre[i] = entrada.next();	
			System.out.println("Ingresar el apellido del jugador: ");
			apellido[i] = entrada.next();
			System.out.println("Ingresar el numero de camiseta del jugador: ");
			num_camiseta[i] = entrada.nextInt();	
			}
			
		}
		
		public static void agregar_jugador () {
			
			Scanner entrada = new Scanner(System.in);
			
			do {
				System.out.println("\nDesea agregar un jugador suplente?: ");
				respuesta = entrada.next();
				
				if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
					System.out.println("Error. Ingrese la opcion si o no");
				}
				
			} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
				
				if (respuesta.equalsIgnoreCase("si")) {
				
					agregar_suplente = true;
					
					for (int i = 0 ; i < nombre.length ; i++) {
						nombre_suplente[i] = nombre[i];
						apellido_suplente[i] = apellido[i];
						num_suplente[i] = num_camiseta[i];
					}
				
					System.out.println("\nIngrese el nombre del jugador suplente: ");
					nombre_suplente[3] = entrada.next();
					System.out.println("Ingrese el apellido del jugador suplente: ");
					apellido_suplente[3] = entrada.next();
					System.out.println("Ingresar la posicion del jugador suplente: ");
					posicion = entrada.next();
					System.out.println("Ingrese el numero del jugador suplente: ");
					num_suplente[3] = entrada.nextInt();
				}
		
		}
		
		public static void analizarDatosTresJugadores () {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("\nDatos de los jugadores:");
			
			int i; 
			
			for (i = 0 ; i < nombre.length ; i++) {
				System.out.println("\nNombre: " + nombre[i]);
				System.out.println("Apellido: " + apellido[i]);
				System.out.println("Numero de camiseta: " + num_camiseta[i]);
			}
			
			
			do {
				System.out.println("\n¿Los datos son correctos?");
				respuesta = entrada.next();
			} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
			
			if (respuesta.equalsIgnoreCase("no")) {
				System.out.println("¿Que numero de camiseta desea cambiar?");
				cambio_num = entrada.nextInt();
				
				for (i = 0; i < num_camiseta.length; i++) {
						
					if (cambio_num == num_camiseta[i]) {
							
						num_encontrado = true;
						
						System.out.println("\nIngrese el nombre del jugador: ");
			            nombre[i] = entrada.next();
			            System.out.println("Ingrese el apellido del jugador: ");
			            apellido[i] = entrada.next();
			            System.out.println("Ingrese el numero del jugador: ");
			            num_camiseta[i] = entrada.nextInt();
			               
			            System.out.println("\nDatos actualizados de los jugadores:");
			            
			            for (int j = 0 ; j < nombre.length ; j++) {
							System.out.println("\nNombre: " + nombre[j]);
							System.out.println("Apellido: " + apellido[j]);
							System.out.println("Numero de camiseta: " + num_camiseta[j]);
						}
			               
			           break;
					}
				}
			}
		}
		
		public static void analizarDatosCuatroJugadores () {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("\nDatos de los jugadores:");
			
			int i; 
			
			for (i = 0 ; i < nombre_suplente.length ; i++) {
				System.out.println("\nNombre: " + nombre_suplente[i]);
				System.out.println("Apellido: " + apellido_suplente[i]);
				System.out.println("Numero de camiseta: " + num_suplente[i]);
			}
			
			
			do {
				System.out.println("\n¿Los datos son correctos?");
				respuesta = entrada.next();
			} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
			
			if (respuesta.equalsIgnoreCase("no")) {
				System.out.println("¿Que numero de camiseta desea cambiar?");
				cambio_num = entrada.nextInt();
				
				for (i = 0; i < num_suplente.length; i++) {
						
					if (cambio_num == num_suplente[i]) {
							
						num_encontrado = true;
						
						System.out.println("\nIngrese el nombre del jugador: ");
			            nombre_suplente[i] = entrada.next();
			            System.out.println("Ingrese el apellido del jugador: ");
			            apellido_suplente[i] = entrada.next();
			            System.out.println("Ingrese el numero del jugador: ");
			            num_suplente[i] = entrada.nextInt();
			               
			            System.out.println("\nDatos actualizados de los jugadores:");
			            
			            for (int j = 0 ; j < nombre_suplente.length ; j++) {
							System.out.println("\nNombre: " + nombre_suplente[j]);
							System.out.println("Apellido: " + apellido_suplente[j]);
							System.out.println("Numero de camiseta: " + num_suplente[j]);
						}
			               
			           break;
					}
				}
			}
		}
		
		public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			
			ingresar_datos();
			agregar_jugador();
			
			if (agregar_suplente == false) {
				analizarDatosTresJugadores();
			}
			
			else if (agregar_suplente == true) {
				analizarDatosCuatroJugadores();
			}
		}
	}