package com.wlliu.utils;

import com.wlliu.entity.Product;
import com.wlliu.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class TestService {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepo productRepo;


    static ExecutorService executorService = Executors.newFixedThreadPool(2);


    public void getTest() {
        final Vector<Product> vector = productService.findAllProduct();
        int i = 0;
        while (i < 10) {
            Callable<Product> product1 = new Callable<Product>() {
                @Override
                public Product call() {
                    //Product product = vector.remove(0);
                    Product product = vector.remove(0);
                    System.out.println("product1 =========" + product);

                    /*Product newPro = new Product();

                    newPro.setPname("111");
                    newPro.setPprice(12.00);
                    newPro.setStock(44);*/

                    productService.save();

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return product;
                }
            };

            Callable<Product> product2 = new Callable<Product>() {
                @Override
                public Product call(){
                    //Product product = vector.remove(0);
                    Product product = vector.remove(0);
                    System.out.println("product2 =========" + product);

                    /*Product newPro = new Product();

                    newPro.setPname("111");
                    newPro.setPprice(12.00);
                    newPro.setStock(44);
                    productRepo.save(newPro);*/
                    productService.save();


                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return product;
                }
            };

            executorService.submit(product1);
            executorService.submit(product2);
            i++;
        }
    }
}
