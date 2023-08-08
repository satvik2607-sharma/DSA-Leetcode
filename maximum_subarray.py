def maxSubArray(nums:list[int])->int:
    max_sum=nums[0]
    current_sum=0
    
    
    if len(nums)==1:
        current_sum=max_sum
        
        return max_sum
    
    for i in range(len(nums)):
        current_sum+=nums[i]
        if current_sum>max_sum:
            max_sum=current_sum
        if current_sum<0:
            current_sum=0
            
    return max_sum


nums=[-2,1,-3,4,-1,2,1,-5,4]
ans=maxSubArray(nums)
print(ans)    
    