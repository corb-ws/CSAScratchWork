public class EulerRegister {
   public static void main(String[] args) {
      long num=0;
      long numSquared;
      long sum=0;
      while(num<=873000) {
         if(num % 2==1) {
            numSquared=(long)Math.pow(num,2);
            sum+=numSquared;
         }
         num+=1;
      }
   System.out.println(sum);
   }
}
      