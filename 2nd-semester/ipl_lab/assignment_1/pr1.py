def check_num(num):
    if num % 2 == 0:
        print("The number is even")
    else:
        print("The number is odd")

# Reading the input 
num = int(input("Enter a number: "))
# Checking if the number is even or odd
check_num(num)