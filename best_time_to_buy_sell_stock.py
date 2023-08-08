def maxProfit(prices:list[int])->int:
    profit=0
    
    #buying
    
    min=prices[0]
    
    for i in range(len(prices)):
        if prices[i]<=min:
            min=prices[i]
    
    
    #selling
        elif prices[i]-min > profit:
            profit=prices[i]-min
    return profit

prices=[7,6,4,3,1]

ans=maxProfit(prices)
print(ans)