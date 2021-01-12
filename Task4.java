public class Task {
    public static void main(String[] args) {
        double m = 140;
        double n = 350;
        double nearestNumber = 0;

        if (m == n)
            System.out.println("Найближчим до 10 є обидва числа m та n: " + m);
        else {

            if (m < n)
                nearestNumber = m;
            else
                nearestNumber = n;

            System.out.println("Найближчим до 10 є число: " + nearestNumber);
        }

    }
}



//_______Or_____


public class Task {
public static void main(String[] args){
        double n=11;
        double m=0;
        double b=Math.abs(10-n);
        double c=Math.abs(10-m);  
        
        double nearestNumber = 0;
       
        if (b==c){
            System.out.println("Найближчим до 10 є обидва числа m та n:"+n);
        } else {
        
        if(b>c){
             nearestNumber = m;
        }
        if (b<c) {
              nearestNumber = n;
        }
         System.out.println("Найближчим до 10 є число: " + nearestNumber);

        }
      }

