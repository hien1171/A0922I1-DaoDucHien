package io_binary_file;

import java.io.*;
import java.util.*;

public class Product {
    private String id;
    private String name;
    private String manufacturer;
    private double price;

    public Product(String id, String name, String manufacturer, double price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
}

