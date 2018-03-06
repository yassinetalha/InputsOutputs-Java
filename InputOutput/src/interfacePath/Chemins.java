package interfacePath;

import java.nio.file.*;


//******************************Exercice 1 : Prog 2 ****************************************

/*Créez un programme qui crée un chemin (pas forcément vers un fichier qui existe) et qui affiche le
résultat de l'appel aux méthodes suivantes sur le chemin :
toString(), getFileName(), getName(0), getNameCount(), subpath(0,2),
getParent(), getRoot()*/

public class Chemins {
	
	public static void main(String[] args) {
		
		Path p1 = Paths.get("D:\\Programme Files\\Git\\InputsOutputs-Java\\InputOutput\\test");
		System.out.println(p1.toString());// path to string
		System.out.println(p1.getFileName()); //Nom du fichier s'il existe
		System.out.println(p1.getName(0));//Le dossier source (juste après la racine)
		System.out.println(p1.getParent()); // Le chemin du dossier parent
		System.out.println(p1.getNameCount()); //Le nombre de dossier composant notre Path 
		System.out.println(p1.getRoot()); //La racine de notre Path
		System.out.println(p1.subpath(0, 2)); //Les sous dossier (hors la racine)
	}

}
