# to_numbers.py
# This program takes a list of numbes as string and then changes the string
# numbers to actual nubers in a list

# NOTE: I am pretty sure this is what the question was looking for but I was not
# completely sure so I went online to try to find the question to help me under-
# stand

# defines the toNumbers function
def toNumbers(strList):
    for i in range(len(strList)):
        strList[i] = eval(strList[i])

def main():

    # a list of numbers as string
    numStr = [["1","2","3","4","5"], ["1.1","1.5","2.0"]]

    # prints the original list for reference
    print("The original string list is:", numStr)
    print()

    # uses the toNumbers function defined above to convert them into real numbers
    for lst in numStr:
        toNumbers(lst)
    print("The new list is:", numStr)


main()
    
