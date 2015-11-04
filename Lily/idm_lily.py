#Avec python-ly
# L'API est en train de changer de ly.dom à ly.music, mais seul ly.dom
# peut générer une syntaxe Lilypond
import ly.dom as l

music= l.Document()
h = l.Header(music)
h['title'] = "1990s SNCF jingle"
h['composer'] = "Carlos"
h['tagline'] = l.Scheme('#f')
m = l.Seq(music)
cdo = l.Chord(m)
l.Pitch(0,0,0,cdo)
l.Duration(3,0,1,cdo)
liaison = l.SchemeList(m)
cmi = l.Chord(liaison)
l.Pitch(0,2,0,cmi)
csol = l.Chord(liaison)
l.Pitch(0,4,0,csol)
l.Text("r",m)
do_majeur = l.Chord(m)
l.Pitch(0,0,0,do_majeur)
l.Pitch(0,2,0,do_majeur)
l.Pitch(0,4,0,do_majeur)
l.Duration(2,0,1,do_majeur)
l.Text("r",m)

p = l.Printer()
it = p.indentGen(music)
for i in it:
	print(i)

# Version avec Mingus, non testée pour cause de problème de dépendances
# import mingus.extra.LilyPond as LilyPond
# jingle = Bar()
# jingle.place_notes("C-4", 8)
# jingle.place_notes("E-4", 8)
# jingle.place_notes("G-4", 8)
# jingle.place_rest(8)
# jingle.place_notes("C-4 E-4 G-4",8)
# jingle.place_notes(None, 4)
# lily_bar = LilyPond.from_Bar(b)
## Possibilité d'exporter directement la syntaxe lilypond en partition musicale
# LilyPond.to_png(lily_bar, "1990s SNCF jingle")