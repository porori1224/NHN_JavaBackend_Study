/**
 * 부모 클래스의 기능을 확장하는 예제
 */
class Employee2 {
    protected String name;
    protected double baseSalary;

    public Employee2(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void printPaySlip() {
        System.out.println("\n=== 급여 명세서 ===");
        System.out.println("직원명: " + name);
        System.out.println("기본급: " + baseSalary);
        System.out.println("총 급여: " + calculateSalary());
    }
}

class Manager extends Employee2 {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // TODO 23: 부모의 급여 계산 결과에 bonus를 더하기
        // super.calculateSalary() 호출
        return super.calculateSalary() + bonus;
    }

    @Override
    public void printPaySlip() {
        // TODO 24: 부모의 printPaySlip() 호출 후 추가 정보 출력하기
        // super.printPaySlip() 호출
        // "보너스: [bonus]" 출력
        // "=================" 출력
        super.printPaySlip();
        System.out.println("보너스: " + bonus);
        System.out.println("=================");
    }
}

class Developer extends Employee2 {
    private double overtimePay;
    private int overtimeHours;

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
        this.overtimePay = 30000;  // 시간당 야근 수당
    }

    public void setOvertimeHours(int hours) {
        this.overtimeHours = hours;
    }

    @Override
    public double calculateSalary() {
        // TODO 25: 부모의 급여 계산 결과에 야근 수당 더하기
        // super.calculateSalary() + (overtimeHours * overtimePay)
        return super.calculateSalary() + (overtimeHours * overtimePay);
    }

    @Override
    public void printPaySlip() {
        // TODO 26: 부모의 printPaySlip() 호출 후 야근 정보 출력하기
        // super.printPaySlip() 호출
        // "야근 시간: [overtimeHours]시간" 출력
        // "야근 수당: [overtimeHours * overtimePay]" 출력
        // "=================" 출력
        super.printPaySlip();
        System.out.println("야근 시간: " + overtimeHours + "시간");
        System.out.println("야근 수당; " + overtimeHours * overtimePay);
        System.out.println("=================");
    }
}

// 테스트
public class MethodExtensionExample {
    public static void main(String[] args) {
        // TODO 27: 세 타입의 직원 객체 생성하기
        // Employee: "김직원", 2500000
        // Manager: "이과장", 3500000, 1000000 (보너스)
        // Developer: "박개발", 3000000
        Employee2 employee = new Employee2("김직원", 2500000);
        Manager manager = new Manager("이과장", 3500000, 1000000);
        Developer developer = new Developer("박개발", 3000000);

        // TODO 28: 개발자의 야근 시간 20시간으로 설정하기
        developer.setOvertimeHours(20);

        // TODO 29: 각 직원의 급여 명세서 출력하기
        employee.printPaySlip();
        manager.printPaySlip();
        developer.printPaySlip();
    }
}