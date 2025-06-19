/*import java.util.Scanner;
class loop1
{
public static void main(String[] args)
{
for(int i=0;i<=10;i++)
{
System.out.println(" Bright IT Career ");
}
}
}*/

/*import java.util.Scanner;
class loop2
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}*/


/*import java.util.Scanner;
class loop3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
int a=s.nextInt();
System.out.println("Enter b value:");
int b=s.nextInt();
if(a==b)
{
System.out.println("both are equal");
}
else if(a!=b)
{
System.out.println("both are not equal");
}
}
}*/

/*import java.util.Scanner;
class loop4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
int a=s.nextInt();
{
if(a%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}
}
}
}*/


/*import java.util.Scanner;
class loop5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
int a=s.nextInt();
System.out.println("Enter b value:");
int b=s.nextInt();
System.out.println("Enter c value:");
int c=s.nextInt();
if((a>b)&&(a>c))
{
System.out.println("a is large");
}
else if(b>c){
System.out.println("b is large");
}
else
{
System.out.println("c is large");
}
}
}*/


/*import java.util.Scanner;
class loop7
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i=1;
do
{
System.out.println(i);
i++;
}while(i<=10);
}
}*/


/*import java.util.Scanner;
class loop8
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter n:");
int n=s.nextInt();
int sum=0,rem=0;
int b=n;
while(n>0){
rem=n%10;
sum+=Math.pow(rem,3);
n/=10;}
if(b==sum){
System.out.println("given number is amstrong number");
}
else
{
System.out.println("given number is not amstrong number");
}
}
}*/


/*import java.util.Scanner;
class loop9 {
public static void main(String[] args) {
int n,count=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number:");
n=s1.nextInt();
for(int i=1;i<=n;i++) 
{
if(n%i==0){
count+=1;
}
}
if(count==2) {
System.out.println("The given Number "+n+" is a prime Number");
}
else {
System.out.println("The given number "+n+"is a not prime number:");
}
}
}*/


/*import java.util.Scanner;

class loop10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int temp = num, rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (num == rev)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is NOT a Palindrome.");
    }
}*/



import java.util.Scanner;

class loop11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter g:");
        String g=s.next();
        switch(g){
case "m":System.out.println("Male");
case "M":System.out.println("Male");
case "f":System.out.println("FeMale");
case "F":System.out.println("FeMale");
default:System.out.println("Invalid");
}
}
}
