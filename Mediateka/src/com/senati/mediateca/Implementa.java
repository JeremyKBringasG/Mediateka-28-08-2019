package com.senati.mediateca;

import java.util.Set; //Java colecciones: matrices, listas, arrays
import java.util.HashSet; //Java colecciones para arrays con seguridad

public class Implementa {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Añadir nuevos socios
		//Clase objeto = new Clase()
		Socio socio1 = new Socio();
		socio1.id=100;
		socio1.nombre="Jorge Antonio";
		socio1.apellido="Luque Chambi";
		socio1.distrito="Los Olivos";
		
		Socio socio2 = new Socio();
		socio2.id=102;
		socio2.nombre="Esther";
		socio2.apellido="Aquino Olivares";
		socio2.distrito="Bellavista";
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		
		Socio socio3 = new Socio(103,"Alicia","Gomez Avalos","Comas");
		System.out.println(socio3.toString());
		
		Libro libro1 = new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		Libro libro2 = new Libro(13,"El Principito","Antoine Saint-Exupery",75f,96,134);
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		Cintaaudio audio1 = new Cintaaudio(15,"El Milagro Verde","Los Mirlos", 9.50f, "San Martín", 7.02f);
		Cintaaudio audio2 = new Cintaaudio(17,"Heavy & Groovie","VH Glenny Power Trio",7.99f,"Lima", 3.59f);
		
		System.out.println(audio1.toString());
		System.out.println(audio2.toString());
		
		Cintavideo video1 = new Cintavideo(19,"Bastardos sin Gloria","Quentin Tarantino",19.99f,"Christoph Waltz, Eli Roth, Brad Pitt, Diane Kruger, Melanie Laurent",2.33f);
		Cintavideo video2 = new Cintavideo(21,"Medianoche en París","Woody Allen",17.85f,"Owen Wilson, Rachel Adams, Marion Cotillard, Tom Hiddleston", 1.44f);
		
		System.out.println(video1.toString());
		System.out.println(video2.toString());
		
		System.out.println("Lista de Socios");
		Socio soc1 = new Socio(104,"Jorge","Luque","Comas");
		Socio soc2 = new Socio(105,"Maria","Luna","Comas") ;
		Socio soc3 = new Socio(106,"Gerardo","Luque","Comas");
		Socio soc4 = new Socio(107,"Alex","Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex","Lopez","Comas");
		
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		sociosinscritos.add(soc5);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellido + " " + socio.distrito + " ");
		}
		
		System.out.println("Lista de Libros");
		Libro lib1 = new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		Libro lib2 = new Libro(12,"El Principito","Antoine Saint-Exupery",75f,96,134);
		Libro lib3 = new Libro(13,"La Isla del Tesoro","Robert Louis Stevenson",60f,283,145);
		Libro lib4 = new Libro(14,"Tradiciones Peruanas","Ricardo Palma",28f,296,156);
		Libro lib5 = new Libro(15,"Rayuela","Julio Cortázar",48f,736,178);
		
		Set <Libro> librosinventario = new HashSet<Libro>();
		librosinventario.add(lib1);
		librosinventario.add(lib2);
		librosinventario.add(lib3);
		librosinventario.add(lib4);
		librosinventario.add(lib5);
		
		for (Libro libro : librosinventario) {
			System.out.println(libro.id + " " + libro.titulo + " " + libro.autor + " " + libro.precio + " " + libro.nropag + " " + libro.nroisbn + " ");
		}
		
		System.out.println("Lista de Audios");
		Cintaaudio aud1 = new Cintaaudio(16,"El Milagro Verde","Los Mirlos", 9.50f, "San Martín", 7.02f);
		Cintaaudio aud2 = new Cintaaudio(17,"Heavy & Groovie","VH Glenny Power Trio",7.99f,"Lima", 3.59f);
		Cintaaudio aud3 = new Cintaaudio(18,"Master of Puppets","Metallica",5.99f,"San Francisco",6.25f);
		Cintaaudio aud4 = new Cintaaudio(19,"My Generation","The Who",7.55f,"Londres",3.19f);
		Cintaaudio aud5 = new Cintaaudio(20,"Bad Penny","Rory Gallagher",10.5f,"Donegal",3.58f);
		
		Set <Cintaaudio> audiosinventario = new HashSet<Cintaaudio>();
		audiosinventario.add(aud1);
		audiosinventario.add(aud2);
		audiosinventario.add(aud3);
		audiosinventario.add(aud4);
		audiosinventario.add(aud5);
		
		for (Cintaaudio audio : audiosinventario) {
			System.out.println(audio.id + " " + audio.titulo + " " + audio.autor + " " + audio.precio + " " + audio.lugar + " " + audio.duracion + " ");
		}
		
		System.out.println("Lista de Videos");
		Cintavideo vid1 = new Cintavideo(21,"Bastardos sin Gloria","Quentin Tarantino",19.99f,"Christoph Waltz, Eli Roth, Brad Pitt, Diane Kruger, Melanie Laurent",2.33f);
		Cintavideo vid2 = new Cintavideo(22,"Medianoche en París","Woody Allen",17.85f,"Owen Wilson, Rachel Adams, Marion Cotillard, Tom Hiddleston", 1.44f);
		Cintavideo vid3 = new Cintavideo(23,"School of Rock","Richard Linklater",15.75f,"Jack Black, Joan Cusack, Mike White, Miranda Cosgrove", 1.49f);
		Cintavideo vid4 = new Cintavideo(24,"Dodgeball","Rawson Marshall", 13.84f,"Vince Vaughn, Ben Stiller, Christine Taylor, Jason Bateman, Rip Torn",1.32f);
		Cintavideo vid5 = new Cintavideo(25,"Oblivion","Joseph Kosinski",19.25f,"Tom Cruise, Olga Kurylenko, Andrea Riseborough, Morgan Freeman, Melissa Leo, Nikolaj Coster-Waldau",2.05f);
		
		Set <Cintavideo> videosinventario = new HashSet<Cintavideo>();
		videosinventario.add(vid1);
		videosinventario.add(vid2);
		videosinventario.add(vid3);
		videosinventario.add(vid4);
		videosinventario.add(vid5);
		
		for (Cintavideo video : videosinventario) {
			System.out.println(video.id + " " + video.titulo + " " + video.autor + " " + video.precio + " " + video.actores + " " + video.duracion + " ");
		}
}
}
