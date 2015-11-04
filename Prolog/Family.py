# -*- coding: utf-8 -*-

from pyswip import *


def main():
    p = Prolog()
    p.consult("test.pl")

    X = Variable(); Y = Variable(); Z = Variable()

    print "\nQuery with strings\n"
    for s in p.query("descendent_of(joe,Y)"):
        #print s["X"], "is the father of", s["Y"]
        #print s["Z"], "is the mother of", s["Y"] 
        print s["Y"]

    #print "running the query again"
    #q = Query(father(X, Y))
    #while q.nextSolution():
    #    print X.value, "is the father of", Y.value

    
if __name__ == "__main__":
    main()


