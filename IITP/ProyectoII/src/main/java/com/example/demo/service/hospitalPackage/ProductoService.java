package com.example.demo.service.hospitalPackage;

import com.example.demo.model.hospitalPackage.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> getAllProducto();

    Producto saveProducto(Producto producto);

    Producto getProductoById(int identificador);

    Producto updateProducto(Producto producto);

    void deleteProducto(int identificador);
}
