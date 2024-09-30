def calculate_salary(hours_worked):
    if hours_worked < 0:
        return "Hour cannot be negative"
    elif hours_worked > 168:
        return "Impossible to work more than 168 hours weekly"
    elif hours_worked <= 40:
        return hours_worked * 200
    else:
        return 8000 + (hours_worked - 40) * 300


hours_worked = int(input("Enter the number of hours worked: "))
if 0 <= hours_worked <= 168:
    salary = calculate_salary(hours_worked)
    print("Salary: ", salary)
else:
    print("Invalid input. Hours worked should be between 0 and 168.")