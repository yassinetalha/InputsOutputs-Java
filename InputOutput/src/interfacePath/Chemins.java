package interfacePath;

import java.io.IOException;
import java.nio.file.*;




public class Chemins {
	
	//******************************Exercice 1 : Prog 2 ****************************************

	/*Créez un programme qui crée un chemin (pas forcément vers un fichier qui existe) et qui affiche le
	résultat de l'appel aux méthodes suivantes sur le chemin :
	toString(), getFileName(), getName(0), getNameCount(), subpath(0,2),
	getParent(), getRoot()*/
	public static void main(String[] args) {
		
		Path p1 = Paths.get("D:\\Programme Files\\Git\\InputsOutputs-Java\\InputOutput\\test");
		System.out.println(p1.toString());// path to string
		System.out.println(p1.getFileName()); //Nom du fichier s'il existe
		System.out.println(p1.getName(0));//Le dossier source (juste après la racine)
		System.out.println(p1.getParent()); // Le chemin du dossier parent
		System.out.println(p1.getNameCount()); //Le nombre de dossier composant notre Path 
		System.out.println(p1.getRoot()); //La racine de notre Path
		System.out.println(p1.subpath(0, 2)); //Les sous dossier (hors la racine)
	

	//******************************Exercice 2 : Prog 2 ****************************************
	/*Soit le chemin suivant : Path relative = Paths.get("unfichier.txt");
	Créer un programme qui converti et affiche le chemin ci-dessus en : chemin absolu, en URI, et en
	chemin réel. Dans chacun des cas, que remarquez-vous ? */
	System.out.println("*************** Exo2 ************************************");
	 Path relative = Paths.get("unfichier.txt");
	 System.out.println(relative.toUri());
	 System.out.println(relative.toAbsolutePath());
	 try {
		System.out.println(relative.toRealPath());
	} catch (IOException e) {
		
		e.printStackTrace();
		System.out.println(" Vérifier que le fichier bien existe");
	}
	}
}
