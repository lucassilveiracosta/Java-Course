package POO.Enumss.Exercicio1.Entities;

import POO.Enumss.Exercicio1.Entities.Enums.WorkerLevel;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;

    private String department;
    private List<HourContract> contract = new ArrayList<>();

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, String department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        this.contract.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contract.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;

        for( HourContract c: contract ) {

            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();

            if(c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
