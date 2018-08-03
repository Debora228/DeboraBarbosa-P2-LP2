a,b = input().split(" ")
crip = ""

if len(a) == len(b) and a.islower() and b.islower() :
    tam = len(a)
    vogal = ['a','e','e','o','u']
    for i in range (tam):
        if a[i]==b[i] and a[i] not in vogal:
            crip = crip + str(i)
        elif i%2==0:
            crip = crip + a[i].upper()
        else:
            crip = crip + '!!'
    print(crip)

else:
    print("ERRO")


#Erro no último teste
