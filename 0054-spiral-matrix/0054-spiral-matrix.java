class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<> ();
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0, right =n-1, top =0, bottom=m-1;
         while(m*n > spiral.size())
         {
             for(int i =left; i<=right ; i++)
             {
                 spiral.add(matrix[top][i]);
             }
             for(int i =top+1 ; i<=bottom ; i++)
             {
                 spiral.add(matrix[i][right]);
             }
             if( top!= bottom)
                {
                 
                 for(int i =right -1; i>=left ; i--)
                    {
                     spiral.add(matrix[bottom][i]);
                    }
                }
             
             if( left!= right )
                {
                  for(int i =bottom-1; i>top ; i--)
                    {
                         spiral.add(matrix[i][left]);
                     }
                 
                }
             
            top++;
            bottom--;
            left++;
            right--;
         }
        return spiral;
    }
}
