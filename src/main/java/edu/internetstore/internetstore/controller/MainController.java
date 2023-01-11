package edu.internetstore.internetstore.controller;

import edu.internetstore.internetstore.entity.Product;
import edu.internetstore.internetstore.service.ClientService;
import edu.internetstore.internetstore.service.ProductService;
import edu.internetstore.internetstore.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class MainController {

    private final ClientService clientService;
    private final ProductService productService;
    private final SupplierService supplierService;

    public MainController(ClientService clientService, ProductService productService, SupplierService supplierService) {
        this.clientService = clientService;
        this.productService = productService;
        this.supplierService = supplierService;
    }

    @GetMapping("/index")
    public ModelAndView index(ModelMap model) {
        String name = "Ihor";
        model.addAttribute("name", name);
        return new ModelAndView("/index", model);

    }

    @GetMapping("/test")
    public String test(ModelMap model) {
        String name = "Ihor";
    return "index";
//        model.addAttribute("name", name);
//        return new ModelAndView("/index", model);

    }

    @GetMapping("/products")
    public String getAllProducts(@ModelAttribute("model") ModelMap model) {
        List<Product> products = productService.getAllData();
        model.addAttribute("products", products);
        return "products";
    }



    @PostMapping("/insert-product")
    public ModelAndView insertNewProduct(
            @ModelAttribute("model") ModelMap model,
            @RequestParam(name = "id") long id,
            @RequestParam(name = "name") String name,
            @RequestParam(name = "price") String price) {

        productService.insertData(Product.builder()
                .id(id)
                .name(name)
                .price(new BigDecimal(price))
                .build());
            model.addAttribute("products", productService.getAllData());
        return new ModelAndView("/products", model);
    }
}
