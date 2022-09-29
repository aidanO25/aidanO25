# cpuFunctions.py

def one_bit_adder(a,b,ci):
    if a == 0 and b == 0 and ci == 0:
        return "sum: ", 0, "carry: ", 0
    if a == 0 and b == 1 and ci == 1:
        return "sum: ", 0, "carry: ", 1
    if a == 0 and b == 0 and ci == 1:
        return "sum: ", 1, "carry: ", 0
    if a == 0 or b == 0 and ci == 0:
        return "sum: ", 1, "carry: ", 0
    if a == 0 or b == 0 and ci == 1:
        return "sum: ", 0, "carry: ", 1
    if a == 1 and b == 1 and ci == 0:
        return "sum: ", 0, "carry: ", 1
    else:
        return "sum: ", 1, "carry: ", 1

def main():

    a = int(input("Enter 1 or 0 for a: "))
    b = int(input("Enter 1 or 0 for b: "))
    ci = int(input("Enter a 1 or 0 for ci: "))
    print()

    # printing the oputputs of each gate
    print("OneBitAdder: ",one_bit_adder(a,b,ci))

main()
