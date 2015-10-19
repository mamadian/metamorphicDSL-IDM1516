Le DSL externe est le langage PGN.
Il permet de définir les caractéristiques d'une partie d'échec. On peut ainsi définir les méta-informations de la partie (joueurs, date de la rencontre, round...).

Les DSL internes sont PHP et Python.
On peut les lancer via :
- php PGN_internal.php
- python PGN_internal.py

Les deux cas ont le même comportement : on créé une partie, puis on défini les catactéristiques de la partie du siècle (Byrne VS Fischer), ainsi que les coups associés. Enfin, on affiche dans la console les éléments de la partie.