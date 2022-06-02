package com.godlife.io.service.product.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.Product;
import com.godlife.io.service.product.ProductDao;
import com.godlife.io.service.product.ProductService;



//==> 상품관리 서비스 구현
@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService{
		
	///Field
	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	///Constructor
	public ProductServiceImpl() {
		System.out.println(this.getClass());
	}

///////////////////////////////////////////	

	public void addProductCouponView(Product product) throws Exception {
		productDao.addProductCouponView(product);
	}
	public void addProductCoupon(Product product) throws Exception {
		productDao.addProductCoupon(product);
	}
	public void addProductCouponConfirm(Product product) throws Exception {
		productDao.addProductCouponConfirm(product);
	}
	public void addProductCouponImg(Product product) throws Exception {
		productDao.addProductCouponImg(product);
	}
	public void addProductVoucherView(Product product) throws Exception {
		productDao.addProductVoucherView(product);
	}
	public void addProductVoucher(Product product) throws Exception {
		productDao.addProductVoucher(product);
	}
	public void addProductVoucherConfirm(Product product) throws Exception {
		productDao.addProductVoucherConfirm(product);
	}
	public void addProductVoucherImg(Product product) throws Exception {
		productDao.addProductVoucherImg(product);
	}
	public void addProductPointView(Product product) throws Exception {
		productDao.addProductPointView(product);
	}
	public void addProductPoint(Product product) throws Exception {
		productDao.addProductPoint(product);
	}
	public void addProductPointConfirm(Product product) throws Exception {
		productDao.addProductPointConfirm(product);
	}
	public void addProductPointImg(Product product) throws Exception {
		productDao.addProductPointImg(product);
	}
///////////////////////////////////////////		
	public Product getProductCoupon(int productNo) throws Exception {
		return productDao.getProductCoupon(productNo);
	}
	public Product getProductVoucher(int productNo) throws Exception {
		return productDao.getProductVoucher(productNo);
	}
	public Product getProductPoint(int productNo) throws Exception {
		return productDao.getProductPoint(productNo);
	}
///////////////////////////////////////////		
	public Map<String , Object> getProductCouponList(Search search) throws Exception {
		List<Product> list= productDao.getProductCouponList(search);
		int totalCount = productDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}
	public Map<String , Object> getProductVoucherList(Search search) throws Exception {
		List<Product> list= productDao.getProductVoucherList(search);
		int totalCount = productDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}
	public Map<String , Object> getProductPointList(Search search) throws Exception {
		List<Product> list= productDao.getProductPointList(search);
		int totalCount = productDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}
///////////////////////////////////////////	
	public void updateProductCouponImg(Product product) throws Exception {
		productDao.updateProductCouponImg(product);
	}
	public void updateProductCoupon(Product product) throws Exception {
		productDao.updateProductCoupon(product);
	}
	public void updateProductCouponConfirm(Product product) throws Exception {
		productDao.updateProductCouponConfirm(product);
	}
	public void updateProductVoucherImg(Product product) throws Exception {
		productDao.updateProductVoucherImg(product);
	}
	public void updateProductVoucher(Product product) throws Exception {
		productDao.updateProductVoucher(product);
	}
	public void updateProductVoucherConfirm(Product product) throws Exception {
		productDao.updateProductVoucherConfirm(product);
	}
	public void updateProductPointImg(Product product) throws Exception {
		productDao.updateProductPointImg(product);
	}
	public void updateProductPoint(Product product) throws Exception {
		productDao.updateProductPoint(product);
	}
	public void updateProductPointConfirm(Product product) throws Exception {
		productDao.updateProductPointConfirm(product);
	}
///////////////////////////////////////////		
	public void deleteProductCoupon(Product product) throws Exception {
		productDao.deleteProductCoupon(product);
	}
	public void deleteProductCouponConfirm(Product product) throws Exception {
		productDao.deleteProductCouponConfirm(product);
	}
	public void deleteProductVoucher(Product product) throws Exception {
		productDao.deleteProductVoucher(product);
	}
	public void deleteProductVoucherConfirm(Product product) throws Exception {
		productDao.deleteProductVoucherConfirm(product);
	}
	public void deleteProductPoint(Product product) throws Exception {
		productDao.deleteProductPoint(product);
	}
	public void deleteProductPointConfirm(Product product) throws Exception {
		productDao.deleteProductPointConfirm(product);
	}
///////////////////////////////////////////	






}