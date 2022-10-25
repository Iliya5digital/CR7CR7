import math
 
input_numbers = input()
user_list = [int(a)for a in input_numbers if a.isdigit()]
 
total = 0
while total < 9:
    
    for i in range(len(user_list)):
        user_list[i] = int(user_list[i])
        total += user_list[i]
    if total < 9:
 
        print(total)
        break 
else:
    total= math.trunc(total)
    total = sum(map(int, str(total)))
    
    print(total)