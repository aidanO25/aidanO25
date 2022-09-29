# logicGates.py
# this program implements the three basic logic gates using funcitons

# creating thefunctions for the logic gates

def and_g(a,b):
    if a == 1 and b == 1:
        return 1
    if a == 0 and b == 0:
        return 0
    else:
        return 0

def or_g(a,b):
    if a == 1 or b == 1:
        return 1
    if a == 0 or b == 0:
        return 0
    else:
        return 1

def not_g(a):
    if a == 1:
        return 0
    else:
        return 1

def nand_g(a,b):
    if a == 0 and b == 0:
        return 1
    if a == 1 and b == 1:
        return 0
    else:
        return 1

def xor_g(a,b):
    if a == 0 and b == 0:
        return 0
    if a == 1 and b == 1:
        return 0
    else:
        return 1

        
    

def main():

    # variable which are used for each gate
    a = int(input("Enter 1 or 0 for a: "))
    b = int(input("Enter 1 or 0 for b: "))
    print()

    # printing the oputputs of each gate
    print("And gate: ",and_g(a,b))
    print("Or gate: ",or_g(a,b))
    print("Not gate: ",not_g(a))
    print("NAND gate: ",nand_g(a,b))
    print("XOR gate: ",xor_g(a,b))
main()
