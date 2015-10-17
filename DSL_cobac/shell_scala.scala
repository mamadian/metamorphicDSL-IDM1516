import scala.sys.process._
import java.io.File

object IDM{

      def main(args: Array[String]) {
      	  // Création d'un fichier contenant "Hello World"
      	  "echo Hello World !" #> new File("./IDM_DSL.txt") !

	  // Lecture du fichier créé précédement
	  "cat ./IDM_DSL.txt" !

	  // Suppression du fichier
	  // Commentez la ligne pour garder le fichier
	  "rm ./IDM_DSL.txt" !
	  }
}