import com.sun.prism.shader.DrawCircle_ImagePattern_AlphaTest_Loader;
import java.util.*;
import java.io.*;

interface IEmpWages {
    public void addCompany(String companyName, int wagesperHr, int maxWorkingHrs, int maxWorkingDays);

    public void calculatorWages();

    public int getTotalSalary();
}
class CompanyWages {
    String COMPANY_NAMES;
    int Wages_pr_hr;
    int Max_working_days;
    int Max_working_hrs;
    int totalEmpWages;

    CompanyWages(String companyName, int wagesperHr, int maxWorkingHrs, int maxWorkingDays) {
        COMPANY_NAMES = companyName;
        Wages_pr_hr = wagesperHr;
        Max_working_days = maxWorkingDays;
        Max_working_hrs = maxWorkingHrs;
        totalEmpWages = 0;
    }

    void setTotalEmpWages(int totalEmpWages) {
        this.totalEmpWages = totalEmpWages;
    }

    public String toString() {
        System.out.println("Details of the Company and its Employee");
        System.out.println("Wages per hours" + Wages_pr_hr);
        System.out.println("Total Working Days" + Max_working_days);
        System.out.println("Total Working Hrs" + Max_working_hrs);
        System.out.println("Total Wages per moths is" + totalEmpWages);
    }
}
        class EmpWages implements IEmpWages {
            public static final int Part_Time =1;
            public static final int Full_Time = 2;
            ArrayList<CompanyWages> companies;
            HashMap<String, Integer> totalEmpWages;
            @Override
            public void addCompany(String companyName, int wagesperHr, int maxWorkingHrs, int maxWorkingDays) {
CompanyWages company = new CompanyWages(companyName, wagesperHr, maxWorkingHrs,maxWorkingDays);
companies.add(company);
totalEmpWages.put(companyName, 0);
            }
int generateEmployeeType()
{
    return (int) (Math.random() * 100 ) % 3;
}
int getWorkingHrs(int empType)
{
    switch (empType){
        case Full_Time:
            return 8;
        case Part_Time:
            return 4;
        default:
            return 0;
    }
}
            @Override
            public void calculatorWages() {
for(CompanyWages company : companies) {
    int totalWages = calculatorWages(company);
    company.setTotalEmpWages(totalWages);
    System.out.println(company);
}
            }
            int calculateTotalWages(CompanyWages companyWages)
            {
                System.out.println("Computation of Wages " + companyWages.COMPANY_NAMES+ "employee");
                System.out.printf("%4s\t%4s\t%2s\t%4s\n", "Day", "workinghrs", "Wage", "Total working hrs");
                int workingHrs, totalWages =0;
        for(int day =1, totalWorkingHrs = 0; day <= companyWages.Max_working_days && totalworkingHrs <= companyWages.Max_working_hrs; day++, totalWorkingHrs += workingHrs){
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs* companyWages.Wages_pr_hr;
            return totalWages;
            }
        public int getTotalEmpWages(String companyName)
                {
            return totalWages.get(companyName);
            }
        public static void main(String args[]){
            EmpWages EmpWages = new EmpWages();
            EmpWages.addCompany("Google", 4, 30, 100);
                EmpWages.addCompany("MicroMax", 5, 40, 170);
                EmpWages.addCompany("Pixel", 6, 45, 135);
EmpWages.calculateTotalWages();
String query = "Google";
int totalWages = EmpWages.getTotalSalary(query);
System.out.println("Total Emply Wag for " + query + "Company is " + totalWages);

            }
            }

        }


