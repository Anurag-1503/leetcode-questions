class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,res,0);
        return res;
        
    }
    
    public void helper(char[][] board , List<List<String>> res , int col){
        
        if(col == board.length){
            saveBoard(board,res);
            return;
        }
        
        for(int row = 0 ; row < board.length ; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,res,col+1);
                board[row][col] = '.';
            }
            
            
        }
    }
    
    
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal check
        for(int j = 0; j < board.length ; j++){
            if(board[row][j] == 'Q')
                return false;
        }
        //vertical check
        for(int i = 0; i < board.length ; i++){
            if(board[i][col] == 'Q')
                return false;
        }
        
        //upperLeft check
        int r = row;
        for(int c = col ; c >= 0 && r >= 0 ; c-- , r--){
            if(board[r][c] == 'Q')
                return false;
        }
        
        //upperRight
        r = row;
        for(int c = col ; c < board.length && r >= 0 ; c++ , r--){
            if(board[r][c] == 'Q')
                return false;
        }
        
        //lowerLeft
        r = row;
        for(int c = col ; c >= 0 && r < board.length ; c-- , r++){
            if(board[r][c] == 'Q')
                return false;
        }
        
        //lowerRight
        r = row;
        for(int c = col ; c < board.length && r < board.length ; c++ , r++){
            if(board[r][c] == 'Q')
                return false;
        }
        
        return true;
        
    }
    
    public void saveBoard(char[][] board , List<List<String>> res){
        String row = "";
        List<String> newboard = new ArrayList<>();
        
        for(int i = 0 ; i < board.length ; i ++){
            row = "";
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newboard.add(row);
        }
        res.add(newboard);
    }
}