# fibonacci.py
# This program computes and outputs the nth fibonacci number, where n is a value
# entered by the user

def fib(num):
    if num < 2:
        return num
    
    else:
        return (fib(num - 1) + fib(num - 2))


def main():
    num = int(input("Enter a integer for the amount of time the sequence is ran: "))

    for i in range(num):
        print(fib(i))



main()
