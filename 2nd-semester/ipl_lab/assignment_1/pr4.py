def is_multiple_of_2_and_5(num):
    if num % 2 == 0 and num % 5 == 0:
        return True
    else:
        return False

num = int(input("Enter an integer: "))

if is_multiple_of_2_and_5(num):
    print(num)
else:
    print("Not multiple of 2 and 5 both")
