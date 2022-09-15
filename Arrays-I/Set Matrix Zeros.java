public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int b [][] = new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(matrix[i][j] == 0){
                  for(int x=0;x<n;x++){
                      b[x][j] = -1;
                  }for(int y=0;y<m;y++){
                      b[i][y] = -1;
                  }
               }
           }
       }
        
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
              if(b[i][j] == -1){
                   matrix[i][j] = 0;
               }
        }
        }
            
            
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.println(matrix[i][j]);
           }
        }
        
    }
