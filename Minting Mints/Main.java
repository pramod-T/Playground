n,l=[int(x) for x in input().split()]
c=[]
c.append(n)
for i in range(1,l):
   c.append(sum(c[0:i])-1)
print(sum(c))