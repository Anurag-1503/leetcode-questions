class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fives = 0;
        int tens = 0;
        
        for(int i = 0 ; i < bills.length ; i++) {
            
            //if we encounter 5 dollar bill
            if(bills[i] == 5)
                fives++;
            //if we encounter 10 dollar bill
            else if(bills[i] == 10) {
                
                // we should have at least a 5 dollar bill
                if(fives >= 1)
                {
                    fives--;
                    tens++;
                }
                else
                    return false;
            }
            //if we encounter 20 dollar bill
            else {
                //either we should have a ten and a 5 dollar bill
                if(tens >= 1 && fives >= 1)
                {
                    tens--;
                    fives--;
                }
                //either we should have at least three 5 dollar bill
                else if(fives >= 3)
                     fives -= 3;
                else
                    return false;
            }
                
        }
        
        return true;
        
    }
}