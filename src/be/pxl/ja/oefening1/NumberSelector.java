package be.pxl.ja.oefening1;

import java.util.function.Function;

public class NumberSelector {
    private NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
        this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
        NumberFilter numberFilter = new NumberFilter() {
            @Override
            public boolean check(int number) {
                return number % 2 == 0;
            }
        };

        return numberMachine.processNumbers(numberFilter);
	}

    public String showNumbersAbove(int number) {
        return numberMachine.processNumbers((numberOfList) -> numberOfList > number);
    }

	public String printHexNumbers() {
        //return numberMachine.convertNumbers((number) -> Integer.toHexString(number));
        return numberMachine.convertNumbers(Integer::toHexString);
	}
}
