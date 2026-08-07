public class Main {
    public static void main(String[]args) {

    //Chapter: 5 (Loop control intruction)

           // while loop

/*System.out.println("Using while loop");
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println("Using loops");
 int i = 1;
while (i<=5){
System.out.println(i);
i++;
}
System.out.println("End of While loop");*/

//while (true){
//System.out.println("I an a infinite while loop");
//}

      // Quick quiz
/*int i = 100;
while (i<=200){
    System.out.println(i);
    i++;
}*/

      // do-while loop

/*int b = 10;
do {
    System.out.println(b);
    b++;
} while (b<5);*/

        //For loop

/*for (int i=0; i<=10; i++){
    System.out.println(i);
}*/
                                    // 2n Even number return = 0,2,4,6
                                //2n+1 Odd number return = 1,3,7

       // Quick quiz

/*int n = 3;
for(int i=0; i<n; i++){
    System.out.println(2*i+1);
}*/

        // Decrementing for loop      // Reverce for loop and opossite number print:

/*for (int i=5; i>=0; i--){
    System.out.println(i);            
}*/

        // Break statement

/*for (int i=0;i<5;i++){
    System.out.println(i);
    System.out.println("Java is great");
    if(i==2){
        System.out.println("End the java statement");
        break;
    }*/

          // Continue statement
/*for(int i=0;i<50;i++){
    if(i==2){
continue;
    }
    System.out.println(i);
System.out.println("java is great");*/


         // Practice Qus: 1

/*int n = 5;
for(int i=n; i>0; i--){
    for(int f=0;f<i;f++){
System.out.print("*");

}

System.out.print("\n");
    }*/

     // Pracyice Qus: 2

/*int sum=0;
int n=3;
for (int i=0;i<n;i++){
    sum = sum +(2*i);
}
System.out.print("Sum of even number:");
System.out.println(sum);*/

         // Practice Qs: 3
    
/*int n=5;
for(int i=1;i<=10;i++){
    System.out.printf("%d X %d = %d\n", n,i, n*i);

}*/

      // Practice Qs: 4

/*int n=5;
for(int i=10;i>=1;i--){
    System.out.printf("%d X %d = %d\n", n,i, n*i);
}*/
       // Practice Qs: 6

 /*int n=5;
       //Factorial n * n-1 * n-2 *n-3
       int i=1;
       int Factorial = 1;
       while (i<=n) {
        Factorial *= i;
            i++;
       }
       System.out.println(Factorial);*/

         // Practice Qs: 7

/*int n=8;
int sum =0;
for (int i=1;i<=10;i++){
    sum += n*i;
}
System.out.println(sum);*/
}
    }