# listFunctions.py
# This program creates severaly python operations as functions

# This function counts how many times the number x is in the list
def count(myList, x):
    count = 0
    for i in myList:
        if i == x:
            count = count + 1
    return count

# This function checks whether or not a number is in the list
def isIn(myList, x):
    check = False
    for i in myList:
        if x == i:
            check = True
            break
    return check

# This function finds the index of the number x in the list
def index(myList, x):
    count = -1
    for i in myList:
        count+=1
        if i == x:
            return count

# This function reverses the list
def reverse(myList):
    return myList[-1::-1]

# This function sorts the list from the lowest number the the greatest
def sort(myList):
    newList = []
    while myList:
        mini = myList[0]
        for i in myList:
            if i < mini:
                mini = i
        newList.append(mini)
        myList.remove(mini)
    return newList
    
    
def main():
    myList = [3,8,2,4,8,0,10,3,39,50,10,3]
    print("The list is: ",myList)
    print(count(myList,3))
    print(isIn(myList, 11))
    print(index(myList, 39))
    print(reverse(myList))
    print(sort(myList))
    

main()
