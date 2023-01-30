package com.iu.home.product;

public class ProductService {

	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductName("product1");
		productDTO.setProductDetail("detail1");
		
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();
		productOptionDTO.setOptionName("optionName1");
		productOptionDTO.setOptionPrice(100L);
		productOptionDTO.setOptionstock(10L);
		productOptionDTO.setProductNum(null);
		
		ProductOptionDTO productOptionDTO2 = new ProductOptionDTO();
		productOptionDTO2.setOptionName("optionName2");
		productOptionDTO2.setOptionPrice(200L);
		productOptionDTO2.setOptionstock(20L);
		productOptionDTO2.setProductNum(null);
	
		try {
			Long num = productDAO.getProductNum();
			productDTO.setProductNum(num);
			int result = productDAO.setaddProduct(productDTO);
			productOptionDTO.setProductNum(num);
			if(result>0){
				result = productDAO.setaddProductOption(productOptionDTO2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
