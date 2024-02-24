import java.util.Scanner;
abstract class Account{ double interest; double amount;
abstract double calculateinterest();}
class FD extends Account { double interest;
double amount1; int noOfDays, age;
double calculateinterest() {
if (amount1 > 10000000) {
if (noOfDays >= 7 && noOfDays <= 14) { interest = amount1 * 6.5 / 100;}
else if (noOfDays >= 15 && noOfDays <= 45) { interest = amount1 * 6.75 / 100;}
else if (noOfDays >= 45 && noOfDays <= 60) { interest = amount1 * 8 / 100;}
else if (noOfDays >= 61 && noOfDays <= 184) { interest = amount1 * 8.5 / 100;}
else if (noOfDays >= 185 && noOfDays <= 365) { interest = amount1 * 10 / 100;}
else return 0;}
else {
if (age <= 60) {
if (noOfDays >= 7 && noOfDays <= 14) { interest = amount1 * 4.5 / 100;}
else if (noOfDays >= 15 && noOfDays <= 29) { interest = amount1 * 4.75 / 100;
} else if (noOfDays >= 30 && noOfDays <= 45) { interest = amount1 * 5.5 / 100;
} else if (noOfDays >= 45 && noOfDays <= 60) { interest = amount1 * 7 / 100;
} else if (noOfDays >= 61 && noOfDays <= 184) { interest = amount1 * 7.5 / 100;
} else if (noOfDays >= 185 && noOfDays <= 365) { interest = amount1 * 8 / 100;
} else return 0;
} else {
if (noOfDays >= 7 && noOfDays <= 14) { interest = amount1 * 5 / 100;
} else if (noOfDays >= 15 && noOfDays <= 29) { interest = amount1 * 5.25 / 100;
} else if (noOfDays >= 30 && noOfDays <= 45) { interest = amount1 * 6 / 100;
} else if (noOfDays >= 45 && noOfDays <= 60) { interest = amount1 * 7.5 / 100;
} else if (noOfDays >= 61 && noOfDays <= 184) { interest = amount1 * 8 / 100;
} else if (noOfDays >= 185 && noOfDays <= 365) { interest = amount1 * 8.5 / 100;
} else return 0;
}}
return interest;
}}
class RD extends Account{
double interestRate; double amount;
int months; int age;
double calculateinterest(){ if(age<60){
if (months > 0 && months <= 6) { interestRate=amount * 7.5 / 100;
} else if (months > 6 && months <= 9) { interestRate=amount * 7.75 / 100;
} else if (months > 9 && months <= 12) { interestRate=amount * 8 / 100;
} else if (months > 12 && months <= 15) { interestRate=amount * 8.25 / 100;
} else if (months > 15 && months <= 18) { interestRate=amount * 8.5 / 100;
} else if (months > 18 && months <= 21) { interestRate=amount* 8.75 / 100;
} else return 0;} else
{
if (months > 0 && months <= 6) { interestRate = amount * 8 / 100;
} else if (months > 6 && months <= 9) { interestRate = amount * 8.25 / 100;
} else if (months > 9 && months <= 12) { interestRate = amount * 8.5 / 100;
} else if (months > 12 && months <= 15) { interestRate = amount * 8.75 / 100;
} else if (months > 15 && months <= 18) { interestRate = amount * 9 / 100;
} else if (months > 18 && months <= 21) { interestRate = amount * 9.25 / 100;
} else return 0;
}
return interestRate;
}}
class SB extends Account{

double amount2; String type;
double calculateinterest(){ if(type=="NRI"){
return amount2 * 6/100;}
else{
return amount2 * 4/100;}}}
public class exp {
public static void main(String[] args) { int ch=0;
while(ch!=4){
System.out.println(" My Bank 21BCS8766 \n 1) FD Account"); System.out.println("2) RD Account");
System.out.println("3) SB Account"); System.out.println("4) exit"); Scanner sc=new Scanner(System.in); ch=sc.nextInt();
switch (ch){ case 1:{
FD fd=new FD(); System.out.println("enter amount"); fd.amount1=sc.nextDouble(); System.out.println("enter no. of days"); fd.noOfDays=sc.nextInt(); System.out.println("enter age"); fd.age=sc.nextInt();
if(fd.amount1<=0 || fd.age<=0 || fd.noOfDays<7){ System.out.println("Invalid data");
 
break;
}
System.out.println("Interest gained is "+fd.calculateinterest()); break;
}
case 2:{
RD rd=new RD(); System.out.println("enter amount"); rd.amount=sc.nextDouble(); System.out.println("enter no. of months"); rd.months=sc.nextInt(); System.out.println("enter age"); rd.age=sc.nextInt();
if(rd.amount<=0 || rd.age<=0 || rd.months<6){ System.out.println("Invalid data");
break;
}
System.out.println("Interest gained is "+rd.calculateinterest());
break;
}
case 3:{
SB sb=new SB();
System.out.println("enter type NRI or Normal"); sb.type=sc.next();
System.out.println("enter amount"); sb.amount2=sc.nextDouble(); if(sb.amount2<=0){
System.out.println("Invalid data"); break;}
System.out.println("Interest gained is "+sb.calculateinterest());

break;}
default:{ 
break;
}}}}}
