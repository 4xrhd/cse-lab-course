num = int(input("Enter an integer number: "))

if num % 2 == 0 and num % 5 == 0:
    print("Multiple of 2 and 5 both ")
elif num % 2 == 0:
    if num % 5 != 0:
        print(num)
    else:
        print("Not a multiple we want ")
elif num % 5 == 0:
    print(num)
else:
    print(" Not a multiple we want")