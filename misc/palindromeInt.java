class Solution {
    public boolean isPalindrome(int x) {
    
      if(x<0) return false;
      long x1=x;
      long res=0;
      while(x>0){
        res+=x%10;
        x/=10;
        res*=10;
      } 
      res/=10;
      if (res==x1) return true;
      else return false;
    }
}