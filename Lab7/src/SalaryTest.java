import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	void test() {
		SalariedEmployee salEmp1 = new SalariedEmployee();
		salEmp1.setBasePay(100);
		SalariedEmployee salEmp2 = new SalariedEmployee();
		salEmp2.setBasePay(987);
		SalariedEmployee salEmp3 = new SalariedEmployee();
		salEmp3.setBasePay(1234.32);
		
		assertEquals(100.0,salEmp1.getAnnualSalary());
		assertEquals(987.0,salEmp2.getAnnualSalary());
		assertEquals(1234.32,salEmp3.getAnnualSalary());
		
		CommissionEmployee comEmp1 = new CommissionEmployee();
		comEmp1.setBasePay(100);
		comEmp1.setCommissionPercentage(.10);
		comEmp1.setSalesTotal(10);
		CommissionEmployee comEmp2 = new CommissionEmployee();
		comEmp2.setBasePay(1134);
		comEmp2.setCommissionPercentage(.50);
		comEmp2.setSalesTotal(100);
		CommissionEmployee comEmp3 = new CommissionEmployee();
		comEmp3.setBasePay(400);
		comEmp3.setCommissionPercentage(.25);
		comEmp3.setSalesTotal(100);
		
		assertEquals(101.0,comEmp1.getAnnualSalary());
		assertEquals(1184.0,comEmp2.getAnnualSalary());
		assertEquals(425.0,comEmp3.getAnnualSalary());
		
		HourlyEmployee hourEmp1 = new HourlyEmployee();
		hourEmp1.setHourlyRate(10.0);
		hourEmp1.setNumberOfHoursPerWeek(40);
		HourlyEmployee hourEmp2 = new HourlyEmployee();
		hourEmp2.setHourlyRate(15.0);
		hourEmp2.setNumberOfHoursPerWeek(5);
		HourlyEmployee hourEmp3 = new HourlyEmployee();
		hourEmp3.setHourlyRate(8);
		hourEmp3.setNumberOfHoursPerWeek(15);
		
		assertEquals(20800.0,hourEmp1.getAnnualSalary());
		assertEquals(3900.0,hourEmp2.getAnnualSalary());
		assertEquals(6240.0,hourEmp3.getAnnualSalary());
	}

}
