package simple.sample;

import simple.AbstractCondition;
import simple.EvaluationException;

/**
 * @author Ray Krueger
 */
public class OlderThanCondition extends AbstractCondition<Person> {

    private Person other;

    public OlderThanCondition(Person other) {
        this.other = other;
    }

    public boolean isSatifiedBy(Person fact) throws EvaluationException {
        return fact.getAge() > other.getAge();
    }
}
