l,b = input().split()
l = int(l)
b = int(b)

ant = 2
primo = {}
for i in range(l,b+1):
    r = 2
    c = 1
    while r<i:
        if i%r ==0:
            c = 0
        r = r + 1
    if c == 1 :
        print ("i", i)
        if (len(primo)==0):
            primo[i- ant] = 1
            ant = i
            print(primo)
        else:
            for j in range(len(primo)):
                if i-ant in primo:
                    primo[i-ant] = primo[i-ant] + 1
                    print(primo)
                    break 
                else:
                    primo[i- ant] = 1
                    ant = i
                    print(primo)
                    break

maxi = 0
for i in range(1,len(primo)+1):
    if maxi in primo:
        maxi = primo[i]
print("max", maxi)    
#abrir um dicionário com os números primos e colocar
        #a diferença entre ele e o primo anterior
