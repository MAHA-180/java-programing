#simple
class Main {
    public static void main(String[] args) {
        int[][] arr;
        arr=new int[1][3];
        arr[0][0]=2;
        arr[0][1]=5;
        arr[0][2]=7;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
    }
}
OUTPUT:
2
5
7

#2*2 matrix
class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();  
        }
        
    }
}
OUTPUT:
1 2 
4 5 
  
#3*3 matrix
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 3; j++) {       
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();              
        }
    }
}
               OR

class Main {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[3][3]; 
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

OUTPUT:
1 2 3 
4 5 6 
7 8 9 

#2*3matrix
class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int[][] arr = new int[x][y]; 
        int num = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
1 2 3 
4 5 6 

#3*3 reverse matrix
class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int[][] arr = new int[x][y]; 
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = num++;
            }
        }
        for (int i = 0; i < x / 2; i++) {
            int temp = arr[i][1];
            arr[i][1] = arr[x - 1 - i][1];
            arr[x - 1 - i][1] = temp;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

            OR
class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int[][] arr = new int[x][y];
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = num++;
            }
        }
        if (x > 1) {
            int temp = arr[0][1];
            arr[0][1] = arr[x - 1][1];
            arr[x - 1][1] = temp;
        } else {
            
            System.out.println("No swap needed");
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}              
OUTPUT:
1 8 3 
4 5 6 
7 2 9 

