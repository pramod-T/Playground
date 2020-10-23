n=input()
l=[x for x in n ]
l.reverse()
a=['A','B','C','D','E','F','G']
for i in range(len(l)):
    if l[i] in a:
        l[i]=a.index(l[i])+10
for i in range(0,len(l)):
    if i==0: 
        v=int(l[i])
    else:
        v=v+(int(l[i])*(17**i))
print(v)