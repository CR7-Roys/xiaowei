
public class xiaowei {
            public static void main(String[] args){
                int a[] = {6,37,26,12,58,10,22,43};
                for(int i=0;i<a.length-1;i++){
                    for(int j=0;j<a.length-i-1;j++){
                        if(a[j]>a[j+1]){
                            int temp = a[j];
                            a[j]= a[j+1];
                            a[j+1] = temp;
                        }
                    }
                }
                for(int r=0;r<a.length;r++){
                    System.out.print(a[r]+"\t");
                }
            }
}