package student_sergey_egorichev.lesson_8_2.level_6;

import java.lang.reflect.*;

class FraudDetector {

    static FraudDetectionResult isFraud(Transaction t) {
        String[] checkList = {
                "FraudRuleFakeTrader",
                "FraudRuleForbiddenCity",
                "FraudRuleForbiddenCountry",
                "FraudRuleMaxAmount",
                "FraudRule5"
        };

        for (String ruleName : checkList) {
            String fullClassName = "student_sergey_egorichev.lesson_8_2." + ruleName;
            try {
                Object ruleObject = Class.forName(fullClassName).newInstance();
                boolean result = (boolean) ruleObject.getClass().getMethod("checkFraud", Transaction.class).invoke(ruleObject, t);
                if (result) {
                    System.out.println(t.toString());
                    return new FraudDetectionResult(true, ruleName);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return new FraudDetectionResult(false, "All Rules Pass");
    }
}