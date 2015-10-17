import java.util.Map;

import org.jpl7.JPL;
import org.jpl7.Query;
import org.jpl7.Term;

public class Family {
	public static void main(String argv[]) {
		// JPL.setTraditional();
		//
		Query.hasSolution("use_module(library(jpl))"); // only because we call e.g. jpl_pl_syntax/1 below
		Term swi = Query.oneSolution("current_prolog_flag(version_data,Swi)").get("Swi");
		System.out.println("swipl.version = " + swi.arg(1) + "." + swi.arg(2) + "." + swi.arg(3));
		System.out.println("swipl.syntax = " + Query.oneSolution("jpl_pl_syntax(Syntax)").get("Syntax"));
		System.out.println("swipl.home = " + Query.oneSolution("current_prolog_flag(home,Home)").get("Home").name());
		System.out.println("jpl.jar = " + JPL.version_string());
		System.out.println("jpl.dll = " + org.jpl7.fli.Prolog.get_c_lib_version());
		System.out.println("jpl.pl = " + Query.oneSolution("jpl_pl_lib_version(V)").get("V").name());
		//
		String t1 = "consult('family.pl')";
		System.out.println(t1 + " " + (Query.hasSolution(t1) ? "succeeded" : "failed"));
		//Requete pour connaitre de qui Joe est le descendant.
		String t4 = "descendent_of(joe,Y)";
		System.out.println("first solution of " + t4 + ": Y = " + Query.oneSolution(t4).get("Y"));
		Map<String, Term>[] ss4 = Query.allSolutions(t4);
		System.out.println("all solutions of " + t4);
		for (int i = 0; i < ss4.length; i++) {
			System.out.println("Y = " + ss4[i].get("Y"));
		}
		System.out.println("each solution of " + t4);
		Query q4 = new Query(t4);
		while (q4.hasMoreSolutions()) {
			Map<String, Term> s4 = q4.nextSolution();
			System.out.println("Y = " + s4.get("Y"));
		}
	}
}
