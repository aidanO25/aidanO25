def isPrime(number):
    if number > 1:
        for i in range(2, int(number/2) + 1):
            if(number % i) == 0:
                return "The number is not prime"
                break
        else:
            return "The number is prime"

def main():
    number = int(input("Enter a number to see if it is prime or not: "))
    print(isPrime(number))


main()
