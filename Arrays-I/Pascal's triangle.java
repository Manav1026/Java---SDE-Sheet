public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        
       
        for (int i = 0; i <numRows; i++) {
            List<Integer> a = new ArrayList<Integer>();
            for(int j = 0; j <=i; j++) {
                if(j==0 || j==i){
                    a.add(1);
                }else{
                    a.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
                }
            }
            arr.add(a);
        }
        return arr;
    }
