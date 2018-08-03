a = input()
lista = a.split()

soma = 0
cont = 0

for i in range (len(lista)):
    if int(lista[i]) >=0 and int(lista[i])%2==0:
        soma = soma + int(lista[i])
        cont =+1

if cont > 0:
    media = soma /cont
    print("{:.2f}".format(media))
else:
    print("-1")
