#!/usr/bin/env python3
# Copyright 2009-2017 BHG http://bw.org/

def main():
    game2 = [ 'Rock', 'Paper', 'Scissors', 'Lizard', 'Spock' ]
    print1(game2)

def print1(o):
    for j in o: print(j, end=' ', flush=True)
    print()

if __name__ == '__main__': main()
