#!/usr/bin/env python3
# Copyright 2009-2017 BHG http://bw.org/

def main():
    for k in incl_rng(25):
        print(k, end = ' ')
    print()

def incl_rng(*arguments):
    numarguments = len(arguments)
    strt = 0
    st = 1
    
    # initialize parameters
    if numarguments < 1:
        raise TypeError(f'expected at least 1 argument, got {numarguments}')
    elif numarguments == 1:
        stp = arguments[0]
    elif numarguments == 2:
        (strt, stp) = arguments
    elif numarguments == 3:
        (strt, stp, st) = arguments
    else: raise TypeError(f'expected at most 3 arguments, got {numarguments}')

    # generator
    j = strt
    while j <= stp:
        yield j
        j += st

if __name__ == '__main__': main()
