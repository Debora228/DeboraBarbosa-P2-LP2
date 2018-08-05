num = int(input())
a = []


for i in range(num):
    a.append(int(input()))


if num <=1:
    print("1")
else:
    dif = abs(a[0] - a[1])
    prim = a[1]
    cont = 1

    for i in range(2,num):
        if dif != abs(prim - a[i]):
            dif = abs(prim - a[i])
            cont = cont + 1
        prim = a[i]
    print(cont)
