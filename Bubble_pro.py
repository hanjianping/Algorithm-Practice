array=[10,23,2,4,10,2,45,1,20]
for i in range(len(array)):
    for k in range(i+1,len(array)):
        print k
        if array[i]>array[k]:
            array[i],array[k]=array[k],array[i]
        print array
print array
