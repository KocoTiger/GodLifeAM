package com.godlife.io.service.product.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.Product;
import com.godlife.io.service.product.ProductDao;


//==> 회원관리 DAO CRUD 구현
@Repository("productDaoImpl")
public class ProductDaoImpl implements ProductDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public ProductDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method

	public void addProductCouponView(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductCouponView", product);		
	}
	public void addProductCoupon(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductCoupon", product);	
	}
	public void addProductCouponConfirm(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductCouponConfirm", product);
	}
	public void addProductCouponImg(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductCouponImg", product);
	}
	public void addProductVoucherView(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductVoucherView", product);
	}
	public void addProductVoucher(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductVoucher", product);
	}
	public void addProductVoucherConfirm(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductVoucherConfirm", product);
	}
	public void addProductVoucherImg(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductVoucherImg", product);
	}
	public void addProductPointView(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductPointView", product);	
	}
	public void addProductPoint(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductPoint", product);
	}
	public void addProductPointConfirm(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductPointConfirm", product);	
	}
	public void addProductPointImg(Product product) throws Exception {
		sqlSession.insert("ProductMapper.addProductPointImg", product);	
	}
	
//////////////////////////////////////////////////////
	
	public Product getProductCoupon(int productNo) throws Exception {
		return sqlSession.selectOne("ProductMapper.getProductCoupon", productNo);
	}
	public Product getProductVoucher(int productNo) throws Exception {
		return sqlSession.selectOne("ProductMapper.getProductVoucher", productNo);
	}
	public Product getProductPoint(int productNo) throws Exception {
		return sqlSession.selectOne("ProductMapper.getProductPoint", productNo);
	}
	
//////////////////////////////////////////////////////	
	
	public List<Product> getProductCouponList(Search search) throws Exception {
		return sqlSession.selectList("ProductMapper.getProductCouponList", search);
	}
	public List<Product> getProductVoucherList(Search search) throws Exception {
		return sqlSession.selectList("ProductMapper.getProductVoucherList", search);
	}
	public List<Product> getProductPointList(Search search) throws Exception {
		return sqlSession.selectList("ProductMapper.getProductPointList", search);
	}
//////////////////////////////////////////////////////	
	
	public void updateProductCouponImg(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductCouponImg", product);
	}
	public void updateProductCoupon(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductCoupon", product);
	}
	public void updateProductCouponConfirm(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductCouponConfirm", product);
	}
	public void updateProductVoucherImg(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductVoucherImg", product);
	}
	public void updateProductVoucher(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductVoucher", product);
	}
	public void updateProductVoucherConfirm(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductVoucherConfirm", product);
	}
	public void updateProductPointImg(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductPointImg", product);
	}
	public void updateProductPoint(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductPoint", product);
	}
	public void updateProductPointConfirm(Product product) throws Exception {
		sqlSession.update("ProductMapper.updateProductPointConfirm", product);
	}
//////////////////////////////////////////////////////	
	
	public void deleteProductCoupon(Product product) throws Exception {
		sqlSession.delete("ProductMapper.deleteProductCoupon", product);
	}
	public void deleteProductCouponConfirm(Product product) throws Exception {
		sqlSession.delete("ProductMapper.deleteProductCouponConfirm", product);
	}
	public void deleteProductVoucher(Product product) throws Exception {
		sqlSession.delete("ProductMapper.deleteProductVoucher", product);
	}
	public void deleteProductVoucherConfirm(Product product) throws Exception {
		sqlSession.delete("ProductMapper.deleteProductVoucherConfirm", product);
	}
	public void deleteProductPoint(Product product) throws Exception {
		sqlSession.delete("ProductMapper.deleteProductPoint", product);
	}
	public void deleteProductPointConfirm(Product product) throws Exception {
		sqlSession.delete("ProductMapper.deleteProductPointConfirm", product);
	}
//////////////////////////////////////////////////////	
	
	// 게시판 Page 처리를 위한 전체 Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("ProductMapper.getTotalCount", search);
	}
	
	
}