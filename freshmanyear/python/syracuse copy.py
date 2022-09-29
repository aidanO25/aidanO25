# syracuse.py
# This prgram gets a starting value from the user and then prints the Syracuse
# sequence for the starting value


def sec(num):
    result = [num]
    while num != 1:
        if num % 2 == 0:
            num = num / 2
            result.append(int(num))
        else:
            num = 3 * num + 1
            result.append(int(num))

    return result


def main():
    n = int(input("Give an int for its Syracuse sequence: "))
    print(sec(n))

main()
