traducao = ""
aqui = {}
errada = []

n,m = map(int, input().split())

while n !=0 and m !=0:
    for i in range(n):
        a, b = input().split(" -> ")
        errada.append(a)
        aqui [a] = b
            
    for i in range(m):
        a = input().split()
        
        for  i, vp1 in enumerate(a):
            if vp1 in errada:
                traducao = traducao + aqui[a[i]]
            elif a[i] == " ":
                traducao = traducao + " "
            else:
                traducao = traducao + a[i]
            
    
    print(traducao)

    
    n,m = map(int, input().split())
