package ud;

/*Import de packages */ 
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*change test

/*Proof of Concept : un tableau pré-rempli avec plusieurs jeux, et moyen d'afficher un jeu au hasard dans la console.*/

public class Main {

	public static void main(String[] args) {
			
		/* ---- DÉCLARATION DU TABLEAU PRÉ-REMPLI DE JEUX ---- */ 
		String[] tableauJeux = {"Ale & Tale" ,"Back 4 blood", "Satisfactory","Baldur's Gate 3", "Dead Island", "Divinity Original Sin 2", "Don't Starve Together" , "Gang beasts" , "GTA 5"	, "Human Fall Flat",  "Killing Floor 2" , "Left 4 Dead 2" ,
			"Moving Out", "Moving Out 2", "Oddsparks", "Phasmophobia", "Sea of Thieves", "Trine", "V rising", "Valheim", "Warhammer : Vermintide 2" };
	
		
		
		/* ---- SÉLECTION ALÉATOIRE D'UN JEU ---- */ 
		
		/*Déclaration de jeuAleatoire instance de la classe Random */
		Random jeuAleatoire = new Random();
		
		/* Randomisation de la sélection de l'index du tableau tableauJeux grâce à l'instance de classe Random (jeuAleatoire) */ 
		int indexAleatoire = jeuAleatoire.nextInt(tableauJeux.length);
		
		/* Affichage du résultat associé à l'index aléatoire randomisé dans le tableauJeux */ 
		System.out.println("Jeu choisi aléatoirement : " + tableauJeux[indexAleatoire]);
		}

}


		