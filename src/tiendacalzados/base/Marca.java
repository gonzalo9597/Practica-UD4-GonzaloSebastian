package barcafeteria.base;

import org.bson.types.ObjectId;

public class Marca {
    private ObjectId id;
    private String departamento;

    public Marca(String departamento) {
        this.departamento = departamento;
    }

    public Marca() {

    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return departamento;
    }
}