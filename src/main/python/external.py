#!/usr/bin/env python

from csp.csp import *

@process
def producer(channel, n):
     channel.write(n)
     print "send value : " + n
     channel.poison()
     return

@process
def consumer(channel):
     print "get value : " + channel.read()

chan = Channel()
Par(consumer(chan), producer(chan, 'a')).start()