# gcd.py
# This program finds the GCD of two numbers using an algorithm

# creating a gcd function
def gcd(m,n):
    if m < n: 
        (m,n) = (n,m)
    while (m % n != 0):
        (m, n) = (n, m % n)
    return n



def main():
    print("This program finds the greatest common divisor of two numbers")
    n = float(input("Give your first number: "))
    m = float(input("Give your second number: "))

    print("The gcd of your two numvers are: ",gcd(m,n))
    


main()
