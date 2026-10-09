//public class Main {
   // public static void main(String[]args) {

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


                                               // CHAPTER: 6 (ARRAYS)

      // Array write 3 diffrent style

/*int[] marks = new int[5];
marks[0] = 20;
marks[1] = 40;
marks[2] = 60;
marks[3] = 80;
marks[4] = 100;
System.out.println(marks[4]);*/

//int[] marks = {10,20,30,40,50,60};         // name.length(length of number)
//System.out.println(marks.length);
//System.out.println(marks[2]);

      // Displaying on array(using Naive Way)

/*int[] marks = {10,20,30,40,50};
//System.out.println(marks.length);
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[3]);
System.out.println(marks[4]);
       //OR
System.out.println("Using for loop");
for(int i=0;i<marks.length;i++){
System.out.println(marks[i]);
}

System.out.println("Using for loop in Reverse order");
for(int i=marks.length -1;i>=0;i--){
System.out.println(marks[i]);
}
      // Using for-each-loop

System.out.println("Using for each loop");
for(int element: marks){
    System.out.println(element);
}*/

 // MULTIDIMENTIONAL ARRAY

/*int [] marks;  // 1-D array
int [] [] flats;  // 2-D array
flats = new int [2][3];
flats[0][0] = 101;
flats[0][1] = 102;
flats[0][2] = 103;
flats[1][0] = 104;
flats[1][1] = 105;
flats[1][2] = 106;
for(int i=0;i<flats.length;i++){
    for(int j=0;j<flats[i].length;j++){
        System.out.print(flats[i][j]);
    System.out.print(" ");
    }
System.out.println("");
}*/
      // Practice Qs:1

/*float[] marks = {10.5f,20.5f,30.6f,40.9f};
float sum = 0;
for(float element:marks){
    sum = sum + element;
}
System.out.println("The sum of this element : " + sum);*/

   //Practice Qs:2 

/*float[] marks = {10,20,30,40,50};
float num = 30;
boolean Inmarks = false;
for(float element:marks){
    if(num==element);
    Inmarks = true;
    break;
}
if(Inmarks){
    System.out.println("The value present in array");
}
else{
    System.out.println("the value are not present in array");
}*/

                             // Chapter: 7 Methods In Java

/*public class Main {
static int logic(int x, int y){
    int z;
      if(x>y){
            z = x + y;
        }
        else{
            z = (x + y)*5;
        }  
        return z;
    }
    public static void main(String[]args) {
        int a = 5;
        int b = 7;
        int c;
        // Calling the logic method
        // Method invocation using object creation
       // main obj = new main();
        //c = obj.logic(a,b);
        c = logic(a,b);
    int a1 = 7;
    int b1 = 5;
    int c1;
    c1 = logic(a1,b1);
    System.out.println(c);
    System.out.println(c1);*/

/*public class Main {
    static void change(int a){
        a = 98;
    }
    static void change1(int [] arr){
        arr[0] = 98;
    }
public static void main(String[]args) {
    //Case:1 changing the integer
    int x = 45;
    change(x);
    System.out.println("The value of x after change is: " + x);

  // Case:2 changing the array
int [] marks = {53,50,60,70,80};
change1(marks);
System.out.println("The value of marks after change is: " + marks[0]);*/

/*public class Main{
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
          OR
   static int sum(int ...arr){
    int result = 0;
    for(int a:arr){    
        result = result + a;
    }
    return result;
   }
    public static void main(String[]args){
        System.out.println("The sum of Noting is::" + sum());
        System.out.println("The sum of 4 and 5 is:" + sum(4,5));
        System.out.println("The sum of 4 5 and 6 is:" + sum(4,5,6));
        System.out.println("The sum of 4 56 and 7 is:" + sum(4,5,6,7));*/

/*public class Main{
     // Factorial (0) = 1
     // Factorial (n) = n * factorial(n-1)
     // Factorial (5) = 5 * 4 * 3 * 2 * 1 = 120
     // Factorial (n) = n * n-1 * ....1
     static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
     }
    public static void main(String[]args){
        System.out.println("The factorial is 5: " + factorial(5));
    }
}*/

/*public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;   // kitne terms print karne hain
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + "");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}*/

/*public class Main{
static int factorial(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
        int product = 1;
    
    for(int i=1;i<=n;i++){
      product *= i;
    }
    return product;
    }
}
public static void main(String[]args){

        int n = 4;
System.out.println("The value of n is: " + factorial(n));
System.out.println("The value of n is: " + factorial(4));

    }
}*/