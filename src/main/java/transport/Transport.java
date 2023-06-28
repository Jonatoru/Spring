package transport;

import java.util.Objects;

import static Checks.ValidationUtilities.validateString;

public abstract class Transport {
    private String model;

    /**
     * Парамметры
     *
     * @param model - Модель,
     */

    public Transport(String model) {
        this.model = (validateString(model, "default"));
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return  "Тарнспор: "+ getModel();
    }
}