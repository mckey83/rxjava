package com.example.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Beer {

    public final String name;
    public final String producer;
    public final double price;

    public Beer(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("name", name)
                .append("producer", producer)
                .append("price", price)
                .toString();
    }
}
