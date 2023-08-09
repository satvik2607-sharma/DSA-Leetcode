def rearrangeArray(nums:list[int])-> list[int]:
    ans=[]
    
    positive_array=[]
    
    for i in range(len(nums)):
        if nums[i]>0:
            positive_array.append(nums[i])
    
    negative_array=[]
    
    for i in range(len(nums)):
        if nums[i]<0:
            negative_array.append(nums[i])
            
    i=0
    j=0
    
    while i<len(positive_array):
        while j<len(negative_array):
            ans.append(positive_array[i])
            ans.append(negative_array[j])
            i+=1
            j+=1
    return ans


nums=[-1,1]
ans=rearrangeArray(nums)
print(ans)