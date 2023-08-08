def longestSubArrayWithSumK(a:list[int],k:int)->int:
    current_sum=0
    max_length=0
    for i in range(len(a)):
        for j in range(i,len(a)):
            current_sum += a[j]
            
            if current_sum==k:
                sub=a[i:j+1]
                max_length=max(len(sub),max_length)
        current_sum = 0
    return max_length


nums=[1,2,1,3]
ans=longestSubArrayWithSumK(nums,3)
print(ans)
            