
package tugas3;

public class tugas3 {
    
    private static int SequentialSearch (int[]angka,int data){
        for(int i = 0; i < angka.length; i++){
            if (data==angka [i]){
             return i;   
            }
        }
    return 0;    
}
    public static void main(String[] args){
        int [] angka = {5,8,10,13,17};
        int data = 17;
        
    System.out.println(SequentialSearch(angka,data));
    }
}

class BinarySearch {
    public static void main(String[] args){
        int angka [] = {3,2,5,6,7};
        int kunci = 5;
        int index = angka.length /2;
        boolean ketemu = false;
        
        int tengah = index;
        while(index >= 0 && index < angka.length && ketemu == false){
            if(kunci == angka[index]){
                System.out.println("Data ditemukan pada index ="+ index);
                ketemu = true;
            }else{
                if(kunci < angka[tengah]){
                    index--;
                }else{
                    index++;
                }
            }
        }
    }
}

   
