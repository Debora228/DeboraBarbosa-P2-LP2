n= int(input(" "))
a = [ ]

for i in range(n):
    a.append(int(input()))

inverter = ""
for i in range (n-1,-1,-1) :
    inverter = inverter + str(a[i]) + " "

print(inverter)

deslocamento = ""
contador= 0
while contador<n :
    indice = (1 + contador) % n
    deslocamento = deslocamento + str(a[indice]) + " "
    contador =contador +1

print(deslocamento)

a.sort()
decrescente= ""
for i in range (n-1, -1,-1):
    decrescente = decrescente + str(a[i]) + " "

print(decrescente)


