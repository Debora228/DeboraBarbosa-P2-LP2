a = int(input())
b = int(input())
cont = 0

if a <b:
    fim = a
else:
    fim = b
    
for i in range(50,fim):
    if i%a ==0 and i%b == 0:
        cont = cont +1

print(cont)
