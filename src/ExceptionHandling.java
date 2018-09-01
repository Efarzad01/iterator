public class ExceptionHandling {
    public static void main(String[] args) {

        try{
        int a= 8;
        int output = a / 0;
              System.out.println(output);
          }
          catch (Exception ex){
         //or catch (ArithmeticException ex)
              System.out.println("hey u can not divide a number with zero ");
          }
}
}


