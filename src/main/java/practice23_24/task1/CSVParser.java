package practice23_24.task1;

import java.util.HashMap;
import java.util.Map;

public class CSVParser {
    private double income = 0;
    private double expense = 0;
    private Map<String, Double> enterprisesExpenses = new HashMap<>();

    public void calculateMoneyData(String[] record) {
        double incomeTemp = Double.parseDouble(record[6].replace(",", "."));
        double expenseTemp = Double.parseDouble(record[7].replace(",", "."));

        income += incomeTemp;
        expense += expenseTemp;
        calculateEnterprisesExpenses(record[5], expenseTemp);
    }

    public void calculateEnterprisesExpenses(String description, double expense) {
        String[] items = description.trim().split(" {3,}");
        String[] temp = items[1].trim().split("/");
        String enterpriseName = temp[temp.length - 1];

        if (enterprisesExpenses.containsKey(enterpriseName)) {
            double sum = enterprisesExpenses.get(enterpriseName) + expense;
            enterprisesExpenses.put(enterpriseName, sum);
        }
        else {
            enterprisesExpenses.put(enterpriseName, expense);
        }
    }

    public void printData() {
        System.out.printf("ОБЩИЕ ДОХОДЫ: %.2f руб.\n", income);
        System.out.printf("ОБЩИЕ РАСХОДЫ: %.2f руб.\n", expense);
        System.out.println("--------------------------------------------");
        System.out.println("ТАБЛИЦА РАСХОДОВ:");

        for (String entName: enterprisesExpenses.keySet()) {
            System.out.printf("%-35s %.2f руб.\n", entName, enterprisesExpenses.get(entName));
        }
    }
}
