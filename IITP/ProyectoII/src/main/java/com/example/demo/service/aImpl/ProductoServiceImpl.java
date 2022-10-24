package com.example.demo.service.aImpl;

import com.example.demo.dao.hospitalPackage.ProductoDAO;
import com.example.demo.model.hospitalPackage.Producto;
import com.example.demo.service.hospitalPackage.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDAO productodao;

    @Override
    public List<Producto> getAllProducto() {
        return productodao.findAll();
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productodao.save(producto);
    }

    @Override
    public Producto getProductoById(int identificador) {
        return productodao.findById(identificador).get();
    }

    @Override
    public Producto updateProducto(Producto producto) {
        return productodao.save(producto);
    }

    @Override
    public void deleteProducto(int identificador) {
        productodao.deleteById(identificador);

    }
}
