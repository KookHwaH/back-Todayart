package com.artfactory.project01.todayart.service;


import com.artfactory.project01.todayart.entity.Product;
import com.artfactory.project01.todayart.model.ProductForm;
import com.artfactory.project01.todayart.model.Search;
import com.artfactory.project01.todayart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    // POST ===========================================


    // 상품 등록
    @Transactional
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }



    // GET ===========================================


    // 상품 전체 조회
    @Transactional(readOnly = true)
    public List<Product> listProduct() {
        return productRepository.findAll();
    }


    // 상품 상세 페이지
    @Transactional(readOnly = true)
    public Product listProductdetail(Integer product_id) {

        return productRepository.findById(product_id).get();
    }

    // 상품 이름 검색
    @Transactional(readOnly = true)
    public List<Product> listByProductName(Search search) {
        String product_name = search.getProduct_name();
        String temp = "%"+product_name+"%";
        product_name = temp;
        return productRepository.findByProduct_nameLike(product_name);
    }


    // PATCH ===========================================



    // 상품 정보 수정
    @Transactional
    public Product updateProduct(Integer id, ProductForm productForm) {

        Product product = productRepository.findById(id).get();
        productForm.setProduct(product);
        productRepository.updateDate(id);
        return productRepository.save(product);
    }



    // 상품 삭제(is_delete 변경)
    @Transactional
    public Product deleteProduct(Integer id, ProductForm productForm){

        Product product = productRepository.findById(id).get();
        productForm.setDelete(product);
        productRepository.deleteDate(id);
        return productRepository.save(product);

    }


    // DELETE ===========================================

    // 상품 삭제(DB에서 삭제됨)
    @Transactional
    public void deleteProductReal(Integer id) {
        productRepository.deleteById(id);
    }




}
