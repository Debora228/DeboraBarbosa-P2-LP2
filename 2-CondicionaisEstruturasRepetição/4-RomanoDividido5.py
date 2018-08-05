romano = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
subtracao = {'IV':4,'IX':0,'XL':40,'CD':400,'CM':900}

a = input()
tam = len(a)-1

num = romano[a[0]]
prim = a[1]

for i in range(tam):
    if prim+a[i] == subtracao.keys(i):
      print("ok")  
    #num = num + romano[a[i]]
    
print(num)
