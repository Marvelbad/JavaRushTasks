package com.javarush.task.jdk13.task41.task4114;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", new Operation() {
            @Override
            public void execute(int operand1, int operand2) {
                processor.plus(operand1, operand2);
            }
        });

        operationMap.put("-", (a, b) -> processor.minus(a, b));

        operationMap.put("*", processor::multiply);

        operationMap.put("/", processor::divide);

        operationMap.put("%", (a, b) -> processor.remainder(a, b));
    }

    public void calculate(int operand1, String operationSign, int operand2) {
        Operation operation = operationMap.get(operationSign);
        if (operation == null) {
            throw new IllegalStateException("no operation registered for '%s'".formatted(operationSign));
        }
        operation.execute(operand1, operand2);
    }
}
