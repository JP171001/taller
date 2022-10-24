package com.example.demo.controller.customMethodsController;

import com.example.demo.service.clientePackage.FacturaAtencionService;
import com.example.demo.service.clientePackage.FacturaCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


// Controller para manejar el metodo de desplegar todos los productos y servicios
@Controller
@RequestMapping
public class DesplegarServiciosController {

    //Inyeccion de dependecia para obtener los metodos de las facturas de atencion
    @Autowired
    FacturaAtencionService facturaAtencionService;

    //Inyeccion de dependecia para obtener los metodos de las facturas de compra
    @Autowired
    FacturaCompraService facturaCompraService;


    //Pantalla para escoger el tiempo entre el listado de los servicios
    @GetMapping("/get_fecha")
    public String getCliente(Model model){
        model.addAttribute("a");
        return "get/escoger_periodo";
    }

    //Pantalla para mostrar los servicios obtenidos
    @GetMapping("/listar_servicios")
    public String showClientes(@RequestParam(value = "fecha1", required = true) String fecha1,
                               @RequestParam(value = "fecha2", required = true) String fecha2,
                               Model model) throws ParseException {

        //Del metodo anterior obtiene ambas fechas para hacer la seleccion
        //Thymyleaf lo retorna como string por lo que hay que parsearlo de nuevo a formato date
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parsed = format.parse(fecha1);
        Date parsed2 = format.parse(fecha2);

        //Se añade al modelos facturas y servicios entre esas fechas
        model.addAttribute("facturasServico", facturaAtencionService.listarPorFechas(parsed,parsed2));
        model.addAttribute("facturasCompra", facturaCompraService.listarPorFechas(parsed,parsed2));

        //Se llama al view
        return "post/servicios_vendidos";
    }
}
