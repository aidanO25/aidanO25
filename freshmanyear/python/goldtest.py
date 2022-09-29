def indices_sum(listt,target):
    for i in range(len(listt)):
        for j in range(i+1,len(listt)):
            if listt[i]+listt[j] == target: return(i,j)


def main():

    n = int(input("Enter an int to find two prime nubmers that add up to your number: "))

    if n < 2:
        print("The number must be greater than 1")
        print("Type main() to restart")

    i = 1
    listt = []
    # runs through a list to find prime numbers less than the number inputed
    print("The prime numbers less than",n," are: ")
    for i in range(n):
        newNum = n - i
        if(newNum > 1):
            flag = False
            if newNum > 1:
                # check for factors
                for i in range(2, newNum):
                    if (newNum % i) == 0:
                        # if factor is found, set flag to True
                        flag = True
                        # break loop
                        break

            # check if flag is True
            if flag != True:
                listt.append(int(newNum))
    print(listt)


    
    print(indices_sum(listt,n))

main()
