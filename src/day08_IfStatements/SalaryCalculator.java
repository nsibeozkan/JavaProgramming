package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
         int hourlyRate = 50;
         int weeklyHours = 45;
         int salaryBeforeTax = hourlyRate * weeklyHours * 52;
         double stateTax = salaryBeforeTax * 0.06;
         double federalTax = salaryBeforeTax * 0.26;
         double totalTax = stateTax + federalTax;
         double netIncome = salaryBeforeTax - totalTax ;
        System.out.println(" Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("NetIncome tax = $" + netIncome);











    }


}









/*
Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

 */