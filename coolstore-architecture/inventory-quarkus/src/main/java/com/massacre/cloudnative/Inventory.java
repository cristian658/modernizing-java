package com.massacre.cloudnative;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "INVENTORY")
public class Inventory extends PanacheEntity {

    @Column
    public int quantity;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inventory{");
        sb.append("quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
