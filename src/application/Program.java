package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Telefone: ");		
		String phone = sc.nextLine();

		System.out.print("Quantos funcionários tem o departamento? ");
		int qtdFunc = sc.nextInt();
		sc.nextLine();
		
		Department dept = new Department(name, payDay, email, phone);
		for(int i = 0; i < qtdFunc; i++) {
			System.out.printf("Dados do funcionário %d: %n", i+1);	
			System.out.print("Nome: ");
			String funcName = sc.nextLine();
			System.out.print("Salário: ");	
			double funcSal = sc.nextDouble();			
			dept.addEmployee(new Employee(funcName, funcSal));
			sc.nextLine();
		}
		
		showreport(dept);
		sc.close();
	}

	private static void showreport(Department dept) {
		System.out.println("\nFOLHA DE PAGAMENTO:");
		System.out.printf("Departamento %s = R$ %.2f%n", dept.getName(), dept.payroll());
		System.out.printf("Pagamento realizado no dia %d%n", dept.getPayDay());
		System.out.println("Funcionários:");
		for(Employee employee : dept.getEmployees())
			System.out.printf("%s%n", employee.getName());
		System.out.printf("Para dúvidas favor entrar em contato: %s%n", dept.getAddress().getEmail());		
	}
	
}
