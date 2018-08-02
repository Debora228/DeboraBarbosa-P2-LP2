Prog1 = []
DuplMatr= []

for i in range (75):
    if i<45:
        Prog1.append(int(input()))
    else:
        a = int(input())
        cont =0
        while cont<len(Prog1) and a != Prog1[cont] :            
            cont = cont + 1
        if cont < len(Prog1):
            DuplMatr.append(a)

print(DuplMatr)
