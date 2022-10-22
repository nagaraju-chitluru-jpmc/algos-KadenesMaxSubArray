https://www.youtube.com/watch?v=2MmGzdiKR9Y  
If sum of previous array elements is less than current element then we can discard previous array and
start summing from current element.  

If previous sum is not less than current one, then keep summing.   
While doing so, the previous sum might be
reduced due to current element being negative. For this, we maintain global sum to keep track of max sum value.  