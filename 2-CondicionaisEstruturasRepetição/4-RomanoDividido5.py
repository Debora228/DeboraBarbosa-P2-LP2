romano = {'I':1,'V':5,'X':10,'L':50,'C':100,'M':1000}
print(romano)

a = input()
tam = len(a) -1
num = romano[a[0]]

for i in range(tam):
    if i == tam:
        break
    if romano[a[i]] <= romano[a[i+1]]:
        num = num + romano[a[i]]
    if romano[a[i]] > romano[a[i+1]]:
        num = num - romano[a[i]]

print(num)
