package POO.Enumss.Exercicio1.Entities;

import POO.Enumss.Exercicio1.Entities.Enums.WorkerLevel;

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
        Calendar calendar = Calendar.getInstance();

        for( HourContract c: contract ) {

            calendar.setTime(c.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = calendar.get(Calendar.MONTH); // manipulaçao calendar, revisar a aula

            if(c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
