a,b = input().split(" ")
a=int(a)
b=int(b)
cont=0
for i in range(a,b+1):
    if i % 4 ==0:
        print(i)
        cont=1
    elif i%400 == 0:
        print(i)
        cont=1
if cont==0:
    print("-1\n")
