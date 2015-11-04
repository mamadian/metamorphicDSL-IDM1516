import pgn

def resultat(fichier):
	try :
		texte = open(fichier).read()
	except:
		print "Fichier : "+fichier+" n'existe pas"
		return
	print "   Analise de "+fichier
	jeux = pgn.loads(texte)
	for jeu in jeux:
		res= "L'evenement "+ jeu.event
		res += " a eu lieu a " + jeu.site
		res += " le " + jeu.date
		blanc = jeu.white.split(", ")
		if len(blanc) == 2:
			res += "\nIl a vu s'affronter "+ blanc[1] +" "+blanc[0]
		else :
			res += "\nIl a vu s'affronter "+ blanc[0]
		noir = jeu.black.split(", ")
		if len(noir) == 2:
			res += " et "+ noir[1]+ " "+ noir[0]
		else :
			res += " et "+ noir[0]
			
		res+="\n\n"
		if jeu.result == "1-0":
			res += "victoire de "
			if len(blanc) == 2:
				res += blanc[1] +" "+blanc[0]
			else :
				res +=blanc[0]
		elif jeu.result == "0-1":
			res += "victoire de "
			if len(noir) == 2:
				res +=noir[1]+ " "+ noir[0]
			else :
				res +=noir[0]
		elif jeu.result == "1/2-1/2":
			res += "match nul"
		elif jeu.result == "*":
			res += "parti en cour"
		print res+"\n"
		
		
resultat("../KasparovDeep_blue.pgn")

resultat("../db-kas96.pgn")
