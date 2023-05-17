import java.util.Scanner;

public class PrincipalApp {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		int opcion2;
		System.out.println("Eu que onda, vamos a jugar a un juego");
		System.out.println("Te encuentras solo, en la calle, de noche, en la oscuridad wey, te viene Shrek que haces?");
		System.out.println("1.Huyes");
		System.out.println("2.Te quedas quieto");
		System.out.println("3.Navajazo al bicho");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Te pones a correr, haces la marcha atrás, pero te chocas con Asno, te come, game over");
			break;

		case 2:
			System.out.println("Te quedas quieto, y si no te mueves no te ve, na de locos, te has salvado");
			
			System.out.println("Pero miras hacia atrás y te das cuenta de que viene Neuma cantando la vaca lechera, qué haces?");
			System.out.println("1.Te pones a cantar la vaca lechera con él");
			System.out.println("2.Na, de locos, te quedas quieto a ver si pasa de ti");
			System.out.println("3.Vuelves a sacar la navaja mariposa humilde");
			switch (opcion2) {
			case 1:
				System.out.println("Decides cantar con él al ritmo de la pandereta que lleva el cabron, enhorabuena eres feliz y humilde");
				break;

			case 2:
				System.out.println("Te quedas quieto, con la intención de que Neuma no te encuentre pero, se percata, y se pone a cantarte, game over");
				break;
				
			case 3:
				System.out.println("Miras a tu vieja amiga navaja mariposa, sonríes, te diriges hacia Neuma pero, cuando te dispones a actuar, te conmueve su canción de la vaca lechera y te ppones a cantar con el, game over baby");
				break;
			default:
				System.out.println("Elige bien conyo");
				break;
			}
			break;
			
		case 3:
			System.out.println("Decides sacar la navaja mariposa que llevas en el bolsillo, le pegas un navajazo a Chuerk, y este se enfada y te destripa, game over");
			break;
		default:
			System.out.println("Elige bien o te reviento");
			break;
		}
	}
}
