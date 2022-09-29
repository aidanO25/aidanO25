# attendee2.py
# This progra keeps track of a name, company, state, and emial address

# Function called whenever a new attendee wants to be added
def add():
    print()
    name = input("Enter a name: ")
    company = input("Enter a company: ")
    state = input("Enter a state in abbreviated form: ")
    email = input("Enter an email: ")
    print()
    total = name, company, state, email
    return total

def main():
    # creates a list to hold all information
    listt = []
    while True:
        print("Type add to add another attendee")
        print("Type get to view an attendee's information")
        print("Type all to view all attendee's information")
        print("Type state to view all attendee's from a certain state")
        question = input("Or type delete to remove an attendee: ")

        # adds a new attendee
        if question == "add" or question == "Add":
            tot = add()
            listt.append(tot)

        # gets an individual attendee's information
        if question == "get" or question == "Get":
            print()
            count = -1
            get = input("Enter an attendee name for their info: ")
            for i in listt:
                count += 1
                for x in i:
                    if x == get:
                        print(get,"info:",listt[count])
                        print()

        # ability to view entire list of attendees
        if question ==  "all" or question == "All":
            totalNum = 0
            print()
            for i in listt:
                totalNum +=1
                print(i)
            print("Total number of attendees:",totalNum)
            print()

        # views all attendees from a given state
        if question == "state" or question == "State":
            print()
            a = []
            lcount = -1
            tcount = 0
            state = input("Enter an abbreviation of the state: ")
            print()
            print("All attendees from:",state,"are below: ")
            for i in listt:
                lcount += 1
                for x in i:
                    if x == state:
                        tcount += 1
                        print(listt[lcount])
            print("Total number of attendees from",state,"is:",tcount)
            print()

        # deletes an individual attendee
        if question == "delete" or question == "Delete":
            print()
            count = -1
            takeOut = input("Enter a name to remove them from the list: ")
            for i in listt:
                count += 1
                for x in i:
                    if x == takeOut:
                        del listt[count]
                        print(takeOut,"has been removed from the list")
                        print()
  
    print("Type add to add another attendee")
    print("Type get to view an attendee's information")
    print("Type all to view all attendee's information")
    print("Type state to view all attendee's from a certain state")
    question = input("Or type delete to remove an attendee: ")
    print()



main()

