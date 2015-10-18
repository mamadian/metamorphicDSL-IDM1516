import Data.Music.Lilypond
import Text.PrettyPrint
import Text.Pretty
import Data.List

--From https://github.com/music-suite/lilypond/
--Ce DSL interne est expérimental (et non documenté) et n'inclue pas la gestion des headers
--Un bug provoque l'insertion de crochets dans les accords
--Pour exécuter, ghc lily.hs puis ./lily

-- 1: note, 2: altération, 3: octave
c = Pitch(C,0,5)
e = Pitch(E,0,5)
g = Pitch(G,0,5)
firstNote  = NotePitch c (Nothing)
secondNote = NotePitch e (Nothing)
thirdNote  = NotePitch g (Nothing)
soupir = Rest (Nothing) []

-- 'chord' génère un accord de noires
partition =
    Sequential [
        Note firstNote (Just $ 1/8) [BeginSlur],
        Note secondNote (Nothing) [],
        Note thirdNote (Nothing) [EndSlur],
        soupir,
        chord [
            firstNote,
            secondNote,
            thirdNote
        ],
        soupir
    ]

main = print $ pretty partition