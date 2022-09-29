# text2numbers.py
# this program converts a textual message into a swquence of numbers, utilizing
# the underlying Unicode encoding

def main():
    print("This program converts a textual message into a squence")
    print("of numbers representing the Unicode encoding of the message.\n")

    # get the message to encode
    message = input("Please enter the message to encode: ")
    print("\nhere are the Unicode codes:")

    # loop through the message and print out the Unicode values
    for ch in message:
        coded = (ord(ch))
        print(coded, end = " ")

    print(" ")

    inString = input("Please enter the Unicode-encoded message:")
    message = ""
    for numStr in inString.split():
        codeNum = eval(numStr)
        message = message +chr(codeNum)
    
    print(message, end = " ")

main()
