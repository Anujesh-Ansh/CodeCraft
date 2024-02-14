import math


x = int(input("Enter the number:- "))
f=0
for i in range(2,x//2):
    if x%i ==0:
        f=1
        break

if f==1:
    print('0.00')
else:
    # print("{:.2f}".format(math.sqrt(x)))
    print("%.2f"%math.sqrt(x))